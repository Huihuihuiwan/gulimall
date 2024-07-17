package com.wsh.gulimall.order;

import com.wsh.gulimall.order.entity.OrderEntity;
import com.wsh.gulimall.order.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class GulimallOrderApplicationTests {

    @Resource
    private OrderService orderService;

    @Test
    void contextLoads() {
        List<OrderEntity> list = orderService.list();
        System.out.println(list);
    }

}
