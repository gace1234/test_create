package cn.iteast.ssm.dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.iteast.ssm.po.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{
	
	public User findUserById(int id) throws Exception {
		// TODO Auto-generated method stub
		SqlSession sqlSession=this.getSqlSession();
		User user=sqlSession.selectOne("test.findUserById", id);
		return user;
	}

	
}
