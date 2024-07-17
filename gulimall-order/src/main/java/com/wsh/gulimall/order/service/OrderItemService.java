package com.wsh.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wsh.gulimall.order.entity.OrderItemEntity;
import com.wsh.gulimall.utils.PageUtils;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author wanshaohui
 * @email wanshaohui925@qq.com
 * @date 2024-07-16 19:27:31
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

