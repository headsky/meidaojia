package com.hs.dao;

import org.apache.ibatis.session.SqlSession;

public class HSDao {
	protected SqlSession sqlSession;
	
	public HSDao(){
		sqlSession = HSSqlSessionFactory.getSqlSession();
	}
}
