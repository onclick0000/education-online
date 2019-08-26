package com.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.jk")
@MapperScan("com.jk.mapper")
public class SpringbooteducationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbooteducationApplication.class, args);
    }

}
