package org.myproject.app.db.bill.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

/**
 * 订单设备信息
 */
@ApiModel(value = "org-myproject-app-bill-pojo-BillDeviceInfo")
@Data
@EqualsAndHashCode(callSuper = true)
public class BillDeviceInfo extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 订单ID
     */
    @ApiModelProperty(value = "订单ID")
    private Long billId;
    /**
     * 设备ID
     */
    @ApiModelProperty(value = "设备ID")
    private Long deviceId;
    /**
     * 设备编号
     */
    @ApiModelProperty(value = "设备编号")
    private String deviceCode;
}