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
import com.demo.school_app.entiy.Student;
import com.demo.school_app.service.StudentService;

@RestController
@RequestMapping("/api/student")
@Api(value="学生管理", tags = "学生管理")
public class StudentController {

	@Autowired
	private StudentService studentService;
	private final static Logger logger = Logger.getLogger(StudentController.class);
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ApiOperation("获取学生列表") 
	public ListResult<Classes> list(
			                        @ApiParam(name = "studentName", value = "班级名称", required = false) @RequestParam(required = false) String studentName,
									@ApiParam(name = "pageNum", value = "页码", defaultValue="1") @RequestParam(required = false) int pageNum,
									@ApiParam(name = "pageSize", value = "每页显示行数", defaultValue="10") @RequestParam(required = false) int pageSize
									) throws RuntimeException{
		Map<String,Object> param = new HashMap<>();
		param.put("studentName", studentName);
		Page<Long> page = MybatisUtil.getPagePm(pageNum, pageSize, null, null);
		List<Student> list = studentService.getStudentList(param, page);
		return ResponseResult.ok(list, page); 
	}
	
	
	@RequestMapping(value="/addStudent", method=RequestMethod.POST)
	@ApiOperation("新增学生")
	public ResponseResult addStudent(@ApiParam(name = "student", value = "班级", required = true) @RequestBody Student student){ 
		try {
			UUID u = UUID.randomUUID();
			student.setStudentNo(u.toString().substring(0,4));
			studentService.addStudent(student);  
			return ResponseResult.ok(student); 
		} catch (Exception e) { 
			logger.error(e.getMessage(), e);
			throw new  RuntimeException("新增学生信息失败");
		} 
	}
	
	@RequestMapping(value="/deleteStu", method=RequestMethod.GET)
	@ApiOperation("删除学生")
	public ResponseResult deleteStu(@ApiParam(name = "id", value = "学生id", required = true) @RequestParam String id){ 
		try {
			int count = studentService.deleteStudentById(id); 
			if(count > 0){
				return ResponseResult.ok(id);
			}
			return ResponseResult.error("删除学生信息失败！");
		} catch (Exception e) { 
			logger.error(e.getMessage(), e);
			throw new  RuntimeException();
		} 
	}
}
