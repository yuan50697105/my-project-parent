package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

@Data
@EqualsAndHashCode(callSuper=true)
public class TbCustomerLogQuery extends BaseEntity implements MybatisExample<TbCustomerTypeExample> {
    @AndEqualTo
    private Long customerId;

    @AndLike
    private String customerName;

}