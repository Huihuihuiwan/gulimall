package com.wsh.gulimall.product;

import com.wsh.gulimall.product.entity.BrandEntity;
import com.wsh.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Resource
    private BrandService brandService;
    @Test
    void contextLoads() {
        List<BrandEntity> list = brandService.list();
        System.out.println(list);
    }

}
