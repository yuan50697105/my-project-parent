package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.analytical.ExampleCriteriaValueImpl4Like;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndGreaterThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLessThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TbSysRole extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @AndGreaterThanOrEqualTo(property = "createTime")
    private Date createTimeStart;
    @AndLessThanOrEqualTo(property = "createTime")
    private Date createTimeEnd;
    @AndLike
    private String creater;
    @AndEqualTo
    private Integer version;
    @AndEqualTo
    private Integer isDelete;
    @AndLike(type = ExampleCriteriaValueImpl4Like.Type.suffix)
    private String name;
}