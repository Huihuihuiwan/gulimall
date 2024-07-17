package com.wsh.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wsh.gulimall.ware.entity.WareSkuEntity;
import com.wsh.gulimall.utils.PageUtils;

import java.util.Map;

/**
 * 商品库存
 *
 * @author wanshaohui
 * @email wanshaohui925@qq.com
 * @date 2024-07-17 19:27:31
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

