package org.myproject.boot.application.admin.db.base.sqlhelper.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.*;
import org.myproject.mybatis.sqlhelper.pojo.BaseEntity;

import java.io.Serializable;

/**
    * sys_user
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysUserQuery extends BaseEntity implements Serializable, MybatisExample<SysUserExample> {
    /**
    * 用户名
    */
    @AndLike
    private String username;

    /**
    * 姓名
    */
    @AndLike
    private String name;
    /**
    * 启用状态
    */
    @AndEqualTo
    private String enabled;

    private static final long serialVersionUID = 1L;
}