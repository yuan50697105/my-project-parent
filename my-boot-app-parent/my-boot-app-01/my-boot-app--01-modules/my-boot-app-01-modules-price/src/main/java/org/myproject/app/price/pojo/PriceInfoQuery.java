package org.myproject.app.price.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * price_info
 */
@ApiModel(value = "org-myproject-app-price-pojo-PriceInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PriceInfoQuery extends BaseEntity implements Serializable {
    /**
     * code
     */
    @ApiModelProperty(value = "code")
    private String code;

    /**
     * type
     */
    @ApiModelProperty(value = "type")
    private String type;

    /**
     * point
     */
    @ApiModelProperty(value = "point")
    private Integer point;

    /**
     * price
     */
    @ApiModelProperty(value = "price")
    private BigDecimal price;

    /**
     * internal
     */
    @ApiModelProperty(value = "internal")
    private BigDecimal internal;

    private static final long serialVersionUID = 1L;
}