package com.smmall.mapper;

import java.util.List;

import com.smmall.entity.RoleFormMap;
import com.smmall.mapper.base.BaseMapper;

public interface RoleMapper extends BaseMapper{
	public List<RoleFormMap> seletUserRole(RoleFormMap map);
	
	public void deleteById(RoleFormMap map);
}
