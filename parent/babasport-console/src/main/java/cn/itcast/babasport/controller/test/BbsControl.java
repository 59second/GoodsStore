package cn.itcast.babasport.controller.test;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.babasport.pojo.BbsTest;
import cn.itcast.babasport.service.test.BbsTestService;

@Controller
public class BbsControl {
	/**
	 * 测试springmvc 是否配置成功
	 * @return
	 */
	@Resource          
	private BbsTestService  bbsTestService;
	
	@RequestMapping("/to.do")
	public String test(){
		
		return "test";
	}
	
	@RequestMapping("testTb.do")
	public String testTb(){
		List<BbsTest> list = bbsTestService.selectBbsTest();
		System.out.println(list.size());
		return "test";
	}
	
}
