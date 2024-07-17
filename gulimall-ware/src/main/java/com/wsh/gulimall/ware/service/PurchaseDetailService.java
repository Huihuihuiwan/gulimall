package com.wsh.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wsh.gulimall.ware.entity.PurchaseDetailEntity;
import com.wsh.gulimall.utils.PageUtils;

import java.util.Map;

/**
 * 
 *
 * @author wanshaohui
 * @email wanshaohui925@qq.com
 * @date 2024-07-17 19:27:31
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

