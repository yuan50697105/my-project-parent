package org.myproject.boot.application.admin.db.pojo;

import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

/**
 * tb_customer_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TbCustomerInfo extends BaseEntity implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_NAME_PY = "name_py";
    public static final String COL_NAME_PY_F = "name_py_f";
    public static final String COL_PHONE = "phone";
    public static final String COL_AGE = "age";
    private static final long serialVersionUID = 1L;
    /**
     * name
     */
    private String name;
    /**
     * namePy
     */
    private String namePy;
    /**
     * namePyF
     */
    private String namePyF;
    /**
     * phone
     */
    private String phone;
    /**
     * age
     */
    private Integer age;
    private Long typeId;
}