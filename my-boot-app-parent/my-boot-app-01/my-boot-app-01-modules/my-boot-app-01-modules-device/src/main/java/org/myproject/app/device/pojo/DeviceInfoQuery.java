package org.myproject.app.device.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.myproject.app.commons.pojo.BaseQuery;

import java.io.Serializable;

/**
 * device_info
 */
@ApiModel(value = "org-myproject-app-device-pojo-DeviceInfo")
@Data
@EqualsAndHashCode(callSuper = true)

@AllArgsConstructor
@NoArgsConstructor
@With
public class DeviceInfoQuery extends BaseQuery implements Serializable, MybatisExample<DeviceInfoExample> {
    private static final long serialVersionUID = 1L;
    /**
     * code
     */
    @ApiModelProperty(value = "code")
    @AndLike
    private String code;
    /**
     * name
     */
    @ApiModelProperty(value = "name")
    @AndLike
    private String name;
    /**
     * typeId
     */
    @ApiModelProperty(value = "typeId")
    @AndEqualTo
    private Long typeId;
    /**
     * status
     */
    @ApiModelProperty(value = "status")
    @AndEqualTo
    private String status;
}