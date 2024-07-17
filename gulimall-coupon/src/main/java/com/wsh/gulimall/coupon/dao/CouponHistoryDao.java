package com.wsh.gulimall.coupon.dao;

import com.wsh.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author wanshaohui
 * @email wanshaohui925@qq.com
 * @date 2024-07-16 21:13:39
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}