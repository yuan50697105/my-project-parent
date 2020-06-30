package org.myproject.boot.application.admin.db.pojo;

import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * tb_customer_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
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

    private static final long serialVersionUID = 1L;
}