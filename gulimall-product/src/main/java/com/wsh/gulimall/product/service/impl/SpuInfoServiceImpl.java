package com.wsh.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wsh.gulimall.product.dao.SpuInfoDao;
import com.wsh.gulimall.product.entity.SpuInfoEntity;
import com.wsh.gulimall.product.service.SpuInfoService;
import com.wsh.gulimall.utils.PageUtils;
import com.wsh.gulimall.utils.Query;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("spuInfoService")
public class SpuInfoServiceImpl extends ServiceImpl<SpuInfoDao, SpuInfoEntity> implements SpuInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuInfoEntity> page = this.page(
                new Query<SpuInfoEntity>().getPage(params),
                new QueryWrapper<SpuInfoEntity>()
        );

        return new PageUtils(page);
    }

}