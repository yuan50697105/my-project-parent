package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndGreaterThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLessThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_goods_info")
public class TbGoodsInfoQuery extends BaseEntity implements MybatisExample<TbGoodsInfoExample> {
    public static final String COL_ID = "id";
    public static final String COL_CODE = "code";
    public static final String COL_NAME = "name";
    public static final String COL_PRICE = "price";
    public static final String COL_TYPE_ID = "type_id";
    @TableField(value = "code")
    @AndLike
    private Long code;
    @TableField(value = "name")
    @AndLike
    private String name;
    @TableField(value = "price")
    @AndGreaterThanOrEqualTo(property = "price")
    private BigDecimal priceStart;
    @AndLessThanOrEqualTo(property = "price")
    private BigDecimal priceEnd;
    @TableField(value = "type_id")
    @AndEqualTo
    private Long typeId;
}