package com.cxh.filecenter.service;

import cn.hutool.db.PageResult;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cxh.filecenter.model.FileInfo;
import org.springframework.web.multipart.MultipartFile;

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

/**
 * 文件service
 *
 * @author 作者 owen E-mail: 624191343@qq.com
*/
public interface IFileService extends IService<FileInfo> {
	FileInfo upload(MultipartFile file ) throws Exception;

	PageResult<FileInfo> findList(Map<String, Object> params);

	void delete(String id);

	void out(String id, OutputStream os);

	List<FileInfo> findAll();
}
