package org.myproject.boot.application.admin.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel(value = "org-myproject-boot-application-admin-pojo-CustomerInfo")
@Data
public class CustomerInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private Long id;
    /**
     * name
     */
    @ApiModelProperty(value = "name")
    private String name;
    /**
     * namePy
     */
    @ApiModelProperty(value = "namePy")
    private String namePy;
    /**
     * namePyF
     */
    @ApiModelProperty(value = "namePyF")
    private String namePyF;
    /**
     * phone
     */
    @ApiModelProperty(value = "phone")
    private String phone;
    /**
     * age
     */
    @ApiModelProperty(value = "age")
    private Integer age;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private Long typeId;
}
