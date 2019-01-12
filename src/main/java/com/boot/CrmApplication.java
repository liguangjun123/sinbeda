package com.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 华为周旭阳 on 2019/1/3.
 * 1.@SpringBootApplication 是SpringBoot项目的核心注解,主要目的是开启自动配置
 * 2.项目启动的入口
 * 3.在启动类上添加@EnableScheduling注解即可开启 定时
 */
@Controller
@SpringBootApplication	//1.
@MapperScan(basePackages = "com.boot.crm.dao")
@EnableScheduling  	//3.
public class CrmApplication {

	@RequestMapping("/")
	public String login(){
		return "public/login";
	}

	public static void main(String[] args) {	//2.
		SpringApplication.run(CrmApplication.class, args);//启动SpringBoot应用项目
	}
}
