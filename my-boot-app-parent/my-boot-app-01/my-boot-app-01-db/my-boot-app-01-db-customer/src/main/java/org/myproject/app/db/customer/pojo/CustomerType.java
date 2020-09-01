package org.myproject.app.db.customer.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

/**
 * customer_type
 */
@ApiModel(value = "org-myproject-app-customer-pojo-CustomerType")
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerType extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * name
     */
    @ApiModelProperty(value = "name")
    private String name;
    /**
     * description
     */
    @ApiModelProperty(value = "description")
    private String description;
    /**
     * enabled
     */
    @ApiModelProperty(value = "enabled")
    private Integer enabled;
}