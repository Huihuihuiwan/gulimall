package com.wsh.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wsh.gulimall.coupon.entity.SkuFullReductionEntity;
import com.wsh.gulimall.utils.PageUtils;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author wanshaohui
 * @email wanshaohui925@qq.com
 * @date 2024-07-16 21:13:39
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

