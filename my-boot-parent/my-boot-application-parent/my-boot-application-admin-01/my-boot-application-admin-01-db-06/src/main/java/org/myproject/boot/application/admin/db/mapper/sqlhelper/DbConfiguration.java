package org.myproject.boot.application.admin.db.mapper.sqlhelper;

import org.myproject.boot.application.admin.db.mapper.sqlhelper.mapper.BaseMapper;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 19:47
 */
@SpringBootConfiguration
@ComponentScan(basePackageClasses = DbConfiguration.class)
@MapperScan(basePackageClasses = BaseMapper.class)
public class DbConfiguration {
}