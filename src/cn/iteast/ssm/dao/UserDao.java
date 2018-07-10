package cn.iteast.ssm.dao;

import cn.iteast.ssm.po.User;

public interface UserDao {
	public User findUserById(int id) throws Exception;
	
}
