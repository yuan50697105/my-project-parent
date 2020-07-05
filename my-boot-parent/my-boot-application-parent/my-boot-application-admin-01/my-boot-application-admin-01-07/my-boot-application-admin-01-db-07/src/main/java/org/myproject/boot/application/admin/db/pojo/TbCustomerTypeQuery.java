package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TbCustomerTypeQuery extends BaseEntity implements Serializable, MybatisExampleForTk<TbCustomerType, Example> {
    public static final String COL_ID = "id";
    public static final String COL_NAEM = "naem";
    private static final long serialVersionUID = 1L;
    @TableField(value = "naem")
    @AndLike
    private Integer naem;
}