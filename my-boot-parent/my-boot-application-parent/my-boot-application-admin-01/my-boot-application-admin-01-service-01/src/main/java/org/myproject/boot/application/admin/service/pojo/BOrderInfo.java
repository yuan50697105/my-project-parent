package org.myproject.boot.application.admin.service.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class BOrderInfo implements Serializable {
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

