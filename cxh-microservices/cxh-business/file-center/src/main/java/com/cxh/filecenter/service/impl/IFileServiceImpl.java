package com.cxh.filecenter.service.impl;

import cn.hutool.db.PageResult;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cxh.cxhcommoncore.model.SysMenu;
import com.cxh.cxhcommoncore.service.impl.SuperServiceImpl;
import com.cxh.filecenter.mapper.FileMapper;
import com.cxh.filecenter.model.FileInfo;
import com.cxh.filecenter.service.IFileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * @author ChenXihua
 * @description
 * @date 2021/11/11 17:02
 */
@Service
public class IFileServiceImpl extends SuperServiceImpl<FileMapper, FileInfo>  implements IFileService {

    @Resource
    private FileMapper fileMapper;

    @Override
    public FileInfo upload(MultipartFile file) throws Exception {
        return null;
    }

    @Override
    public PageResult<FileInfo> findList(Map<String, Object> params) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void out(String id, OutputStream os) {

    }

    @Override
    public List<FileInfo> findAll() {
        return fileMapper.findAll();
    }
}
