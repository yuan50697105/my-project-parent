package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.analytical.ExampleCriteriaValueImpl4Like;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndGreaterThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLessThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.util.Date;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-27 21:57
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TbBaseQuery extends BaseEntity {
    private int page = 1;
    private int size = 20;
    @AndGreaterThanOrEqualTo(property = "createTime")
    private Date createTimeStart;
    @AndLessThanOrEqualTo(property = "createTime")
    private Date createDateEnd;
    @AndGreaterThanOrEqualTo(property = "updateTime")
    private Date updateTimeStart;
    @AndLessThanOrEqualTo(property = "updateTime")
    private Date updateTimeEnd;
    @AndLike(type = ExampleCriteriaValueImpl4Like.Type.suffix)
    private String creater;
    @AndLike(type = ExampleCriteriaValueImpl4Like.Type.suffix)
    private String modifier;
    @AndEqualTo
    private Integer version;
    @AndEqualTo
    private Integer isDelete;
}