package org.myproject.boot.mybatis.mapper.pagehelper.pojo;

import cn.hutool.core.lang.Snowflake;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.genid.GenId;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 22:14
 */
public class IdentifyGenId implements GenId<Long> {
    @Autowired
    private Snowflake snowflake;

    @Override
    public Long genId(String s, String s1) {
        return snowflake.nextId();
    }
}