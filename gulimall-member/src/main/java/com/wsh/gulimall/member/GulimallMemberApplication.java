package com.wsh.gulimall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 需要调用远程别的服务
 * 1）引入open-feign ===》创建项目时，已经勾选
 * 2）编写一个接口，告诉SpringCloud这个接口需要调用远程服务 ===>将所有远程调用接口放在feign目录下
 *      1、声明接口的每一个方法都是调用哪个远程服务的那个请求
 *        - @FeignClient("服务标识名称")
 *        - 远程接口的方法名放在接口中
 * 3）开启远程调用功能
 *  - @EnableFeignClients(basePackages = "com.wsh.gulimall.member.feign")
 */
@EnableFeignClients(basePackages = "com.wsh.gulimall.member.feign")
@MapperScan("com.wsh.gulimall.member.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
