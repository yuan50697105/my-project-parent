package org.myproject.boot.application.admin.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.util.Date;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-27 21:59
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TbBaseEntity extends BaseEntity {
    private Date createTime;
    private Date updateTime;
    private String creater;
    private String modifier;
    private Integer version;
    private Integer isDelete;
}