package org.myproject.boot.application.goods.db.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * 商品类型
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "tb_goods_info")
public class TbGoodsInfo extends BaseEntity {
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_DESCRIPTION = "description";
    @TableField(value = "`name`")
    private String name;
    @TableField(value = "description")
    private String description;
}