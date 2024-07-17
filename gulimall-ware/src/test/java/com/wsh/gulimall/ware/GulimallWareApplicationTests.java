package com.wsh.gulimall.ware;

import com.wsh.gulimall.ware.service.WareInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class GulimallWareApplicationTests {

    @Resource
    private WareInfoService wareInfoService;

    @Test
    void contextLoads() {
        System.out.println(wareInfoService.list());
    }

}
