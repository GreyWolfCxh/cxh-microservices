package com.cxh.codegenerator.controller;

import cn.hutool.db.PageResult;
import com.cxh.codegenerator.service.SysGeneratorService;
import io.swagger.annotations.Api;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @Author: zlt
 */
@RestController
@Api(tags = "代码生成器")
@RequestMapping("/generator")
public class SysGeneratorController {
    @Autowired
    private SysGeneratorService sysGeneratorService;

    /**
     * 列表
     */
    @ResponseBody
    @GetMapping("/list")
    public PageResult getTableList(@RequestParam Map<String, Object> params) {
        return sysGeneratorService.queryList(params);
    }

    /**
     * 生成代码FileUtil
     */
    @GetMapping("/code")
    public void makeCode(String tables, HttpServletResponse response) throws IOException {
        byte[] data = sysGeneratorService.generatorCode(tables.split(","));
        response.reset();
        response.setHeader("Content-Disposition", "attachment; filename=\"generator.zip\"");
        response.addHeader("Content-Length", "" + data.length);
        response.setContentType("application/octet-stream; charset=UTF-8");
        IOUtils.write(data, response.getOutputStream());
    }
}
