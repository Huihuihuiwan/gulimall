package com.wsh.gulimall.ware.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wsh.gulimall.ware.entity.WareSkuEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author wanshaohui
 * @email wanshaohui925@qq.com
 * @date 2024-07-17 19:27:31
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
