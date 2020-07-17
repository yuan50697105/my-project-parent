package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndGreaterThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLessThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

/**
 * tb_customer_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "tb_customer_info")
public class TbCustomerInfoQuery extends BaseEntity implements Serializable, MybatisExample<TbCustomerInfoExample> {
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_NAME_PY = "name_py";
    public static final String COL_NAME_PY_F = "name_py_f";
    public static final String COL_PHONE = "phone";
    public static final String COL_AGE = "age";
    public static final String COL_TYPE_ID = "type_id";
    private static final long serialVersionUID = 1L;
    /**
     * name
     */
    @TableField(value = "name")
    @AndLike
    private String name;
    /**
     * namePy
     */
    @TableField(value = "name_py")
    @AndLike
    private String namePy;
    /**
     * namePyF
     */
    @TableField(value = "name_py_f")
    @AndLike
    private String namePyF;
    /**
     * phone
     */
    @TableField(value = "phone")
    @AndLike
    private String phone;
    /**
     * age
     */
    @TableField(value = "age")
    @AndEqualTo
    private Integer age;
    @AndGreaterThanOrEqualTo(property = "age")
    private Integer ageStart;
    @AndLessThanOrEqualTo(property = "age")
    private Integer ageEnd;
    @TableField(value = "type_id")
    private Long typeId;
}