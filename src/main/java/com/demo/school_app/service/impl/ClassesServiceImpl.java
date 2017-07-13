package com.demo.school_app.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service; 

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.demo.school_app.entiy.Classes;
import com.demo.school_app.mapper.ClassesMapper;
import com.demo.school_app.service.ClassesService; 
@Service
public class ClassesServiceImpl extends ServiceImpl<ClassesMapper, Classes> implements ClassesService {

	
	
	@Override
	public List<Classes> getListWithPage(Map<String, Object> params, Pagination page) throws RuntimeException {
     
		page.setCurrent(page.getOffsetCurrent());
		params.put("page", page);
	    int count = baseMapper.getClassesNum(params);
		page.setTotal(count);
		page.getPages();
		return baseMapper.getClassesList(params);
	}

	@Override
	public int updateClassById(Classes classes) throws RuntimeException {
		 
		return baseMapper.updateClassById(classes);
	}

	@Override
	public int deleteClassById(String id) throws RuntimeException {
		 
		return baseMapper.deleteClassById(id);
	}

	@Override
	public void insertClasses(Classes classes) throws RuntimeException {
		 baseMapper.insert(classes);
	} 
}
