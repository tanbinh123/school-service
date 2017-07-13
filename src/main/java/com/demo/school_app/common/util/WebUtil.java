package com.demo.school_app.common.util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.util.WebUtils;

/**
 * Web层辅助类
 * 
 * @author Michael
 * @version 2016年4月2日 下午4:19:28
 */
public final class WebUtil {
	private WebUtil() {
	}

	/**
	 * 获得参数Map
	 * 
	 * @param request
	 * @return
	 */
	public static final Map<String, Object> getParameterMap(HttpServletRequest request) {
		if(WebUtils.getParametersStartingWith(request, null)==null){
			return new HashMap<String, Object>();
		}else{
			return WebUtils.getParametersStartingWith(request, null);
		}
		
	}

	/** 获取客户端IP */
	/*public static final String getHost(HttpServletRequest request) {
		String ip = request.getHeader("X-Forwarded-For");
		if (StringUtils.isBlank(ip) || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (StringUtils.isBlank(ip) || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (StringUtils.isBlank(ip) || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("X-Real-IP");
		}
		if (StringUtils.isBlank(ip) || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		if ("127.0.0.1".equals(ip)) {
			InetAddress inet = null;
			try { // 根据网卡取本机配置的IP
				inet = InetAddress.getLocalHost();
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
			ip = inet.getHostAddress();
		}
		// 对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
		if (ip != null && ip.length() > 15) {
			if (ip.indexOf(",") > 0) {
				ip = ip.substring(0, ip.indexOf(","));
			}
		}
		return ip;
	}*/
}
