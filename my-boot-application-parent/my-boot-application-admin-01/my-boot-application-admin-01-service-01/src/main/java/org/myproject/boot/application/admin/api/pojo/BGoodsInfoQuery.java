package org.myproject.boot.application.admin.api.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@Accessors(chain = true)
public class BGoodsInfoQuery extends BBaserQuery implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    private Long id;
    /**
     *
     */
    private Long code;
    /**
     *
     */
    private String name;
    /**
     *
     */
    private BigDecimal price;
    /**
     *
     */
    private Long typeId;
}

