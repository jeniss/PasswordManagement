package com.pms.mapper;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;

/**
 * @author Jeniss 2014-5-16 上午10:06:50
 * @tags 
 */
public class BaseMapper implements IBaseMapper{
	@Resource(name="sqlSession")
	private SqlSession sqlSession;
	
	@Override
	public SqlSession getSqlSession() {
		return sqlSession;
	}

}
