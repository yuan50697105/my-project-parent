package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
    * tb_customer_info
    */
@Data
@EqualsAndHashCode(callSuper=true)
@TableName(value = "tb_customer_info")
public class TbCustomerInfo extends BaseEntity implements Serializable {
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

    @TableField(value = "type_id")
    private Long typeId;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_NAME_PY = "name_py";

    public static final String COL_NAME_PY_F = "name_py_f";

    public static final String COL_PHONE = "phone";

    public static final String COL_AGE = "age";

    public static final String COL_TYPE_ID = "type_id";
}