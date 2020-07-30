package org.myproject.boot.mybatis.pojo;

import cn.hutool.core.lang.Snowflake;
import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.genid.GenId;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 22:14
 */
@Component
public class IdentifyGenId implements GenId<Long>, IdentifierGenerator {
    @Autowired
    private Snowflake snowflake;

    @Override
    public Long genId(String s, String s1) {
        return snowflake.nextId();
    }

    @Override
    public Number nextId(Object entity) {
        return snowflake.nextId();
    }
}