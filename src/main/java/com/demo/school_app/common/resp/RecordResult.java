package com.demo.school_app.common.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "响应实体数据")
public class RecordResult<T> extends ResponseResult {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
     * 反馈数据记录
     */
	@ApiModelProperty(value = "实体数据")
    private T record;
    
    public RecordResult(T record) {
        this.record = record;
        this.success = true;
    }

    public T getRecord() {
		return record;
	}

	public void setRecord(T record) {
		this.record = record;
	}

}
