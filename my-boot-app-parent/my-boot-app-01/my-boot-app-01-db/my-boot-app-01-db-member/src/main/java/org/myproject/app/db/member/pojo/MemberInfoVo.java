package org.myproject.app.db.member.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-30 11:27
 */
@ApiModel
@EqualsAndHashCode(callSuper = true)
@Data
public class MemberInfoVo extends MemberInfo implements Serializable {
}