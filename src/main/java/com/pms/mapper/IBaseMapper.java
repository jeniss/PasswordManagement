package com.pms.mapper;

import org.apache.ibatis.session.SqlSession;

/**
 * @author Jeniss 2014-5-16 上午10:02:52
 * @tags 
 */
public interface IBaseMapper {
	SqlSession getSqlSession();
}
