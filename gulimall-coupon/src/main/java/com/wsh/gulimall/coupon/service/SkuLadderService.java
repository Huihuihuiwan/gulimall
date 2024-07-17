package com.wsh.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wsh.gulimall.coupon.entity.SkuLadderEntity;
import com.wsh.gulimall.utils.PageUtils;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author wanshaohui
 * @email wanshaohui925@qq.com
 * @date 2024-07-16 21:13:39
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

