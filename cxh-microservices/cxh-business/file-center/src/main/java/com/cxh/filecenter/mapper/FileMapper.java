package com.cxh.filecenter.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cxh.cxhdbspringbootstarter.mapper.SuperMapper;
import com.cxh.filecenter.model.FileInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 上传存储db
 *
 * @author zlt
 */
@Mapper
public interface FileMapper extends SuperMapper<FileInfo> {
    List<FileInfo> findList(Page<FileInfo> page, @Param("f") Map<String, Object> params);

    List<FileInfo> findAll();
}
