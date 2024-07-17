package com.wsh.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.wsh.gulimall.product.entity.ProductAttrValueEntity;
import com.wsh.gulimall.utils.PageUtils;

import java.util.Map;

/**
 * spu属性值
 *
 * @author wanshaohui
 * @email wanshaohui925@qq.com
 * @date 2024-07-16 20:47:52
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

