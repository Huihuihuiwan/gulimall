package com.wsh.gulimall.coupon;

import com.wsh.gulimall.coupon.service.HomeAdvService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class GulimallCouponApplicationTests {
    @Resource
    HomeAdvService homeAdvService;
    @Test
    void contextLoads() {
        System.out.println(homeAdvService.list());
    }

}
