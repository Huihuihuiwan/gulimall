package com.wsh.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wsh.gulimall.product.entity.SkuSaleAttrValueEntity;
import com.wsh.gulimall.utils.PageUtils;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author wanshaohui
 * @email wanshaohui925@qq.com
 * @date 2024-07-16 20:47:52
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

