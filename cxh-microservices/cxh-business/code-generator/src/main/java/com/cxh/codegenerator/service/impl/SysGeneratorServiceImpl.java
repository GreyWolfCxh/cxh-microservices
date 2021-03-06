package com.cxh.codegenerator.service.impl;

import cn.hutool.db.PageResult;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.cxh.codegenerator.mapper.SysGeneratorMapper;
import com.cxh.codegenerator.service.SysGeneratorService;
import com.cxh.codegenerator.utils.GenUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipOutputStream;

/**
 * @Author zlt
 */
@Slf4j
@Service
public class SysGeneratorServiceImpl extends ServiceImpl implements SysGeneratorService {
    @Autowired
    private SysGeneratorMapper sysGeneratorMapper;

    @Override
    public PageResult<Map<String, Object>> queryList(Map<String, Object> map) {
        Page<Map<String, Object>> page = new Page<>(MapUtils.getInteger(map, "page"), MapUtils.getInteger(map, "limit"));

        List<Map<String, Object>> list = sysGeneratorMapper.queryList(page, map);
        PageResult result = new PageResult(MapUtils.getInteger(map, "page"), MapUtils.getInteger(map, "limit"), (int)page.getTotal() );
        return result;
        //return PageResult.data(list).code(0).count(page.getTotal()).build();
    }

    @Override
    public Map<String, String> queryTable(String tableName) {
        return sysGeneratorMapper.queryTable(tableName);
    }

    @Override
    public List<Map<String, String>> queryColumns(String tableName) {
        return sysGeneratorMapper.queryColumns(tableName);
    }

    @Override
    public byte[] generatorCode(String[] tableNames) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try (
                ZipOutputStream zip = new ZipOutputStream(outputStream)
        ) {
            for (String tableName : tableNames) {
                //???????????????
                Map<String, String> table = queryTable(tableName);
                //???????????????
                List<Map<String, String>> columns = queryColumns(tableName);
                //????????????
                GenUtils.generatorCode(table, columns, zip);
            }
        } catch (IOException e) {
            log.error("generatorCode-error: ", e);
        }
        return outputStream.toByteArray();
    }
}
