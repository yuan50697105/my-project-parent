package org.myproject.boot.application.admin.db.mapper.sqlhelper.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.*;
import org.myproject.mybatis.mapper.sqlhelper.pojo.BaseEntity;
import tk.mybatis.mapper.entity.Example;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * sys_user
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sys_user")
public class SysUserQuery extends BaseEntity implements Serializable, MybatisExampleForTk<SysUser, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * 用户名
     */
    @AndLike
    @Column(name = "username")
    private String username;
    /**
     * 姓名
     */
    @AndLike
    @Column(name = "`name`")
    private String name;
    /**
     * 启用状态
     */
    @AndEqualTo
    @Column(name = "enabled")
    private String enabled;
}