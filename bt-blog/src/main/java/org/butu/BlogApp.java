package org.butu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Copyright (C), 2017-2022, 不秃
 *
 * @author BUTUbird
 * Date: 2022/2/7 21:17
 * FileName: BTBlogApp
 */
@SpringBootApplication
@MapperScan("org.butu.mapper")
public class BlogApp {
    public static void main(String[] args) {
        SpringApplication.run(BlogApp.class, args);
    }
}
