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
 * area_info
 */
@ApiModel(value = "org-myproject-app-area-pojo-AreaInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AreaInfo extends BaseEntity implements Serializable {
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

    private static final long serialVersionUID = 1L;
}