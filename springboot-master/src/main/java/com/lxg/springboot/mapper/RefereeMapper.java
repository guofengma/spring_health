package com.lxg.springboot.mapper;

import org.apache.ibatis.annotations.Param;

public interface RefereeMapper {
	
	int save(@Param("openid")String openid, @Param("referee")String referee);
	
	String updatereferee(String openid);
	
	String queryreferee(String openid);
	
	int count(@Param("openid")String openid, @Param("referee")String referee);
	
	int refereecount(String openid);
	
}