package com.camera.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.camera.dao.CourseMapper;
import com.camera.dao.StuclassMapper;
import com.camera.model.Stuclass;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class CourseTest {

	@Autowired
	private CourseMapper courseMapper;
	
	@Autowired
	private StuclassMapper stuclassMapper;
	
	Logger logger = Logger.getLogger(CourseTest.class);
	
	@Test
	public void test() {

		logger.info(courseMapper.isRepeatedByCoursename("软件工程"));
	
	}
	
	@Test
	public void test2() {

		logger.info(courseMapper.isRepeatedByCoursenameAndCid("软件工程", 1));
	
	}
	
	@Test
	public void test3(){
		List<Stuclass> listStuclass = stuclassMapper.selectClassName();
		Map<Integer,String> listClassNames = new HashMap<>();
		StringBuilder sb = null;
		for (Stuclass stuclass : listStuclass) {
			sb = new StringBuilder();
			sb.append(stuclass.getGrade()).append(stuclass.getClassName()).append(stuclass.getNumber());
			listClassNames.put(stuclass.getCid(), sb.toString());
		}
		logger.info(JSON.toJSON(listClassNames));
	}

}
