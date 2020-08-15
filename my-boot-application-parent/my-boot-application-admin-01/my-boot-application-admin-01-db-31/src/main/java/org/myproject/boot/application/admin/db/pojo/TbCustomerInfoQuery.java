package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndGreaterThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;
import tk.mybatis.mapper.entity.Example;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * tb_customer_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_customer_info")
public class TbCustomerInfoQuery extends BaseEntity implements Serializable, MybatisExampleForTk<TbCustomerInfo, Example> {
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
    @Column(name = "`name`")
    @AndLike
    private String name;
    /**
     * namePy
     */
    @Column(name = "name_py")
    @AndLike
    private String namePy;
    /**
     * namePyF
     */
    @Column(name = "name_py_f")
    @AndLike
    private String namePyF;
    /**
     * phone
     */
    @Column(name = "phone")
    @AndLike
    private String phone;
    /**
     * age
     */
    @Column(name = "age")
    @AndEqualTo
    private Integer age;
    @AndGreaterThanOrEqualTo(property = "age")
    private Integer ageStart;
    private Integer ageEnd;
    @Column(name = "type_id")
    @AndEqualTo
    private Long typeId;
}