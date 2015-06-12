package kr.co.tisoft.index.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index(){
		
		return "index";
	}
	
	@RequestMapping("/view1")
	@ResponseBody
	public Map<String, Object> view1(){
		
		System.out.println("===============view1 Controller start");
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		resultMap.put("data", "ihihihihihi");
		
		System.out.println("===============view1 Controller end");
		
		return resultMap;
		
	}
}
