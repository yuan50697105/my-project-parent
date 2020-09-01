package org.myproject.app.member.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.myproject.app.db.commons.pojo.BaseQuery;

import java.io.Serializable;

/**
 * member_info
 */
@ApiModel(value = "org-myproject-app-member-pojo-MemberInfo")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@With
public class MemberInfoQuery extends BaseQuery implements Serializable, MybatisExample<MemberInfoExample> {
    private static final long serialVersionUID = 1L;
    /**
     * 会员编号
     */
    @ApiModelProperty(value = "会员编号")
    @AndLike
    private String memberNo;
    /**
     * 会员姓名
     */
    @ApiModelProperty(value = "会员姓名")
    @AndLike
    private String memberName;
    /**
     * 客户ID
     */
    @ApiModelProperty(value = "客户ID")
    @AndEqualTo
    private Long customerId;
    /**
     * 客户编号
     */
    @ApiModelProperty(value = "客户编号")
    @AndLike
    private String customerCode;
    /**
     * 客户类型
     */
    @ApiModelProperty(value = "客户类型")
    @AndLike
    private String customerName;
}