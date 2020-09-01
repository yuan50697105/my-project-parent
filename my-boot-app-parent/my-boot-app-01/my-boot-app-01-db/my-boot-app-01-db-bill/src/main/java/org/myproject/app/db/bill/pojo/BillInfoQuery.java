package org.myproject.app.db.bill.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.myproject.app.db.commons.pojo.BaseQuery;

import java.io.Serializable;

/**
 * bill_info
 */
@ApiModel(value = "org-myproject-app-bill-pojo-BillInfo")
@Data
@EqualsAndHashCode(callSuper = true)

@AllArgsConstructor
@NoArgsConstructor
public class BillInfoQuery extends BaseQuery implements Serializable, MybatisExample<BillInfoExample> {
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