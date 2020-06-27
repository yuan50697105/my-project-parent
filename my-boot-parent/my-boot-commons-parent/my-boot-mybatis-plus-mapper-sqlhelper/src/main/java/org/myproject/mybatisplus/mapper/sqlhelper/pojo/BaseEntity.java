package org.myproject.mybatisplus.mapper.sqlhelper.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
    @TableId(type = IdType.ID_WORKER)
    private Long id;
}