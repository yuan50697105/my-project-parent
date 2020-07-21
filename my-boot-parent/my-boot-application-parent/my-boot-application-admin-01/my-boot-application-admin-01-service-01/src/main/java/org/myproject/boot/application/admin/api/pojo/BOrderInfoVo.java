package org.myproject.boot.application.admin.api.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@Accessors(chain = true)
public class BOrderInfoVo implements Serializable {
    private static final long serialVersionUID = 1L;
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
    private Op op;

    public enum Op {
        ADD, UPDATE
    }

}

