package com.demo.school_app.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.baomidou.mybatisplus.service.IService;
import com.demo.school_app.entiy.Student;

public interface StudentService extends IService<Student>{
	
	/**
	 * 获取学生列表
	 * 
	 * @param params
	 * @param page
	 * @return
	 * @throws RuntimeException
	 */
	List<Student> getStudentList(Map<String,Object> params, Pagination page) throws RuntimeException;

	/**
	 * 删除学生信息
	 * 
	 * @param id
	 * @return
	 * @throws RuntimeException
	 */
	int deleteStudentById(String id) throws RuntimeException;
	
	/**
	 * 新增学生信息
	 * 
	 * @param s
	 * @throws RuntimeException
	 */
	void addStudent(Student s)throws RuntimeException;
}
