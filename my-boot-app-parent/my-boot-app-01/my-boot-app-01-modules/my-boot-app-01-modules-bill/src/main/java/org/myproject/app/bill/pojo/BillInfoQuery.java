package org.myproject.app.bill.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

/**
 * bill_info
 */
@ApiModel(value = "org-myproject-app-bill-pojo-BillInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BillInfoQuery extends BaseEntity implements Serializable, MybatisExample<BillInfoExample> {
    private static final long serialVersionUID = 1L;
    /**
     * 订单号
     */
    @ApiModelProperty(value = "订单号")
    @AndLike
    private String billNo;
    /**
     * 交易号
     */
    @ApiModelProperty(value = "交易号")
    @AndLike
    private String transactionNo;
    /**
     * 交易平台
     */
    @ApiModelProperty(value = "交易平台")
    @AndEqualTo
    private String tradingPlatform;
    /**
     * 客户ID
     */
    @ApiModelProperty(value = "客户ID")
    @AndEqualTo
    private Long customerId;
    /**
     * 客户编号
     */
    @ApiModelProperty(value = "客户编号")
    @AndLike
    private String customerNo;
    /**
     * 客户姓名
     */
    @ApiModelProperty(value = "客户姓名")
    @AndLike
    private String customerName;
}