package org.myproject.boot.application.admin.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class CustomerInfoQuery implements Serializable {
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

