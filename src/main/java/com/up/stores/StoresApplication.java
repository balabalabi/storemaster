package com.up.stores;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.servlet.MultipartConfigElement;




@SpringBootApplication//标识该类是一个Spring Boot应用程序的入口类。
@MapperScan("com.up.stores.mapper")//用于指定MyBatis的Mapper接口所在的包路径。
//配置mapper接口位置
public class StoresApplication  {
    //用于启动Spring Boot应用程序。
    public static void main(String[] args) {
        SpringApplication.run(StoresApplication.class, args);
    }

    @Bean//注解配置文件上传的参数
    public MultipartConfigElement getMultipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        // DataSize dataSize = DataSize.ofMegabytes(10);
        // 设置文件最大10M，DataUnit提供5中类型B,KB,MB,GB,TB
        factory.setMaxFileSize(DataSize.of(10, DataUnit.MEGABYTES));
        factory.setMaxRequestSize(DataSize.of(15, DataUnit.MEGABYTES));
        // 设置总上传数据总大小10M
        return factory.createMultipartConfig();
    }
}
