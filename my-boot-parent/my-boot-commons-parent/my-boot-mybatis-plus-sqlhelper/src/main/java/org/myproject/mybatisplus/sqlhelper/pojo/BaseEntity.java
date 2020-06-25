package org.myproject.mybatisplus.sqlhelper.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
    @TableId(type = IdType.ID_WORKER)
    private Long id;
}