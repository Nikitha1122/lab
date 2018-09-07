package com.cg;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cg.bean.Day;

@Configuration
@ComponentScan(basePackages="com.cg")
public class AppConfig {
	@Bean
	public Map<String,Day> getMap()
	{
		Map<String,Day> m=new HashMap<>();
		return m;
	}
	
	
}
