package com.smmall.mapper;

import java.util.List;

import com.smmall.entity.ResFormMap;
import com.smmall.mapper.base.BaseMapper;
/** 
 * 
 * @author liuyaliu 2015-11-14
 * 
 */
public interface ResourcesMapper extends BaseMapper {
	public List<ResFormMap> findChildlists(ResFormMap map);

	public List<ResFormMap> findRes(ResFormMap map);

	public void updateSortOrder(List<ResFormMap> map);
	
	public List<ResFormMap> findUserResourcess(String userId);
	
	//ekko 2015年10月27日11:00:55
	public List<ResFormMap> findRoleResourcess(String roleId);
	
}
