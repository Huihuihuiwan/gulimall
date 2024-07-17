package com.wsh.gulimall.order.dao;

import com.wsh.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author wanshaohui
 * @email wanshaohui925@qq.com
 * @date 2024-07-16 19:27:31
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
