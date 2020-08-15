package org.myproject.boot.application.admin.mvc.graphiql.resolver;

import graphql.kickstart.tools.GraphQLResolver;
import org.myproject.boot.application.admin.mvc.graphiql.pojo.SysUserA;
import org.springframework.stereotype.Component;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-15 16:26
 */
@Component
public class SysUserAResolver implements GraphQLResolver<SysUserA> {
    String aa() {
        return "sss";
    }
}