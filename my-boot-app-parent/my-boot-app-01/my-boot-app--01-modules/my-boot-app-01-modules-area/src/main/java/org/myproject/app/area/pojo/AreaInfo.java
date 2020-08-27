package org.myproject.app.area.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

/**
 * area_info
 */
@ApiModel(value = "org-myproject-app-area-pojo-AreaInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AreaInfo extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * code
     */
    @ApiModelProperty(value = "code")
    private String code;
    /**
     * pid
     */
    @ApiModelProperty(value = "pid")
    private String pid;
    /**
     * name
     */
    @ApiModelProperty(value = "name")
    private String name;
}