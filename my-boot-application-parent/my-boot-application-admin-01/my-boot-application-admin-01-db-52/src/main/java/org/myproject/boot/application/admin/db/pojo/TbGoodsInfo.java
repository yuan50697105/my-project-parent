package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "tb_goods_info")
public class TbGoodsInfo extends BaseEntity implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_CODE = "code";
    public static final String COL_NAME = "name";
    public static final String COL_PRICE = "price";
    public static final String COL_TYPE_ID = "type_id";
    private static final long serialVersionUID = 1L;
    @TableField(value = "code")
    private Long code;
    @TableField(value = "name")
    private String name;
    @TableField(value = "price")
    private BigDecimal price;
    @TableField(value = "type_id")
    private Long typeId;
}