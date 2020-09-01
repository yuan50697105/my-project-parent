package org.myproject.app.db.area.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.myproject.app.db.commons.pojo.BaseQuery;

import java.io.Serializable;

/**
 * area_address
 */
@ApiModel(value = "org-myproject-app-area-pojo-AreaAddress")
@Data
@EqualsAndHashCode(callSuper = true)

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