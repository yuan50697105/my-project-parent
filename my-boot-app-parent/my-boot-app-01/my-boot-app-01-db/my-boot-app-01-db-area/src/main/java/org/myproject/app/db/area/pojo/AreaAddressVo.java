package org.myproject.app.db.area.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

/**
 * area_address
 */
@ApiModel(value = "org-myproject-app-area-pojo-AreaAddress")
@Data
@EqualsAndHashCode(callSuper = true)

@AllArgsConstructor
@NoArgsConstructor
public class AreaAddressVo extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
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
}