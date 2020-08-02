package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.analytical.ExampleCriteriaValueImpl4Like;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.entity.Example;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 系统用户
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_sys_user")
public class TbSysUserQuery extends TbBaseEntity implements Serializable, MybatisExampleForTk<TbSysUser, Example> {
    private static final long serialVersionUID = 1L;
    @Column(name = "username")
    @AndLike(type = ExampleCriteriaValueImpl4Like.Type.suffix)
    private String username;
    @Column(name = "`name`")
    @AndLike(type = ExampleCriteriaValueImpl4Like.Type.suffix)
    private String name;
}