package com.wsh.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wsh.gulimall.product.entity.SpuInfoDescEntity;
import com.wsh.gulimall.utils.PageUtils;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author wanshaohui
 * @email wanshaohui925@qq.com
 * @date 2024-07-16 20:47:52
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

