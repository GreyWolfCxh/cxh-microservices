package com.cxh.filecenter.service.impl;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cxh.cxhossspringbootstarter.model.ObjectInfo;
import com.cxh.cxhossspringbootstarter.properties.FileServerProperties;
import com.cxh.cxhossspringbootstarter.template.FdfsTemplate;
import com.cxh.filecenter.model.FileInfo;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;

/**
 * @author zlt
 * @date 2021/2/13
 * <p>
 * Blog: https://zlt2000.gitee.io
 * Github: https://github.com/zlt2000
 */
//@Service
@ConditionalOnProperty(prefix = com.cxh.cxhossspringbootstarter.properties.FileServerProperties.PREFIX, name = "type", havingValue = FileServerProperties.TYPE_FDFS)
public class FastdfsService extends AbstractIFileService {
    @Resource
    private FdfsTemplate fdfsTemplate;

    @Override
    protected String fileType() {
        return FileServerProperties.TYPE_FDFS;
    }

    @Override
    protected ObjectInfo uploadFile(MultipartFile file) {
        return fdfsTemplate.upload(file);
    }

    @Override
    protected void deleteFile(String objectPath) {
        fdfsTemplate.delete(objectPath);
    }

    @Override
    public void out(String id, OutputStream os) {
    }

    @Override
    public List<FileInfo> findAll() {
        return null;
    }


  /*  @Override
    public List<FileInfo> findAll() {
        Page<FileInfo> page = new Page<>(0, 10);
        List<FileInfo> list = baseMapper.findList(page, new HashMap<>());
        return list;
    }*/

}
