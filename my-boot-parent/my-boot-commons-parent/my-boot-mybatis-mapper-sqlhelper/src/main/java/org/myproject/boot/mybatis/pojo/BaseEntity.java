package org.myproject.boot.mybatis.pojo;

import lombok.Data;
import org.myproject.boot.mybatis.commons.annotation.Identify;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 02:18
 */
@Data
@MappedSuperclass
public class BaseEntity {
    @Id
    @Identify
    @KeySql(genId = IdentifyGenId.class)
    private Long id;
}