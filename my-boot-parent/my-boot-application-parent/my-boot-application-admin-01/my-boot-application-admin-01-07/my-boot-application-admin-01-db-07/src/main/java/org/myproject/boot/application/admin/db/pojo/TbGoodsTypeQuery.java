package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;
import tk.mybatis.mapper.entity.Example;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_goods_type")
public class TbGoodsTypeQuery extends BaseEntity implements MybatisExampleForTk<TbGoodsType, Example> {
    @TableField(value = "name")
    @AndLike
    private String name;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";
}