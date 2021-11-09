package com.cxh.usercenter.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.cxh.cxhcommoncore.model.SysRole;
import com.cxh.cxhdbspringbootstarter.mapper.SuperMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
* @author zlt
 * 角色
 */
@Mapper
public interface SysRoleMapper extends SuperMapper<SysRole> {
	List<SysRole> findList(Page<SysRole> page, @Param("r") Map<String, Object> params);

	List<SysRole> findAll();
}
