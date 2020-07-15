package org.myproject.boot.application.admin.mvc.graphiql.resolver;

import cn.hutool.json.JSONUtil;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.myproject.boot.application.admin.mvc.graphiql.converter.Converter;
import org.myproject.boot.application.admin.mvc.graphiql.pojo.SysUser;
import org.myproject.boot.application.admin.mvc.graphiql.pojo.SysUserInput;
import org.myproject.boot.application.admin.service.api.BSysUserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-15 12:20
 */
@Component
public class SysUserQueryResolver implements GraphQLQueryResolver {
    @Autowired
    private BSysUserApi sysUserApi;
    @Autowired
    private Converter converter;

    public String aa() {
        return "aa";
    }

    public SysUser users() {
        SysUser sysUser = new SysUser();
        sysUser.setId(1);
        sysUser.setUsername("aaaa");
        sysUser.setUsers(Arrays.asList(sysUser));
        return sysUser;
    }

    public SysUser input(SysUserInput input) {
        return converter.convert(input);
    }
}