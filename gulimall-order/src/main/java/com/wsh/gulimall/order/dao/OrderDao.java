package com.wsh.gulimall.order.dao;

import com.wsh.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wanshaohui
 * @email wanshaohui925@qq.com
 * @date 2024-07-16 19:27:31
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
