package org.myproject.mybatis.pagehelper.pojo;

import lombok.Data;
import org.myproject.boot.mybatis.commons.annotation.Identify;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 02:18
 */
@Data
public class BaseEntity {
    @Identify
    private Long id;
}