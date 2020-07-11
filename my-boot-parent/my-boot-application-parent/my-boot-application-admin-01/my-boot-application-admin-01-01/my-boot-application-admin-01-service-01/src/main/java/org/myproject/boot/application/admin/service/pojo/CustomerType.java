package org.myproject.boot.application.admin.service.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class CustomerType implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    private Long id;
    /**
     *
     */
    private Integer name;
}

