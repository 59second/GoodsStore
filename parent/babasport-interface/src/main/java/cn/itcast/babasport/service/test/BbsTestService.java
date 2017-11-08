package cn.itcast.babasport.service.test;

import java.util.List;

import cn.itcast.babasport.pojo.BbsTest;

public interface BbsTestService {
	
	public void insertBbsTest(BbsTest bbsTest);
	
	public List<BbsTest> selectBbsTest();
}
