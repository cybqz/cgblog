package com.cyb.blog.service.impl;

import java.util.List;
import java.util.Set;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.cyb.blog.dao.UserMapper;
import com.cyb.blog.domain.User;
import com.cyb.blog.domain.UserExample;
import com.cyb.blog.service.UserServices;
import com.cyb.blog.utils.MyStringUtils;

@Service(value="userSerivces")
public class UserServicesImpl implements UserServices {
	
	@Resource
	private UserMapper userMapper;

	public long countByExample(UserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteByExample(UserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(User record, String basePath) {
		String password = MyStringUtils.encryptionMD5(record.getPassword());
		record.setPassword(password);
		Integer sex = record.getSex();
		String image = "/headportrait/";
		if(sex == 0) {
			image += "gril.png";
		}else {
			image += "boy.png";
		}
		record.setImage(image);
		return userMapper.insert(record);
	}

	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<User> selectByExample(UserExample example) {
		return userMapper.selectByExample(example);
	}

	public User selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByExampleSelective(User record, UserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByExample(User record, UserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Set<String> queryRolesByName(String userName) {
		return userMapper.queryRolesByName(userName);
	}
}
