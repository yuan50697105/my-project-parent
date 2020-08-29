package org.myproject.app.device.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * device_info
 */
@ApiModel(value = "org-myproject-app-device-pojo-DeviceInfo")
@Data
@EqualsAndHashCode(callSuper = true)

@AllArgsConstructor
@NoArgsConstructor
public class DeviceInfo extends BaseEntity implements Serializable {
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
    /**
     * 启用时间
     */
    @ApiModelProperty(value = "启用时间")
    private Date startTime;
    /**
     * 停用时间
     */
    @ApiModelProperty(value = "停用时间")
    private Date endTime;

    public org.myproject.app.device.pojo.DeviceInfo withCode(String code) {
        return this.code == code ? this : new org.myproject.app.device.pojo.DeviceInfo(code, this.name, this.typeId, this.status, this.startTime, this.endTime);
    }

    public org.myproject.app.device.pojo.DeviceInfo withName(String name) {
        return this.name == name ? this : new org.myproject.app.device.pojo.DeviceInfo(this.code, name, this.typeId, this.status, this.startTime, this.endTime);
    }

    public org.myproject.app.device.pojo.DeviceInfo withTypeId(Long typeId) {
        return this.typeId == typeId ? this : new org.myproject.app.device.pojo.DeviceInfo(this.code, this.name, typeId, this.status, this.startTime, this.endTime);
    }

    public org.myproject.app.device.pojo.DeviceInfo withStatus(String status) {
        return this.status == status ? this : new org.myproject.app.device.pojo.DeviceInfo(this.code, this.name, this.typeId, status, this.startTime, this.endTime);
    }

    public org.myproject.app.device.pojo.DeviceInfo withStartTime(Date startTime) {
        return this.startTime == startTime ? this : new org.myproject.app.device.pojo.DeviceInfo(this.code, this.name, this.typeId, this.status, startTime, this.endTime);
    }

    public org.myproject.app.device.pojo.DeviceInfo withEndTime(Date endTime) {
        return this.endTime == endTime ? this : new org.myproject.app.device.pojo.DeviceInfo(this.code, this.name, this.typeId, this.status, this.startTime, endTime);
    }

    public DeviceInfoBuilder toBuilder() {
        return new DeviceInfoBuilder().code(this.code).name(this.name).typeId(this.typeId).status(this.status).startTime(this.startTime).endTime(this.endTime);
    }
}