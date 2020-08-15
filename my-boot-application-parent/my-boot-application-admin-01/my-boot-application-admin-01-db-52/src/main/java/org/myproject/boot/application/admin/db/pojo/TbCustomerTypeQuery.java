package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "tb_customer_type")
public class TbCustomerTypeQuery extends BaseEntity implements Serializable, MybatisExample<TbCustomerTypeExample> {
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    private static final long serialVersionUID = 1L;
    @TableField(value = "name")
    @AndLike
    private Integer name;
}