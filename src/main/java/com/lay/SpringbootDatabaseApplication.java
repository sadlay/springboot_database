package com.lay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//定义JPA接口扫描包路径
@EnableJpaRepositories(basePackages = "com.lay.dao")
//定义实体Bean扫描包路径
@EntityScan(basePackages = "com.lay.pojo")
public class SpringbootDatabaseApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(SpringbootDatabaseApplication.class, args);
    }
}
