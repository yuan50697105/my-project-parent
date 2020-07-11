package org.myproject.boot.application.admin.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class CustomerLog implements Serializable {
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

