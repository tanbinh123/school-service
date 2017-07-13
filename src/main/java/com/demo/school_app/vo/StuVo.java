package com.demo.school_app.vo;

import java.io.Serializable;
import java.util.Date;
 

public class StuVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
    private Long id;
	 
	private String classesId;
	 
	private String studentName;
	 
	private String studentNo; 
	 
	private Date createTime; 
	
	private String className;
	
	private String masterName;
	
	private String gradge;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClassesId() {
		return classesId;
	}

	public void setClassesId(String classesId) {
		this.classesId = classesId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMasterName() {
		return masterName;
	}

	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}

	public String getGradge() {
		return gradge;
	}

	public void setGradge(String gradge) {
		this.gradge = gradge;
	}
	
	
}
