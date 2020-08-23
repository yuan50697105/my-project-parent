package org.myproject.app.area.pojo;

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
 * area_address
 */
@ApiModel(value = "org-myproject-app-area-pojo-AreaAddress")
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AreaAddress extends BaseEntity implements Serializable {
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