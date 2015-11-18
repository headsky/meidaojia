package com.hs.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.hs.Application;

public class HSSqlSessionFactory {
	private static SqlSession sqlSession;
	
	private HSSqlSessionFactory(){
	}
	
	public static SqlSession getSqlSession(){
		if(sqlSession==null){
			SqlSessionFactory sqlSessionFactory = (SqlSessionFactory)(Application.getApplication().getBean("sqlSessionFactory"));
			return sqlSessionFactory.openSession();
		}else{
			return sqlSession;
		}
	}
}
