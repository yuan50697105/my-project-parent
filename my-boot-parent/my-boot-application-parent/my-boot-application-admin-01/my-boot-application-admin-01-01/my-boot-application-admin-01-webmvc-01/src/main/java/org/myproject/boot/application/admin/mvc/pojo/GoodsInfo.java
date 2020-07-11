package org.myproject.boot.application.admin.mvc.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class GoodsInfo implements Serializable {
    private Long id;

    private Long code;

    private String name;

    private BigDecimal price;

    private Long typeId;

    private static final long serialVersionUID = 1L;
}