package cn.iteast.ssm.mapper;
import cn.iteast.ssm.po.User;
public interface UserMapper {
	
	public User findUserById(int id) throws Exception;	
}
