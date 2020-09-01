package org.myproject.app.db.customer.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

/**
 * customer_info
 */
@ApiModel(value = "org-myproject-app-auth-pojo-CustomerInfo")
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerInfoVo extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * code
     */
    @ApiModelProperty(value = "code")
    private String code;
    /**
     * name
     */
    @ApiModelProperty(value = "name")
    private String name;
    /**
     * nickName
     */
    @ApiModelProperty(value = "nickName")
    private String nickName;
    /**
     * type
     */
    @ApiModelProperty(value = "type")
    private String type;
}