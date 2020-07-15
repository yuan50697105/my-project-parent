package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;
import tk.mybatis.mapper.entity.Example;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_sys_log")
public class TbSysLogQuery extends BaseEntity implements Serializable, MybatisExampleForTk<TbSysLog, Example> {
    public static final String COL_ID = "id";
    public static final String COL_URL = "url";
    public static final String COL_METHOD = "method";
    public static final String COL_PARAMS = "params";
    private static final long serialVersionUID = 1L;
    @Column(name = "url")
    private String url;
    @Column(name = "`method`")
    private String method;
    @Column(name = "params")
    private String params;
}