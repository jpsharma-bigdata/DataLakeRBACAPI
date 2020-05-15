package com.impetus.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jay.prakash
 *
 */
@SuppressWarnings("all")
@RestController
public class DataLakeRBACController {

	private Logger logger=LoggerFactory.getLogger(DataLakeRBACController.class);
	
	@RequestMapping("/ping")
	public String healthCheck() {
	return "Data Lake RBAC API Up and Running";
	}
}
