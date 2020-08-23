package org.myproject.app.area.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.myproject.app.commons.pojo.BaseQuery;

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
public class AreaAddressQuery extends BaseQuery implements Serializable, MybatisExample<AreaAddressExample> {
    private static final long serialVersionUID = 1L;
    /**
     * areaId
     */
    @ApiModelProperty(value = "areaId")
    @AndEqualTo
    private Long areaId;
    /**
     * address
     */
    @ApiModelProperty(value = "address")
    @AndLike
    private String address;
}