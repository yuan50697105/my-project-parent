package org.myproject.boot.application.admin.db.mapper.pagehelper.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.*;
import org.myproject.mybatis.mapper.pagehelper.pojo.BaseEntity;
import tk.mybatis.mapper.entity.Example;

/**
 * sys_user
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysUserQuery extends BaseEntity implements MybatisExampleForTk<SysUser, Example> {
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