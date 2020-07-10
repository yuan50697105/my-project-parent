package org.myproject.boot.application.admin.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel(value = "org-myproject-boot-application-admin-pojo-SysRoute")
@Data
public class SysRoute implements Serializable {
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
    private String name;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private Long parentId;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private Integer weight;
}
