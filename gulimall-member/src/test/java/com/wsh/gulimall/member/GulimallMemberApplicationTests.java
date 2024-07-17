package com.wsh.gulimall.member;

import com.wsh.gulimall.member.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class GulimallMemberApplicationTests {
    @Resource
    MemberService memberService;
    @Test
    void contextLoads() {
        System.out.println(memberService.list());
    }

}
