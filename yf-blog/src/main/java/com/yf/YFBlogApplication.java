package com.yf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: biyunfei3
 * @create: 2024-11-01 15:20
 **/
@SpringBootApplication
@MapperScan("com.yf.mapper")
public class YFBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(YFBlogApplication.class, args);
    }

}
