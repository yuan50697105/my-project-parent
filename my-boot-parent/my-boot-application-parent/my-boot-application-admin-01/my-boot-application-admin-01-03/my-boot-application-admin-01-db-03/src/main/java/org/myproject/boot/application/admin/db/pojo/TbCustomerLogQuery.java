package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_customer_log")
public class TbCustomerLogQuery extends BaseEntity implements Serializable, MybatisExample<TbCustomerLogExample> {
    public static final String COL_ID = "id";
    public static final String COL_CUSTOMER_ID = "customer_id";
    public static final String COL_CUSTOMER_NAME = "customer_name";
    public static final String COL_CONTENT = "content";
    private static final long serialVersionUID = 1L;
    @TableField(value = "customer_id")
    @AndEqualTo
    private Long customerId;
    @TableField(value = "customer_name")
    @AndLike
    private String customerName;
    @TableField(value = "content")
    @AndLike
    private String content;
}