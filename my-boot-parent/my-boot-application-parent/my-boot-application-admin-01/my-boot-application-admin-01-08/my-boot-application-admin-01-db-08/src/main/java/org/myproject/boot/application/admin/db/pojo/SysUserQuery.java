package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * sys_user
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SysUserQuery extends BaseEntity implements Serializable, MybatisExampleForTk<SysUser, Example> {
    private static final long serialVersionUID = 1L;
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
}