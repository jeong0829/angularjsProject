package kr.co.tisoft.index.controller;

import java.util.HashMap;
import java.util.Map;

import kr.co.tisoft.index.service.IndexService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	@Autowired
	private IndexService indexService;

	@RequestMapping("/")
	public String index(){
		
		return "index";
	}
	
	@RequestMapping("/view1")
	@ResponseBody
	public Map<String, Object> view1(){
		
		System.out.println("===============view1 Controller start1");
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		resultMap.put("data", "ihihihihihi");
		
		System.out.println("===============view1 Controller end");
		
		return resultMap;
		
	}
	
	@RequestMapping("/view1/{type}")
	@ResponseBody
	public int ddlView1(@RequestBody Map<String, Object> paramMap,
			@PathVariable String type) throws Exception{
		
		System.out.println("=============paramMap : "+paramMap+",id : "+paramMap.get("id")); 
		
		int result = 0;
		
		if(type.equals("POST")){
			result = indexService.insertUser(paramMap);
		}
		
		return result;
		
	}
}
