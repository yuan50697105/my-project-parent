package org.myproject.cloud.application.admin.api.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class BCustomerInfo implements Serializable {
    private static final long serialVersionUID = 1L;
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
    /**
     *
     */
    private Long typeId;
}

