package org.myproject.app.bill.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * bill_item
 */
@ApiModel(value = "org-myproject-app-bill-pojo-BillItem")
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BillItem extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * billId
     */
    @ApiModelProperty(value = "billId")
    private Long billId;
    /**
     * content
     */
    @ApiModelProperty(value = "content")
    private String content;
    /**
     * name
     */
    @ApiModelProperty(value = "name")
    private String name;
    /**
     * quantity
     */
    @ApiModelProperty(value = "quantity")
    private Integer quantity;
    /**
     * unit
     */
    @ApiModelProperty(value = "unit")
    private Integer unit;
    /**
     * unitPrice
     */
    @ApiModelProperty(value = "unitPrice")
    private BigDecimal unitPrice;
    /**
     * totalPrice
     */
    @ApiModelProperty(value = "totalPrice")
    private BigDecimal totalPrice;
}