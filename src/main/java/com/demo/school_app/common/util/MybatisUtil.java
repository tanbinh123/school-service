package com.demo.school_app.common.util;

import java.util.Map;
import java.util.UUID;

import com.baomidou.mybatisplus.plugins.Page;

public class MybatisUtil {


	/** 分页查询 */
	public static Page<Long> getPage(Map<String, Object> params) {
		Integer current = 1;
		Integer size = 10;
		String orderBy = "";
		String isAsc = "1";
		if(params != null){
			if (DataUtil.isNotEmpty(params.get("pageNum"))) {
				current = Integer.parseInt(( params.get("pageNum").toString()));
			}
			if (DataUtil.isNotEmpty(params.get("pageSize"))) {
				size = Integer.parseInt(params.get("pageSize").toString());
			}
			if (DataUtil.isNotEmpty(params.get("orderBy"))) {
				orderBy = (String) params.get("orderBy");
			}
			if (DataUtil.isNotEmpty(params.get("isAsc"))) {
				isAsc = (String) params.get("isAsc");
			}
		}
		Page<Long> page = new Page<Long>(current, size, orderBy);
		page.setAsc(!"0".equals(isAsc));
		return page;
	}
	/** 分页查询 */
	public static Page<Long> getPagePm(int pageNum,int pageSize,String orderByPm,String isAscPm) {
		Integer current = 1;
		Integer size = 10;
		String orderBy = "";
		String isAsc = "1";
		if (DataUtil.isNotEmpty(pageNum)) {
			current = pageNum;
		}
		if (DataUtil.isNotEmpty(pageSize)) {
			size = pageSize;
		}
		if (DataUtil.isNotEmpty(orderByPm)) {
			orderBy =orderByPm;
		}
		if (DataUtil.isNotEmpty(isAscPm)) {
			isAsc = isAscPm;
		}
		Page<Long> page = new Page<Long>(current, size, orderBy);
		page.setAsc(!"0".equals(isAsc));
		return page;
	}
}
