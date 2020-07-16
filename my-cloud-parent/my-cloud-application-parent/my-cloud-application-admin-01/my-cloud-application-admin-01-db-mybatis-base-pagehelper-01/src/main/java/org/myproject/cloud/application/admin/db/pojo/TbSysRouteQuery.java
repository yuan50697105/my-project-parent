package org.myproject.cloud.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * 路由表
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TbSysRouteQuery extends BaseEntity implements MybatisExample<TbSysRouteExample> {
    @AndLike
    private String url;

    @AndLike
    private String name;

}