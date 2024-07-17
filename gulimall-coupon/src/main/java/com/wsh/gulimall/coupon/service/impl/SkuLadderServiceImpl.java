package com.wsh.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wsh.gulimall.coupon.dao.SkuLadderDao;
import com.wsh.gulimall.coupon.entity.SkuLadderEntity;
import com.wsh.gulimall.coupon.service.SkuLadderService;
import com.wsh.gulimall.utils.PageUtils;
import com.wsh.gulimall.utils.Query;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("skuLadderService")
public class SkuLadderServiceImpl extends ServiceImpl<SkuLadderDao, SkuLadderEntity> implements SkuLadderService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuLadderEntity> page = this.page(
                new Query<SkuLadderEntity>().getPage(params),
                new QueryWrapper<SkuLadderEntity>()
        );

        return new PageUtils(page);
    }

}