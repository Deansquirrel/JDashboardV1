package com.zillion.boot.dashboard.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.yuansong.tools.common.ExceptionTool;
import com.zillion.boot.dashboard.message.SimpleMessage;

@RestControllerAdvice
public class ExceptionController {
	
	private static final Logger logger = LoggerFactory.getLogger(ExceptionController.class);

	@ExceptionHandler(value=Exception.class)
	public SimpleMessage exceptionHandler(Exception e) {
		String msg = ExceptionTool.getStackTrace(e);
		logger.debug(e.getMessage(), msg);
		return new SimpleMessage(-1L, msg); 
	}
}
