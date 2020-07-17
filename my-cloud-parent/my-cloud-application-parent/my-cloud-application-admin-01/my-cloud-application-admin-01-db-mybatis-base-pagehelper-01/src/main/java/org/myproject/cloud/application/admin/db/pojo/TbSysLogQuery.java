package org.myproject.cloud.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

@Data
@EqualsAndHashCode(callSuper = true)
public class TbSysLogQuery extends BaseEntity implements MybatisExample<TbSysLogExample> {
    @AndLike
    private String url;

    @AndEqualTo
    private String method;

    @AndLike
    private String params;
}