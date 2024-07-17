package com.wsh.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wsh.gulimall.coupon.entity.SpuBoundsEntity;
import com.wsh.gulimall.utils.PageUtils;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author wanshaohui
 * @email wanshaohui925@qq.com
 * @date 2024-07-16 21:13:39
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

