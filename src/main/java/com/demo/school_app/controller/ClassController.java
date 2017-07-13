package com.demo.school_app.controller;

import java.util.HashMap;
import java.util.List;  
import java.util.Map; 
import java.util.UUID;

import io.swagger.annotations.Api; 
import io.swagger.annotations.ApiOperation; 
import io.swagger.annotations.ApiParam;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;    

import com.baomidou.mybatisplus.plugins.Page; 
import com.demo.school_app.common.resp.ListResult;
import com.demo.school_app.common.resp.ResponseResult;
import com.demo.school_app.common.util.MybatisUtil;
import com.demo.school_app.entiy.Classes;
import com.demo.school_app.service.ClassesService;

/**
 * 班级管理
 * 
 * @author Davis
 * @date 2017年6月8日 下午3:12:35
 */
@RestController 
@RequestMapping("/api/classes")
@Api(value = "班级管理", tags = "班级管理")
public class ClassController{

	
	@Autowired
	private ClassesService classesService;
	private final static Logger logger = Logger.getLogger(ClassController.class);
	
  
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ApiOperation("获取班级列表") 
	public ListResult<Classes> list(
			                        @ApiParam(name = "className", value = "班级名称", required = false) @RequestParam(required = false) String className,
									@ApiParam(name = "pageNum", value = "页码", defaultValue="1") @RequestParam(required = false) int pageNum,
									@ApiParam(name = "pageSize", value = "每页显示行数", defaultValue="10") @RequestParam(required = false) int pageSize
									) throws RuntimeException{
		Map<String,Object> param = new HashMap<>();
		param.put("className", className);
		Page<Long> page = MybatisUtil.getPagePm(pageNum, pageSize, null, null);
		List<Classes> list = classesService.getListWithPage(param, page);
		return ResponseResult.ok(list, page); 
	}
	
	@RequestMapping(value="/addClass", method=RequestMethod.POST)
	@ApiOperation("新增班级")
	public ResponseResult addClass(@ApiParam(name = "classes", value = "班级", required = true) @RequestBody Classes classes){ 
		try {
			UUID u = UUID.randomUUID();
			classes.setClassNo(u.toString().substring(0,4));
			classesService.insertClasses(classes);  
			return ResponseResult.ok(classes); 
		} catch (Exception e) { 
			logger.error(e.getMessage(), e);
			throw new  RuntimeException("新增班级信息失败");
		} 
	}
	
	@RequestMapping(value="/updateClass", method=RequestMethod.POST)
	@ApiOperation("更新班级")
	public ResponseResult updateClass(@ApiParam(name = "classes", value = "班级", required = true) @RequestBody Classes classes){ 
		try {
			int count = classesService.updateClassById(classes); 
			if(count > 0){
				return ResponseResult.ok(classes);
			}
			return ResponseResult.error("更新班级信息失败！");
		} catch (Exception e) { 
			logger.error(e.getMessage(), e);
			throw new  RuntimeException();
		} 
	}
	
	@RequestMapping(value="/deleteClass", method=RequestMethod.GET)
	@ApiOperation("删除班级")
	public ResponseResult deleteClass(@ApiParam(name = "id", value = "班级id", required = true) @RequestParam String id){ 
		try {
			int count = classesService.deleteClassById(id); 
			if(count > 0){
				return ResponseResult.ok(id);
			}
			return ResponseResult.error("删除班级信息失败！");
		} catch (Exception e) { 
			logger.error(e.getMessage(), e);
			throw new  RuntimeException();
		} 
	}
}
