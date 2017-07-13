package com.demo.school_app.common.exception;

import com.demo.school_app.common.resp.HttpCode;
 

/**
 * 业务逻辑异常。此异常要求将具体的异常描述友好的显示给客户。
 */
@SuppressWarnings("serial")
public class BusinessException extends BaseException {
	public BusinessException() {
	}

	public BusinessException(Throwable ex) {
		super(ex);
	}

	public BusinessException(String message) {
		super(message);
	}

	public BusinessException(String message, Throwable ex) {
		super(message, ex);
	}

	protected HttpCode getHttpCode() {
		return HttpCode.CONFLICT;
	}
}