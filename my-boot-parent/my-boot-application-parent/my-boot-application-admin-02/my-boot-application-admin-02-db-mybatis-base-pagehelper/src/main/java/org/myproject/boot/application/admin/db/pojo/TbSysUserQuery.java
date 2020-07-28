package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.analytical.ExampleCriteriaValueImpl4Like;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 系统用户
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TbSysUserQuery extends TbBaseQuery implements Serializable, MybatisExample<TbSysUserExample> {
    private static final long serialVersionUID = 1L;
    @AndLike(type = ExampleCriteriaValueImpl4Like.Type.suffix)
    private String username;
    @AndLike(type = ExampleCriteriaValueImpl4Like.Type.suffix)
    private String name;
}