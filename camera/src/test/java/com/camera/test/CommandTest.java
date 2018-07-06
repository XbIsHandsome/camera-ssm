package com.camera.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.camera.util.SendCommand;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class CommandTest {

	@Test
	public void test() {

		SendCommand command = new SendCommand();
		command.testOneClass();
	
	}

}
