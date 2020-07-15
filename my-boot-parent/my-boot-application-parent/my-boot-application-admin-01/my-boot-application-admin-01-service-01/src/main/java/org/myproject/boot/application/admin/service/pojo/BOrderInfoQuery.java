package org.myproject.boot.application.admin.service.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class BOrderInfoQuery implements Serializable {
    /**
     *
     */
    private Long id;

    /**
     *
     */
    private String orderNo;

    /**
     *
     */
    private Long customerId;

    /**
     *
     */
    private Integer customerName;

    /**
     *
     */
    private BigDecimal totalPrice;

    private static final long serialVersionUID = 1L;
}

