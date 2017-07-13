package com.demo.school_app.entiy;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import io.swagger.annotations.ApiModel;

/**
 * 学生实体类
 * 
 * @author Davis
 * @date 2017年6月8日 上午9:03:06
 */
@ApiModel(description = "班级（classes）")
@TableName("classes")
public class Classes extends Model<Classes>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@TableId("id")
	private Long id;
	
	@TableField("class_no")
	private String classNo;
	
	@TableField("class_name")
	private String className;
	
	@TableField("master_name")
	private String masterName;
	
	private String message;
	
	private String gradge;
	
	@TableField("create_time")
	private Date createTime;
	
	 
	
	public Long getId() {
		return id;
	}
  
	public void setId(Long id) {
		this.id = id;
	}

	public String getClassNo() {
		return classNo;
	}
 
	public void setClassNo(String classNo) {
		this.classNo = classNo;
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
  
	public String getMessage() {
		return message;
	}
  
	public void setMessage(String message) {
		this.message = message;
	}
 
	public String getGradge() {
		return gradge;
	}
 
	public void setGradge(String gradge) {
		this.gradge = gradge;
	}
  
	public Date getCreateTime() {
		return createTime;
	}
   
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
 
	@Override
	protected Serializable pkVal() { 
		return this.id;
	}

}
