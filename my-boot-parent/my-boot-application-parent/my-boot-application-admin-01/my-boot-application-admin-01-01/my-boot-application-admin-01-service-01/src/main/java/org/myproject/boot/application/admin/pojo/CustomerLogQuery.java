package org.myproject.boot.application.admin.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class CustomerLogQuery implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    private Long id;
    /**
     *
     */
    private Long customerId;
    /**
     *
     */
    private String customerName;
    /**
     *
     */
    private String content;
}

