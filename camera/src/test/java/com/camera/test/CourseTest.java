package com.camera.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.camera.dao.CourseMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class CourseTest {

	@Autowired
	private CourseMapper courseMapper;
	
	Logger logger = Logger.getLogger(CourseTest.class);
	
	@Test
	public void test() {

		logger.info(courseMapper.isRepeatedByCoursename("软件工程"));
	
	}
	
	@Test
	public void test2() {

		logger.info(courseMapper.isRepeatedByCoursenameAndCid("软件工程", 1));
	
	}

}
