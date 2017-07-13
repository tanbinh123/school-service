package com.demo.school_app.service;

import java.util.List;
import java.util.Map; 

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.baomidou.mybatisplus.service.IService; 
import com.demo.school_app.entiy.Classes;

public interface ClassesService extends IService<Classes>{
	
	
	/**
	 * 分页查询班级列表信息
	 * 
	 * @param params
	 * @param page
	 * @return
	 * @throws RuntimeException
	 */
	List<Classes> getListWithPage(Map<String, Object> params, Pagination page) throws RuntimeException;
	
	/**
	 * 更新班级信息
	 * 
	 * @param classes
	 * @return
	 * @throws RuntimeException
	 */
    int updateClassById(Classes classes)throws RuntimeException;
	
    /**
     * 删除班级
     * 
     * @param id
     * @return
     * @throws RuntimeException
     */
	int deleteClassById(String id)throws RuntimeException;
	
	/**
	 * 新增班级信息
	 * 
	 * @param classes
	 * @throws RuntimeException
	 */
	void insertClasses(Classes classes)throws RuntimeException;

}
