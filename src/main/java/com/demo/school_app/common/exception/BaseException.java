/**
 * 
 */
package com.demo.school_app.common.exception;

import com.demo.school_app.common.resp.HttpCode;
 

/**
 * 包含运行时异常
 * 
 * @author Davis
 * @date 2017年6月7日 下午5:34:11
 */
@SuppressWarnings("serial")
public abstract class BaseException extends Exception {
	public BaseException() {
	}

	public BaseException(Throwable ex) {
		super(ex);
	}

	public BaseException(String message) {
		super(message);
	}

	public BaseException(String message, Throwable ex) {
		super(message, ex);
	}

	/*public void handler(ModelMap modelMap) {
		modelMap.put("httpCode", getHttpCode().value());
		if (StringUtils.isNotBlank(getMessage())) {
			modelMap.put("msg", getMessage());
		} else {
			modelMap.put("msg", getHttpCode().msg());
		}
		modelMap.put("timestamp", System.currentTimeMillis());
	}*/

	protected abstract HttpCode getHttpCode();
}
