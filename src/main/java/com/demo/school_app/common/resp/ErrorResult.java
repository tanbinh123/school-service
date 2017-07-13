package com.demo.school_app.common.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "响应错误结果")
public class ErrorResult extends ResponseResult {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * 反馈信息
     */
	@ApiModelProperty(value = "反馈信息")
    private String message = "";
    
    public ErrorResult(String message) {
        this.code = 500;
        this.message = message;
        this.success = false;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
