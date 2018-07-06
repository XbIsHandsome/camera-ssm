package com.camera.test;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.camera.dao.StudentMapper;
import com.camera.model.ClassDetail;
import com.camera.model.Model;
import com.camera.model.Student;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class StudentTest {

	@Resource
	private StudentMapper studentMapper;
	Logger logger = Logger.getLogger(SycrohTest.class);
	
	@Test
	public void test() {
		List<ClassDetail> list = this.studentMapper.selectStudentByCid(1);
		for (ClassDetail student : list) {
			logger.info(JSON.toJSON(student));
		}
		
	}
	
	@Test
	public void Test2(){
		List<Student> list = studentMapper.selectStudentModelByCid(1);
		
		for (Student student : list) {
			logger.info(student);
			Model model = student.getModel();
			logger.info(model);
		}
	
	}

}
