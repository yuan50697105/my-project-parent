package org.myproject.boot.mybatis.commons.intercepter;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.ReflectUtil;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.myproject.boot.mybatis.commons.annotation.Identify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 00:18
 */
@ConditionalOnClass(Identify.class)
@Component
@Intercepts(value = {
        @Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class})
})
public class IdentifyInterceptor implements Interceptor {
    @Autowired
    private Snowflake snowflake;


    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];
        Object object = invocation.getArgs()[1];
        Field[] fields = getAllField(object);
        if (mappedStatement.getSqlCommandType() == SqlCommandType.INSERT) {
            propertyInsert(object, fields);
        }
        return invocation.proceed();
    }

    private void propertyInsert(Object object, Field[] fields) throws IllegalAccessException {
        for (Field field : fields) {
            field.setAccessible(true);
            if (ObjectUtil.isEmpty(field.get(object)) && field.isAnnotationPresent(Identify.class)) {
                field.set(object, getId());
            }
        }
    }

    private Object getId() {
        return snowflake.nextId();
    }

    private Field[] getAllField(Object object) {
        return ReflectUtil.getFieldsDirectly(object.getClass(), true);
    }

}