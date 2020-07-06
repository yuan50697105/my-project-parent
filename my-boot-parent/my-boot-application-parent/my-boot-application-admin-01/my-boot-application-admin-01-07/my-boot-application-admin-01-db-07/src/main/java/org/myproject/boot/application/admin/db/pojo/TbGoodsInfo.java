package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.myproject.boot.mybatis.pojo.BaseEntity;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_goods_info")
public class TbGoodsInfo extends BaseEntity {
    @TableField(value = "code")
    private Long code;

    @TableField(value = "name")
    private String name;

    @TableField(value = "price")
    private BigDecimal price;

    @TableField(value = "type_id")
    private Long typeId;

    public static final String COL_ID = "id";

    public static final String COL_CODE = "code";

    public static final String COL_NAME = "name";

    public static final String COL_PRICE = "price";

    public static final String COL_TYPE_ID = "type_id";
}