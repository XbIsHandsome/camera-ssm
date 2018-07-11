package com.camera.model;

import java.io.Serializable;

/**
 * 构建实时监控时，点击班级详情页的，学生的详细信息。
 * 包括学生的联系方式，以及学生的上课状态
 * @author 许兵
 *
 */
public class ClassDetail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 311895337208194107L;

	//数据库主键ID
	private Integer sid;
	
	//该生的名字
	private String studentname;
	
	//该生的学号
	private String studentid;

	//该生的联系电话
    private Long phone;

    //班级编号
    private Integer cid;
    
    //上课状态，0：为正常到课，1：为迟到，2：为旷课
    private Integer state;
    
	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}


    
}
