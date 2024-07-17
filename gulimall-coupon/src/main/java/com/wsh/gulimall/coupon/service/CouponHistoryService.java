package com.wsh.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wsh.gulimall.coupon.entity.CouponHistoryEntity;
import com.wsh.gulimall.utils.PageUtils;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author wanshaohui
 * @email wanshaohui925@qq.com
 * @date 2024-07-16 21:13:39
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

