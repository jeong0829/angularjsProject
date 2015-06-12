package kr.co.tisoft.index.service;

import java.util.Map;

import kr.co.tisoft.index.dao.IndexDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexService {

	@Autowired
	private IndexDao indexDao;

	public int insertUser(Map<String, Object> paramMap) throws Exception{
		
		int result = 0;
		
		System.out.println("===========service");
		
		result = indexDao.insertUser(paramMap);
		
		return result;
	}
	
}
