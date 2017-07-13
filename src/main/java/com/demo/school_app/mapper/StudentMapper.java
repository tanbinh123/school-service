package com.demo.school_app.mapper;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.demo.school_app.entiy.Student;

/**
 * 学生mapper接口
 * 
 * @author Davis
 * @date 2017年6月8日 上午9:27:43
 */
public interface StudentMapper extends BaseMapper<Student>{

	List<Student> getStudentList(Map<String,Object> params);
	
	int getStudentNum(Map<String, Object> params); 
	
	int deleteStudentById(String id);
	
	void addStudent(Student student);
}
