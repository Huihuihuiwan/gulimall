package com.wsh.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wsh.gulimall.product.entity.AttrAttrgroupRelationEntity;
import com.wsh.gulimall.utils.PageUtils;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author wanshaohui
 * @email wanshaohui925@qq.com
 * @date 2024-07-16 20:47:52
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

