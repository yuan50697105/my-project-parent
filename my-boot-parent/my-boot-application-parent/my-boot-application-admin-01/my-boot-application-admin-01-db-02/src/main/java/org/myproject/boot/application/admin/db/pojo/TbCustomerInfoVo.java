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
public class TbCustomerInfoVo extends BaseEntity implements Serializable {
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

    private static final long serialVersionUID = 1L;
}