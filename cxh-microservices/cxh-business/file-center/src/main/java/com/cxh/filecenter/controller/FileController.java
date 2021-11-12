package com.cxh.filecenter.controller;


import cn.hutool.db.PageResult;
import com.cxh.cxhcommoncore.model.Result;
import com.cxh.filecenter.model.FileInfo;
import com.cxh.filecenter.service.IFileService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 文件上传
 *
 * @author 作者 owen E-mail: 624191343@qq.com
 */
@RestController
public class FileController {
    @Resource
    private IFileService fileService;

    /**
     * 文件上传
     * 根据fileType选择上传方式
     *
     * @param file
     * @return
     * @throws Exception
     */
    @PostMapping("/files-anon")
    public FileInfo upload(@RequestParam("file") MultipartFile file) throws Exception {
        return fileService.upload(file);
    }

    /**
     * 文件删除
     *
     * @param id
     */
    @DeleteMapping("/files/{id}")
    public Result delete(@PathVariable String id) {
        try {
            fileService.delete(id);
            return Result.succeed("操作成功");
        } catch (Exception ex) {
            return Result.failed("操作失败");
        }
    }

    /**
     * 文件查询
     *
     * @param params
     * @return
     */
    @GetMapping("/files")
    public PageResult<FileInfo> findFiles(@RequestParam Map<String, Object> params) {
        return fileService.findList(params);
    }

    @ApiOperation(value = "查询所有文件")
    @GetMapping("/findAll")
    public List<FileInfo> findAll() {
        return fileService.findAll();
    }

    public int[] twoSum (int[] numbers, int target) {
        // write code here
        int len = numbers.length;
        for(int i = 0; i < len; i++){
            for(int j = i + 1; j < len; j++){
                int sum = numbers[i] + numbers[j];
                if(sum == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[2];
    }
}
