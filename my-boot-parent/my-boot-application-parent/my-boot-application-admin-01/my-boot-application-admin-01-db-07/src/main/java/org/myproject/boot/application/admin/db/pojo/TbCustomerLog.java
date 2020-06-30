package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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
@TableName(value = "tb_customer_log")
public class TbCustomerLog extends BaseEntity implements Serializable {
    @TableField(value = "customer_id")
    private Long customerId;

    @TableField(value = "customer_name")
    private String customerName;

    @TableField(value = "content")
    private String content;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_CUSTOMER_ID = "customer_id";

    public static final String COL_CUSTOMER_NAME = "customer_name";

    public static final String COL_CONTENT = "content";
}