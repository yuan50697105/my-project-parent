package org.myproject.app.bill.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * bill_info
 */
@ApiModel(value = "org-myproject-app-bill-pojo-BillInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BillInfoVo extends BaseEntity implements Serializable {
    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private Long id;

    /**
     * 订单号
     */
    @ApiModelProperty(value = "订单号")
    private String billNo;

    /**
     * 交易号
     */
    @ApiModelProperty(value = "交易号")
    private String transactionNo;

    /**
     * 交易平台
     */
    @ApiModelProperty(value = "交易平台")
    private String tradingPlatform;

    /**
     * 客户ID
     */
    @ApiModelProperty(value = "客户ID")
    private Long customerId;

    /**
     * 客户编号
     */
    @ApiModelProperty(value = "客户编号")
    private String customerNo;

    /**
     * 客户姓名
     */
    @ApiModelProperty(value = "客户姓名")
    private String customerName;

    /**
     * 总价
     */
    @ApiModelProperty(value = "总价")
    private BigDecimal totalPrice;

    private static final long serialVersionUID = 1L;
}