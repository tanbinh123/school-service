package com.demo.school_app;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 配置跨域访问，开发环境使用，生产环境可取消
 * 
 * @author Davis
 * @date 2017年6月8日 下午5:28:59
 */
@Configuration  
public class CorsConfig extends WebMvcConfigurerAdapter {  

    @Override  
    public void addCorsMappings(CorsRegistry registry) {  
        registry.addMapping("/**")  
                .allowedOrigins("*")  
                .allowCredentials(true)  
                .allowedMethods("GET", "POST", "DELETE", "PUT")  
                .maxAge(3600);  
    }  

}  