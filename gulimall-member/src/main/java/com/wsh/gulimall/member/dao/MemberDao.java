package com.wsh.gulimall.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wsh.gulimall.member.entity.MemberEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wanshaohui
 * @email wanshaohui925@qq.com
 * @date 2024-07-17 13:24:44
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
