package org.myproject.boot.application.admin.db;

import cn.hutool.extra.spring.SpringUtil;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.myproject.cloud.application.admin.Application;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 20:11
 */
@SpringBootTest(classes = Application.class)
@Slf4j
public class ApplicationTests {
    @Test
    void name() {
//        TbSysUserMapper sysUserMapper = SpringUtil.getBean(TbSysUserMapper.class);
//        TbSysUserQuery query = new TbSysUserQuery();
//        query.setUsername("aaa");
//        List<TbSysUser> users = sysUserMapper.selectByQuery(query);
//        String jsonStr = JSONUtil.toJsonStr(users);
//        System.out.println("jsonStr = " + jsonStr);
    }
}