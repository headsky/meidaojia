package com.hs.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.hs.model.User;


public class UserDao extends HSDao{
	public List<User> getUser(){
		return sqlSession.selectList("com.hs.mappers.UserMapper.getUser");
	}
	
	public void insertUser(User user){
		Connection con = this.sqlSession.getConnection();
		boolean autoCommit;
		try {
			autoCommit = con.getAutoCommit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.sqlSession.insert("com.hs.mappers.UserMapper.insertUser", user);
	}
	
	public void updateUser(User user){
		Connection con = this.sqlSession.getConnection();
		this.sqlSession.update("com.hs.mappers.UserMapper.updateUser", user);
	}
}
