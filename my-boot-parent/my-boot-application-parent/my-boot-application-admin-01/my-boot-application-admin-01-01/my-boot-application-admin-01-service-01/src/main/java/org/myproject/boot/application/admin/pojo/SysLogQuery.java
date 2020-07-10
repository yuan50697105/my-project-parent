package org.myproject.boot.application.admin.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel(value = "org-myproject-boot-application-admin-pojo-SysLog")
@Data
public class SysLogQuery implements Serializable {
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
    private String url;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private String method;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private String params;
}

