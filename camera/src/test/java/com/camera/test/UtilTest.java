package com.camera.test;

import org.junit.Test;

import com.camera.util.TimeUtil;
public class UtilTest {

	
	
	@Test
	public void test() {
		System.out.println("当前是第" + 
				TimeUtil.countCurrentDayWeek() + "周");
		System.out.println("当前是第" + 
				TimeUtil.countCurrentCourseTime() + "节课");
	
	}

}
