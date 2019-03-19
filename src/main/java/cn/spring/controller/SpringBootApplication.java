package cn.spring.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@org.springframework.boot.autoconfigure.SpringBootApplication
@PropertySource({"classpath:config.properties","classpath:application.yml"})
@ComponentScan(basePackages = {"cn.spring.entity","cn.spring.controller","cn.spring.service"})
@MapperScan(basePackages="cn.spring.dao")
public class SpringBootApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication.class, args);
	}
}
