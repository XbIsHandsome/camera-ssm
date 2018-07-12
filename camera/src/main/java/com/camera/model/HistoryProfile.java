package com.camera.model;

import java.io.Serializable;
import java.util.List;

import com.camera.util.TimeUtil;

public class HistoryProfile implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -681532414190919417L;

	//班级的主键ID
	private Integer cid;

	//课程的主键ID
	private Integer csid;
	
	//课程名称
	private String coursename;

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
	
	//第几周上课
	private Integer weekTime;
	
	//星期几上课
	private Integer weekday;
	

	/**
	 * 懒加载
	 * 查询实时监控时
	 * 一起查询改班级的所有的学生的实时信息
	 * 一并返回
	 */
	private List<ClassDetail> students;

	/**
	 * 获取班级的主键ID
	 * @return
	 */
	public Integer getCid() {
		return cid;
	}

	/**
	 * 根据传入的字符串设定班级主键ID
	 * @param cid
	 */
	public void setCid(Integer cid) {
		this.cid = cid;
	}

	/**
	 * 获取课程的主键ID
	 * @return
	 */
	public Integer getCsid() {
		return csid;
	}

	/**
	 * 根据传入的数字设定课程的主键ID
	 * @param csid
	 */
	public void setCsid(Integer csid) {
		this.csid = csid;
	}

	/**
	 * 获取班级的年级信息，如：2015、2016
	 * @return
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * 根据传入字符串设定班级的年级信息
	 * @param grade
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * 获得班级的简化名称，如：计科（计算机科学与技术）
	 * @return
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * 根据传入字符串设定班级的简化名称
	 * @param className
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * 获得当前班级的班级号，如：一班
	 * @return
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * 根据传入字符串设定班级号
	 * @param number
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * 获取当前班级的应到人数
	 * @return
	 */
	public Integer getNum() {
		return num;
	}

	/**
	 * 根据传入参数设定班级的应到人数
	 * @param num
	 */
	public void setNum(Integer num) {
		this.num = num;
	}

	/**
	 * 获取班级的实际到课人数
	 * @return
	 */
	public Integer getActualNum() {
		return actualNum;
	}

	/**
	 * 根据传入参数设定班级的实际到课人数
	 * @param actualNum
	 */
	public void setActualNum(Integer actualNum) {
		this.actualNum = actualNum;
	}

	/**
	 * 获取班级该节课的上课地点
	 * @return
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * 根据传入字符串设定上课地址
	 * @param place
	 */
	public void setPlace(String place) {
		this.place = place;
	}

	/**
	 * 获得课程上课时间
	 * @return
	 */
	public String getTime() {
		return time;
	}

	/**
	 * 设定课程上课时间，并使用工具类将数字转为字符串。如：1==“第一节课”
	 * @param time
	 */
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


	/**
	 * 获得课程名称
	 * @return
	 */
	public String getCoursename() {
		return coursename;
	}

	/**
	 * 根据传入的字符串设定课程名称
	 * @param coursename
	 */
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	/**
	 * 获取第几周信息
	 * @return
	 */
	public Integer getWeekTime() {
		return weekTime;
	}

	/**
	 * 根据传入参数设定第几周
	 * @param weelTime
	 */
	public void setWeekTime(Integer weekTime) {
		this.weekTime = weekTime;
	}
	
	/**
	 * 获取当前星期几
	 * @return
	 */
	public Integer getWeekday() {
		return weekday;
	}

	/**
	 * 根据传入参数设定星期几
	 * @param weekday
	 */
	public void setWeekday(Integer weekday) {
		this.weekday = weekday;
	}

}
