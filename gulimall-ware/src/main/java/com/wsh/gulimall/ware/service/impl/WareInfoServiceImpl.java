package com.wsh.gulimall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wsh.gulimall.ware.dao.WareInfoDao;
import com.wsh.gulimall.ware.entity.WareInfoEntity;
import com.wsh.gulimall.ware.service.WareInfoService;
import com.wsh.gulimall.utils.PageUtils;
import com.wsh.gulimall.utils.Query;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service("wareInfoService")
public class WareInfoServiceImpl extends ServiceImpl<WareInfoDao, WareInfoEntity> implements WareInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WareInfoEntity> page = this.page(
                new Query<WareInfoEntity>().getPage(params),
                new QueryWrapper<WareInfoEntity>()
        );

        return new PageUtils(page);
    }

}