package cn.spring.dao;

import org.apache.ibatis.annotations.Param;

import cn.spring.entity.User;

public interface UserMapper {
	public User getUserById(@Param("id") Integer id);
}
