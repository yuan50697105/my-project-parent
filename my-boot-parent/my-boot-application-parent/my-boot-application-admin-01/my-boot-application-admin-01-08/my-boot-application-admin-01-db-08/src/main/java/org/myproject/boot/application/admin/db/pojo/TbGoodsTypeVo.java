package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_goods_type")
public class TbGoodsTypeVo extends BaseEntity {
    @TableField(value = "name")
    private String name;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";
}