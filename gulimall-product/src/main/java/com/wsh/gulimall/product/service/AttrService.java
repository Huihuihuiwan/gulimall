package com.wsh.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.wsh.gulimall.product.entity.AttrEntity;
import com.wsh.gulimall.utils.PageUtils;

import java.util.Map;

/**
 * 商品属性
 *
 * @author wanshaohui
 * @email wanshaohui925@qq.com
 * @date 2024-07-16 20:47:52
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

