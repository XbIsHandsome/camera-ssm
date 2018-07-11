package com.camera.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.camera.dao.ClassCourseMapper;
import com.camera.model.ClassCourse;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class ClassCourseTest {

	@Autowired
	private ClassCourseMapper classCourseMapper;
	
	private Logger logger = Logger.getLogger(ClassCourseTest.class);
	
	@Test
	public void test() {
		
		
		List<ClassCourse> list = this.classCourseMapper.listall();
		for (ClassCourse classCourse : list) {
			logger.info(JSON.toJSON(classCourse));
		}
		
		
		
	}

}
