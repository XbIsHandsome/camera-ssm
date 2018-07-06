package com.camera.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.camera.dao.StuclassMapper;
import com.camera.model.SycrohProfile;
import com.camera.util.TimeUtil;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class ClassTest {

	@Autowired
	private StuclassMapper stuClassMapper;
	
	@Test
	public void test() {
		
		SycrohProfile profile = stuClassMapper.selectOneClass(15, 1, 1);
		System.out.println(JSON.toJSON(profile));
		System.out.println(TimeUtil.countCurrentDayWeek());
		
	}

}
