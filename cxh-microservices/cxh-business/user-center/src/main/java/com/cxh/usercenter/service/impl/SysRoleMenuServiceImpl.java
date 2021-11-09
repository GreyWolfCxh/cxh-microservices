package com.cxh.usercenter.service.impl;


import com.cxh.cxhcommoncore.model.SysMenu;
import com.cxh.cxhcommoncore.service.impl.SuperServiceImpl;
import com.cxh.usercenter.mapper.SysRoleMenuMapper;
import com.cxh.usercenter.model.SysRoleMenu;
import com.cxh.usercenter.service.ISysRoleMenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

/**
 * @author zlt
 */
@Slf4j
@Service
public class SysRoleMenuServiceImpl extends SuperServiceImpl<SysRoleMenuMapper, SysRoleMenu> implements ISysRoleMenuService {
 	@Resource
	private SysRoleMenuMapper sysRoleMenuMapper;

	@Override
	public int save(Long roleId, Long menuId) {
		return sysRoleMenuMapper.save(roleId, menuId);
	}

	@Override
	public int delete(Long roleId, Long menuId) {
		return sysRoleMenuMapper.delete(roleId, menuId);
	}

	@Override
	public List<SysMenu> findMenusByRoleIds(Set<Long> roleIds, Integer type) {
		return sysRoleMenuMapper.findMenusByRoleIds(roleIds, type);
	}

	@Override
	public List<SysMenu> findMenusByRoleCodes(Set<String> roleCodes, Integer type) {
		return sysRoleMenuMapper.findMenusByRoleCodes(roleCodes, type);
	}
}
