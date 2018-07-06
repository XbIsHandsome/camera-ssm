package com.camera.test;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.camera.model.ClassDetail;
import com.camera.model.SycrohProfile;
import com.camera.service.SycrohService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class SycrohTest {

	@Resource
	private SycrohService sycrohServce;
	Logger logger = Logger.getLogger(SycrohTest.class);
	
	/**
	 * 测试
	 * 查询实时班级信息，当前正有课的班级信息
	 */
	@Test
	public void test() {
		List<SycrohProfile> list = sycrohServce.showall();
		for (SycrohProfile sycrohProfile : list) {
			logger.info(JSON.toJSON(sycrohProfile));
		}
	
	}
	/** 
	 * 测试
	 * 根据cid查询该班级的学生详细信息
	 */
	@Test
	public void test2() {
		List<ClassDetail> list = sycrohServce.showdetail(1);
		for(ClassDetail detail : list) {
			logger.info(JSON.toJSON(detail));
		}
	
	}

}
