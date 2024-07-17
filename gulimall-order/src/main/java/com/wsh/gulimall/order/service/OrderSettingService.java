package com.wsh.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wsh.gulimall.order.entity.OrderSettingEntity;
import com.wsh.gulimall.utils.PageUtils;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author wanshaohui
 * @email wanshaohui925@qq.com
 * @date 2024-07-16 19:27:31
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

