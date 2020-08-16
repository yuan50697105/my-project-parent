package org.myproject.boot.application.goods.db.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.analytical.ExampleCriteriaValueImpl4Like;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * 商品类型
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "tb_goods_type")
public class TbGoodsTypeQuery extends BaseEntity implements MybatisExample<TbGoodsTypeExample> {
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_DESCRIPTION = "description";
    /**
     * 类型名称
     */
    @TableField(value = "`name`")
    @AndLike(type = ExampleCriteriaValueImpl4Like.Type.suffix)
    private String name;
}