package com.lyb;

import com.lyb.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseApplicationTests {
    @Autowired
    private SysUserService sysUserService;

    @Test
    public void contextLoads() {
        System.out.println("坨坨大傻逼");
    }

}
