package org.myproject.app.area.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

/**
 * area_address
 */
@ApiModel(value = "org-myproject-app-area-pojo-AreaAddress")
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AreaAddressVo extends BaseEntity implements Serializable {
    /**
     * areaId
     */
    @ApiModelProperty(value = "areaId")
    private Long areaId;

    /**
     * address
     */
    @ApiModelProperty(value = "address")
    private String address;

    private static final long serialVersionUID = 1L;
}