package org.myproject.app.price.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * price_info
 */
@ApiModel(value = "org-myproject-app-price-pojo-PriceInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PriceInfo extends BaseEntity implements Serializable {
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