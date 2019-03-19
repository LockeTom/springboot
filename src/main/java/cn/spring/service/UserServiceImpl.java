package cn.spring.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.spring.dao.UserMapper;
import cn.spring.entity.User;

@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;

	@Override
	public User getUserById(Integer id) {
		return userMapper.getUserById(id);
	}

}
