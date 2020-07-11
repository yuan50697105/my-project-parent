package org.myproject.boot.application.admin.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class CustomerTypeQuery implements Serializable {
    /**
     *
     */
    private Long id;

    /**
     *
     */
    private Integer name;

    private static final long serialVersionUID = 1L;
}

