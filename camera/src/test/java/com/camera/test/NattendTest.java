package com.camera.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.camera.dao.NattendMapper;
import com.camera.model.Nattend;
import com.camera.util.TimeUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class NattendTest {

	@Autowired
	private NattendMapper nattendMapper;
	
	
	@Test
	public void test() {

		Nattend nattend = new Nattend();
		nattend.setTime(new Date());
		nattend.setSid(1);
		nattend.setCid(1);
		nattend.setState(2);
		nattend.setCsid(1);
		nattend.setSemester("第一学期");
		nattend.setWeek(TimeUtil.countCurrentDayWeek());
		nattend.setCourseTime(TimeUtil.countCurrentCourseTime());
		nattendMapper.insert(nattend);
		
	}
	
	@Test
	public void test2(){
		
		
		Integer selectIsLate = this.nattendMapper.selectIsLate(15, 2, 1, 2);
		System.out.println(selectIsLate);
		
		
	}

}
