package kr.co.tisoft.index.dao;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class IndexDao {

	@Autowired
	@Resource(name="sqlSession")
	private SqlSession sqlSession;
	
	public int insertUser(Map<String, Object> paramMap) throws Exception{
		
		System.out.println("=================dao");
		
		return sqlSession.insert("indexMap.insertUser", paramMap);
	}
}
