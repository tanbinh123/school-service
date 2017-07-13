package com.demo.school_app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.baomidou.mybatisplus.plugins.Page;
import com.demo.school_app.common.util.MybatisUtil;
import com.demo.school_app.entiy.Classes;
import com.demo.school_app.service.ClassesService;

@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringApplicationConfiguration(Application.class)  
@WebAppConfiguration
public class ClassTest {

	@Autowired
	private ClassesService classesService;
	
	
	@Test
	public void getClassList(){
		
		Map<String,Object> param = new HashMap<>();
		param.put("className", "");
		Page<Long> page = MybatisUtil.getPagePm(1, 10, null, null);
		List<Classes> list = classesService.getListWithPage(param, page);
		System.out.println(list+"--------------------");
	}
}
