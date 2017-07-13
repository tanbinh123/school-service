package com.demo.school_app.service.impl; 

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.demo.school_app.entiy.Student; 
import com.demo.school_app.mapper.StudentMapper;
import com.demo.school_app.service.StudentService;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService{

	@Override
	public List<Student> getStudentList(Map<String, Object> params,
			Pagination page) throws RuntimeException {
		 
		page.setCurrent(page.getOffsetCurrent());
		params.put("page", page);
	    int count = baseMapper.getStudentNum(params);
		page.setTotal(count);
		page.getPages();
		return baseMapper.getStudentList(params);
	}

	@Override
	public int deleteStudentById(String id) throws RuntimeException {
		 
		return baseMapper.deleteStudentById(id);
	}

	@Override
	public void addStudent(Student student) throws RuntimeException {
		 
		baseMapper.addStudent(student);
	}

}
