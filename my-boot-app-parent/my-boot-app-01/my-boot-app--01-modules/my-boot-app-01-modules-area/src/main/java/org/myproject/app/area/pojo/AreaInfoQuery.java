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
 * area_info
 */
@ApiModel(value = "org-myproject-app-area-pojo-AreaInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AreaInfoQuery extends BaseQuery implements Serializable, MybatisExample<AreaInfoExample> {
    private static final long serialVersionUID = 1L;
    /**
     * code
     */
    @ApiModelProperty(value = "code")
    @AndLike
    private String code;
    /**
     * pid
     */
    @ApiModelProperty(value = "pid")
    @AndEqualTo
    private String pid;
    /**
     * name
     */
    @ApiModelProperty(value = "name")
    @AndLike
    private String name;
}