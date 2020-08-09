package org.myproject.boot.application.admin.web.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.analytical.ExampleCriteriaValueImpl4Like;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndGreaterThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLessThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TbSysRoleQuery extends BaseEntity implements Serializable, MybatisExample<TbSysRoleExample> {
    private static final long serialVersionUID = 1L;
    @AndGreaterThanOrEqualTo(property = "createTime")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTimeStart;
    @AndLessThanOrEqualTo(property = "createTime")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTimeEnd;
    @AndLike(type = ExampleCriteriaValueImpl4Like.Type.suffix)
    private String creater;
    @AndEqualTo
    private Integer version;
    @AndEqualTo
    private Integer isDelete;
    @AndLike(type = ExampleCriteriaValueImpl4Like.Type.suffix)
    private String name;
}