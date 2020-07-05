package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_goods_type")
public class TbGoodsTypeQuery extends BaseEntity implements MybatisExample<TbGoodsTypeExample> {
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    @TableField(value = "name")
    @AndLike
    private String name;
}