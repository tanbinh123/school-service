package com.demo.school_app.common.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List; 
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.plugins.Page;

/**
 * 响应消息。controller中处理后，返回此对象，响应请求结果给客户端。
 */
@ApiModel(description = "响应消息")
public class ResponseResult implements Serializable {
    private static final long serialVersionUID = 8992436576262574064L;
    /**
     * 是否成功
     */
    @ApiModelProperty(value = "是否成功")
    protected boolean success;

    /**
     * 响应码
     */
    @ApiModelProperty(value = "响应码")
    protected int code;
    
    /**
     * 服务器时间
     */
    protected long serverTime;
    

    public ResponseResult() {
        this.code = 200;
        this.success = true;
    }


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }



    public int getCode() {
        return code;
    }

    
    public ResponseResult setCode(int code) {
        this.code = code;
        return this;
    }
    
    public long getServerTime(){
    	return System.currentTimeMillis();
    }
   

	@Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public static ResponseResult fromJson(String json) {
        return JSON.parseObject(json, ResponseResult.class);
    }

    
    /**
     * 返回OK消息
     * @return
     */
    public static ResponseResult ok() {
    	return new ResponseResult();
    }

    /**
     * 返回带记录的OK消息
     * @param record
     * @return
     */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static RecordResult ok(Object record) {
        return new RecordResult(record);
    }
    
    /**
     * 返回带记录列表的OK消息
     * @param records
     * @param total
     * @param page
     * @return
     */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ListResult ok(List records, Page<Long> page) {
        return new ListResult(records, page);
    } 

    /**
     * 返回异常消息
     * @param message
     * @return
     */
    public static ErrorResult error(String message) {
        return new ErrorResult(message);
    }

    /**
     * 返回指定代码的异常消息
     * @param message
     * @param code
     * @return
     */
    public static ResponseResult error(String message, int code) {
        return new ErrorResult(message).setCode(code);
    }
}