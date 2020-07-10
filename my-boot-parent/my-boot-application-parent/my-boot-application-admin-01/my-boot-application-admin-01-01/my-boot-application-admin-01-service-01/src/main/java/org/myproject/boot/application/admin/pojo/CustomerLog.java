package org.myproject.boot.application.admin.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel(value = "org-myproject-boot-application-admin-pojo-CustomerLog")
@Data
public class CustomerLog implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private Long id;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private Long customerId;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private String customerName;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private String content;
}
