package com.cxh.usercenter.service;



import com.cxh.cxhcommoncore.model.SysMenu;
import com.cxh.cxhcommoncore.service.ISuperService;
import com.cxh.usercenter.model.SysRoleMenu;

import java.util.List;
import java.util.Set;

/**
 * @author zlt
 */
public interface ISysRoleMenuService extends ISuperService<SysRoleMenu> {
	int save(Long roleId, Long menuId);

	int delete(Long roleId, Long menuId);

	List<SysMenu> findMenusByRoleIds(Set<Long> roleIds, Integer type);

	List<SysMenu> findMenusByRoleCodes(Set<String> roleCodes, Integer type);
}
