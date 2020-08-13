package org.myproject.boot.application.goods.db.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
    * 商品类型
    */
@Data
@EqualsAndHashCode(callSuper=true)
@TableName(value = "tb_goods_type")
public class TbGoodsType extends BaseEntity {
    /**
     * 类型名称
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 类型描述
     */
    @TableField(value = "description")
    private String description;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_DESCRIPTION = "description";
}