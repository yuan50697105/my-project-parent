package org.myproject.boot.application.admin.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * tb_customer_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TbCustomerInfo extends BaseEntity {
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