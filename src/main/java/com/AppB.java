/**
 * 功能说明:
 * 功能作者:
 * 创建日期:
 * 版权归属:每特教育|蚂蚁课堂所有 www.itmayiedu.com
 */
package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@MapperScan(basePackages = { "com.itmayiedu.mapper" })
@SpringBootApplication
@ServletComponentScan
public class AppB {

	public static void main(String[] args) {
		SpringApplication.run(AppB.class, args);
	}

}
