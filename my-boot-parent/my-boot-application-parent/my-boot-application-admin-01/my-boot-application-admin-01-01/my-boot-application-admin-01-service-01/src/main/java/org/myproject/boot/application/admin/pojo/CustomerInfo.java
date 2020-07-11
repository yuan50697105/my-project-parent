package org.myproject.boot.application.admin.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class CustomerInfo implements Serializable {
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

