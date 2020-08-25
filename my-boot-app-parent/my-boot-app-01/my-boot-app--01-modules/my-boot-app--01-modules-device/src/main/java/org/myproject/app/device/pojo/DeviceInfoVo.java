package org.myproject.app.device.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

/**
 * device_info
 */
@ApiModel(value = "org-myproject-app-device-pojo-DeviceInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@With
public class DeviceInfoVo extends BaseEntity implements Serializable {
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
     * typeId
     */
    @ApiModelProperty(value = "typeId")
    private Long typeId;
    /**
     * status
     */
    @ApiModelProperty(value = "status")
    private String status;
}