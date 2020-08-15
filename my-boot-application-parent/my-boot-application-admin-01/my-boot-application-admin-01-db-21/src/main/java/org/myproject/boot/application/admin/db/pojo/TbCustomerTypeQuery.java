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

@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_customer_type")
public class TbCustomerTypeQuery extends BaseEntity implements Serializable, MybatisExampleForTk<TbCustomerType, Example> {
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    private static final long serialVersionUID = 1L;
    @Column(name = "`name`")
    @AndLike
    private Integer name;
}