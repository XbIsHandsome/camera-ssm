package com.camera.model;

import java.io.Serializable;
import java.util.List;

import com.camera.util.TimeUtil;
/**
 * 实时监控时班级显示信息
 * @author 许兵
 *
 */
public class SycrohProfile implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3589731657965755790L;
	
	//班级的主键ID
	private Integer cid;
	
	//课程的主键ID
	private Integer csid;
	
	//年级
	private String grade;
	
	//班级简称
	//如：计科、软工
	private String className;
	
	//几班，如：一班，二班
	private String number;
	
	//班级应到人数
	private Integer num;
	
	//班级实际到达人数
	private Integer actualNum;
	
	//上课地点
    private String place;
	
    //上课时间
    private String time;
    
    //
    private String semester;
	
	/**
	 * 懒加载
	 * 查询实时监控时
	 * 一起查询改班级的所有的学生的实时信息
	 * 一并返回
	 */
	private List<ClassDetail> students;
	
	public Integer getCid() {
		return cid;
	}
	
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	
	public Integer getCsid() {
		return csid;
	}
	
	public void setCsid(Integer csid) {
		this.csid = csid;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Integer getNum() {
		return num;
	}
	
	public void setNum(Integer num) {
		this.num = num;
	}
	
	public Integer getActualNum() {
		return actualNum;
	}
	
	public void setActualNum(Integer actualNum) {
		this.actualNum = actualNum;
	}
	
	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		try {
			int temp = Integer.parseInt(time);
			this.time = TimeUtil.turnString(temp);
		} catch (Exception e) {
			this.time = time;
		}
	}

	public List<ClassDetail> getStudents() {
		return students;
	}

	public void setStudents(List<ClassDetail> students) {
		this.students = students;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}
}
