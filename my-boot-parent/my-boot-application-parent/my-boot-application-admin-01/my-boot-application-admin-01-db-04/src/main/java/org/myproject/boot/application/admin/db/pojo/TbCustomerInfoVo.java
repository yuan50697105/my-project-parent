package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

/**
    * tb_customer_info
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_customer_info")
public class TbCustomerInfoVo extends BaseEntity implements Serializable {
    /**
     * name
     */
    @TableField(value = "name")
    private String name;

    /**
     * namePy
     */
    @TableField(value = "name_py")
    private String namePy;

    /**
     * namePyF
     */
    @TableField(value = "name_py_f")
    private String namePyF;

    /**
     * phone
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * age
     */
    @TableField(value = "age")
    private Integer age;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_NAME_PY = "name_py";

    public static final String COL_NAME_PY_F = "name_py_f";

    public static final String COL_PHONE = "phone";

    public static final String COL_AGE = "age";
}