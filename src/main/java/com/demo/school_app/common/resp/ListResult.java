package com.demo.school_app.common.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

import com.baomidou.mybatisplus.plugins.Page;
import com.demo.school_app.common.util.PageDto;

@ApiModel(description = "响应数据列表")
public class ListResult<T> extends ResponseResult {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 反馈数据列表
	 */
	@ApiModelProperty(value = "数据列表")
	private List<T> records;

	@ApiModelProperty(value = "总数量")
	private int total;
	
	@ApiModelProperty(value = "当前页码")
	private int page;

	public ListResult(List<T> records, Page<Long> page) {
		this.records = records;
		this.success = true;
		this.total = -1;
		this.page = -1;
		if(page != null){
			this.total = page.getTotal();
			this.page = page.getCurrent();
		}
	} 
	
	public ListResult(List<T> records, PageDto page, String str) {
		this.records = records;
		this.success = true;
		this.total = -1;
		this.page = -1;
		if(page != null){
			this.total = page.getTotal();
			this.page = page.getPageNo();
		}
	} 
	
	public List<T> getRecords() {
		return records;
	}

	public void setRecords(List<T> records) {
		this.records = records;
	}

	public int getTotal() {
		return total;
	}

	/*
	 * public void setTotal(int total) { this.total = total; }
	 */

	public int getPage() {
		return page;
	}

	/*
	 * public void setPage(int page) { this.page = page; }
	 */
}
