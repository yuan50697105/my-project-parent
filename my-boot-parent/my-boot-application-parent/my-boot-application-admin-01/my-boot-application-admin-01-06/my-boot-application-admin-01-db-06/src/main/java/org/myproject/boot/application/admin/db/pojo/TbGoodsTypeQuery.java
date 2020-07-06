package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;
import tk.mybatis.mapper.entity.Example;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_goods_type")
public class TbGoodsTypeQuery extends BaseEntity implements Serializable, MybatisExampleForTk<TbGoodsType, Example> {
    @Column(name = "`name`")
    @AndLike
    private String name;

    private static final long serialVersionUID = 1L;
}