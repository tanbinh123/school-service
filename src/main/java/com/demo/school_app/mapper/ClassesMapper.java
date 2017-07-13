package com.demo.school_app.mapper;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.demo.school_app.entiy.Classes;

/**
 * 班级mapper接口
 * 
 * @author Davis
 * @date 2017年6月8日 上午9:27:43
 */
public interface ClassesMapper extends BaseMapper<Classes>{

	List<Classes> getClassesList(Map<String,Object> params);
	
	int getClassesNum(Map<String, Object> params);
	
	int updateClassById(Classes classes);
	
	int deleteClassById(String id);
	
	void insertClasses(Classes classes);
}
