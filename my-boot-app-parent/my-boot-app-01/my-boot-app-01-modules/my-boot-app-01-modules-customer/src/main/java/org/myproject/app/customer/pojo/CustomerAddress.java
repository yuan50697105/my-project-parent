package org.myproject.app.customer.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

@ApiModel(value = "org-myproject-app-customer-pojo-CustomerAddress")
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerAddress extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "")
    private Long customerId;
    @ApiModelProperty(value = "")
    private String address;
}