package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;
import tk.mybatis.mapper.entity.Example;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 路由表
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_sys_route")
public class TbSysRouteQuery extends BaseEntity implements Serializable, MybatisExampleForTk<TbSysRoute, Example> {
    public static final String COL_ID = "id";
    public static final String COL_URL = "url";
    public static final String COL_NAME = "name";
    public static final String COL_PARENT_ID = "parent_id";
    public static final String COL_WEIGHT = "weight";
    private static final long serialVersionUID = 1L;
    @Column(name = "url")
    private String url;
    @Column(name = "`name`")
    @AndLike
    private String name;
    @Column(name = "parent_id")
    private Long parentId;
    @Column(name = "weight")
    private Integer weight;
}