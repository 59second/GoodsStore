package babasport;

import static org.junit.Assert.*;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.babasport.mapper.test.BbsTestMapper;
import cn.itcast.babasport.pojo.BbsTest;
import cn.itcast.babasport.service.test.BbsTestService;

@ContextConfiguration(locations={"classpath:spring-config.xml"})
@RunWith(value = SpringJUnit4ClassRunner.class)
public class TestBbs {
	@Resource
	private BbsTestMapper bbsTestMapper;
	
	@Resource
	private BbsTestService bbsTestService;
	
	@Test
	public void testInsertUser(){
		BbsTest bbsTest = new BbsTest();
		bbsTest.setBirthday(new Date());
		bbsTest.setName("zhangsan");
		bbsTestMapper.insertBbsTest(bbsTest);
	}
	
	@Test
	public void testSpring() throws Exception {
		BbsTest bbsTest = new BbsTest();
		bbsTest.setBirthday(new Date());
		bbsTest.setName("liu");
		bbsTestService.insertBbsTest(bbsTest);
		
	}
}
