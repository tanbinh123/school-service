package com.demo.school_app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import com.google.common.base.Predicates;


/**
 * swagger2的API设置
 * 
 * @author Davis
 * @date 2017年6月7日 下午6:04:39
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	 
	@SuppressWarnings("unchecked")
	@Bean
	public Docket Api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("api")
				.genericModelSubstitutes(DeferredResult.class)
				// .genericModelSubstitutes(ResponseEntity.class)
				.useDefaultResponseMessages(false).forCodeGeneration(false)
				.pathMapping("/")
				.select()
				.paths(Predicates.or(PathSelectors.regex("/api/.*")))// 过滤的接口
				.build()
				.apiInfo(apiInfo());
	} 

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("school相关接口")
				.description("api").termsOfServiceUrl("")
				.version("1.0").build();
	}
}
