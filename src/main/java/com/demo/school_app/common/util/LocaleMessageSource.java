package com.demo.school_app.common.util;

import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

/**
 * 国际化工具
 * @author Michael
 *
 */
@Component
public class LocaleMessageSource {
	
	private static Locale defaultLocale = LocaleContextHolder.getLocale();
	
	private static LocaleMessageSource localeMessageSource = null;
	
	private static Object lock = new Object();
	
	@Resource
	private MessageSource messageSource;
	
	private LocaleMessageSource(){
		
	}
	
	public static LocaleMessageSource getMessageSource(){
		if(localeMessageSource == null){
			synchronized (lock) {
				if(localeMessageSource == null){
					localeMessageSource = new LocaleMessageSource();
				}
			}
		}
		return localeMessageSource;
	}
	
	

	/**
	 * 通过code获取对应的消息
	 * @param code
	 * @return
	 */
	public String getMessage(String key) {
	    return messageSource.getMessage(key, null, key, defaultLocale);
	}
	
	/**
	 * 通过code获取对应的消息
	 * @param code
	 * @param langCode 指定语言编码
	 * @return
	 */
	public String getMessage(String key, String langCode) {
	    return messageSource.getMessage(key, null, key, getLocale(langCode));
	}
	
	/**
	 * 通过code获取对应的消息，可提供动态参数值
	 * @param key ：对应messages配置的code.
	 * @param args : 数组参数.
	 * @return
	 */
	public String getMessage(String key, Object[] args){
	    return messageSource.getMessage(key, args, key, defaultLocale);
	}
	
	/**
	 * 通过code获取对应的消息，可提供动态参数值
	 * @param key 对应messages配置的code
	 * @param args 数组参数
	 * @param langCode 指定语言编码
	 * @return
	 */
	public String getMessage(String key, Object[] args, String langCode){
	    return messageSource.getMessage(key, args, key, getLocale(langCode));
	}
	
	public static Locale getLocale(String langCode){
		if("zh".equalsIgnoreCase(langCode)){
			return Locale.CHINESE;
		} else {
			return Locale.ENGLISH;
		}
	}
}
