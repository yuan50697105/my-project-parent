package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.analytical.ExampleCriteriaValueImpl4Like;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.entity.Example;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 角色
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_sys_role")
public class TbSysRoleQuery extends TbBaseEntity implements Serializable, MybatisExampleForTk<TbSysRole, Example> {
    private static final long serialVersionUID = 1L;
    @AndLike(type = ExampleCriteriaValueImpl4Like.Type.suffix)
    @Column(name = "`name`")
    private String name;
    @AndEqualTo
    @Column(name = "description")
    private String description;
}