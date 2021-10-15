package com.qf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.qf.dao")
@ServletComponentScan(basePackages = "com.qf.config")
public class BwcarApplication {

    public static void main(String[] args) {
        SpringApplication.run(BwcarApplication.class, args);
    }

}
