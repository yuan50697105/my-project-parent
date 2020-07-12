package org.myproject.boot.application.admin.db.pojo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * tb_customer_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_customer_info")
public class TbCustomerInfo extends BaseEntity implements Serializable {
    /**
     * name
     */
    @Column(name = "`name`")
    private String name;

    /**
     * namePy
     */
    @Column(name = "name_py")
    private String namePy;

    /**
     * namePyF
     */
    @Column(name = "name_py_f")
    private String namePyF;

    /**
     * phone
     */
    @Column(name = "phone")
    private String phone;

    /**
     * age
     */
    @Column(name = "age")
    private Integer age;

    @Column(name = "type_id")
    private Long typeId;

    private static final long serialVersionUID = 1L;
}