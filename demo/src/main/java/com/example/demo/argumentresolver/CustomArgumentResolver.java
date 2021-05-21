package com.example.demo.argumentresolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

@Component
public class CustomArgumentResolver implements HandlerMethodArgumentResolver {

	@Autowired
	TestComponent testComponent;
	
	@Override
	public boolean supportsParameter(MethodParameter parameter) {
		return ArgumentModel.class.isAssignableFrom(parameter.getParameterType());
	}

	@Override
	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
			NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
		
		ArgumentModel model = new ArgumentModel();
		model.setClientIp("127.0.0.1");
		model.setClientName(this.testComponent.getValue());
		return model;
	}
}
