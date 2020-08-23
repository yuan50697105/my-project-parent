package org.myproject.boot.mybatis.pojo;

import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import lombok.Data;
import org.myproject.boot.mybatis.annotation.Identify;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
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
    @Column(name = "id")
    @AndEqualTo
    private Long id;
}