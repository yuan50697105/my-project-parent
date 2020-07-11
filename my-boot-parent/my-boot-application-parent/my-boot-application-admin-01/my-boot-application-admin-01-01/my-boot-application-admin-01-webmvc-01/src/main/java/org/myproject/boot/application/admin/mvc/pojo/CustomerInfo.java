package org.myproject.boot.application.admin.mvc.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * tb_customer_info
 */
@Data
public class CustomerInfo implements Serializable {
    /**
     * id
     */
    private Long id;

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

    private static final long serialVersionUID = 1L;
}