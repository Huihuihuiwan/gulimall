package com.wsh.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wsh.gulimall.member.entity.MemberLevelEntity;
import com.wsh.gulimall.utils.PageUtils;

import java.util.Map;

/**
 * 会员等级
 *
 * @author wanshaohui
 * @email wanshaohui925@qq.com
 * @date 2024-07-17 13:24:44
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

