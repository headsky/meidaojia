package com.hs.dao;

import org.apache.ibatis.session.SqlSession;

import com.hs.model.User;

public class UserDaoImpl {
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
	    this.sqlSession = sqlSession;
	  }

	  public User insertUser(String userId) {
	    return (User) sqlSession.selectOne("com.hs.mappers.UserMapper.insertUser", userId);
	  }
}
