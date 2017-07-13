package com.demo.school_app.entiy;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import io.swagger.annotations.ApiModel;

@ApiModel
@TableName("student")
public class Student extends Model<Student>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@TableId("id")
	private Long id;
	
	@TableField("classes_id")
	private String classesId;
	
	@TableField("student_name")
	private String studentName;
	
	@TableField("student_no")
	private String studentNo; 
	
	@TableField("create_time")
	private Date createTime; 
	
	
	@Override
	protected Serializable pkVal() { 
		return this.id;
	}



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

	
}
