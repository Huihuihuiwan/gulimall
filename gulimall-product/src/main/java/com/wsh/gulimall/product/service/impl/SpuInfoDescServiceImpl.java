package com.wsh.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wsh.gulimall.product.dao.SpuInfoDescDao;
import com.wsh.gulimall.product.entity.SpuInfoDescEntity;
import com.wsh.gulimall.product.service.SpuInfoDescService;
import com.wsh.gulimall.utils.PageUtils;
import com.wsh.gulimall.utils.Query;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service("spuInfoDescService")
public class SpuInfoDescServiceImpl extends ServiceImpl<SpuInfoDescDao, SpuInfoDescEntity> implements SpuInfoDescService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuInfoDescEntity> page = this.page(
                new Query<SpuInfoDescEntity>().getPage(params),
                new QueryWrapper<SpuInfoDescEntity>()
        );

        return new PageUtils(page);
    }

}