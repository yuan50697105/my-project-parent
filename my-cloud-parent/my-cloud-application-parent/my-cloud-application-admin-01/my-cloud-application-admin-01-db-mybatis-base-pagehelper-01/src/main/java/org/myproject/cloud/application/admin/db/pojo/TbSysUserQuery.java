package org.myproject.cloud.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * sys_user
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TbSysUserQuery extends BaseEntity implements MybatisExample<TbSysUserExample> {
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