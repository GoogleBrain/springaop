package com.itmayiedu.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.itmayiedu.entity.UserEntity;
public interface UserMapper {

	@Select(" SELECT  * FROM user_info where userName=#{userName} and password=#{password}")
	public UserEntity login(UserEntity userEntity);

	@Insert("insert user_info values (null,#{userName},#{password})")
	public int insertUser(UserEntity userEntity);
}
