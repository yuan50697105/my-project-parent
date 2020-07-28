package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.analytical.ExampleCriteriaValueImpl4Like;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 角色
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TbSysPermissionQuery extends TbBaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;
    @AndLike(type = ExampleCriteriaValueImpl4Like.Type.suffix)
    private String name;
    @AndEqualTo
    private Long roleId;
}