package org.myproject.boot.application.admin.db;

import lombok.extern.slf4j.Slf4j;
import org.myproject.boot.application.admin.Application;
import org.myproject.boot.application.admin.db.mapper.SysUserMapper;
import org.myproject.boot.application.admin.db.pojo.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 20:11
 */
@SpringBootTest(classes = Application.class)
@Slf4j
public class ApplicationTests {
    @Autowired
    private SysUserMapper sysUserMapper;

    void name() {
        sysUserMapper.insert(new SysUser());
    }
}