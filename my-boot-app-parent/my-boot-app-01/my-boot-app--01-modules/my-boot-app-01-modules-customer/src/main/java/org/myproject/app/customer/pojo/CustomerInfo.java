package org.myproject.app.customer.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * customer_info
 */
@ApiModel(value = "org-myproject-app-customer-pojo-CustomerInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerInfo extends BaseEntity implements Serializable {
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

    private static final long serialVersionUID = 1L;
}