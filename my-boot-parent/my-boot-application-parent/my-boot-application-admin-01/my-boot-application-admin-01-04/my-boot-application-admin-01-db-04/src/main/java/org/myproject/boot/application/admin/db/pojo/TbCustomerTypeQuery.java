package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_customer_type")
public class TbCustomerTypeQuery extends BaseEntity implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_NAEM = "naem";
    private static final long serialVersionUID = 1L;
    @TableField(value = "naem")
    private Integer naem;
}