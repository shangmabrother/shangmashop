package com.smmall.mapper;

import java.util.List;

import com.smmall.entity.UserFormMap;
import com.smmall.mapper.base.BaseMapper;


public interface UserMapper extends BaseMapper{

	public List<UserFormMap> findUserPage(UserFormMap userFormMap);
	
}
