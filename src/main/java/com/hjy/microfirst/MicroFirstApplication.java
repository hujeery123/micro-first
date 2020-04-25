package com.hjy.microfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/** @ServletComponentScan 扫描Servlet,Filter,Listener
 * 添加到容器
  */

@ServletComponentScan
@SpringBootApplication
public class MicroFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroFirstApplication.class, args);
	}

}
