package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

/**
 * 路由表
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "tb_sys_route")
public class TbSysRouteQuery extends BaseEntity implements Serializable, MybatisExample<TbSysRouteExample> {
    public static final String COL_ID = "id";
    public static final String COL_URL = "url";
    public static final String COL_NAME = "name";
    public static final String COL_PARENT_ID = "parent_id";
    public static final String COL_WEIGHT = "weight";
    private static final long serialVersionUID = 1L;
    @TableField(value = "url")
    @AndLike
    private String url;
    @TableField(value = "name")
    @AndLike
    private String name;
    @TableField(value = "parent_id")
    @AndEqualTo
    private Long parentId;
    @TableField(value = "weight")
    @AndEqualTo
    private Integer weight;
}