package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndGreaterThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLessThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;
import tk.mybatis.mapper.entity.Example;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_goods_info")
public class TbGoodsInfoQuery extends BaseEntity implements Serializable, MybatisExampleForTk<TbGoodsInfo, Example> {
    public static final String COL_ID = "id";
    public static final String COL_CODE = "code";
    public static final String COL_NAME = "name";
    public static final String COL_PRICE = "price";
    public static final String COL_TYPE_ID = "type_id";
    private static final long serialVersionUID = 1L;
    @Column(name = "code")
    @AndLike
    private Long code;
    @Column(name = "`name`")
    @AndLike
    private String name;
    @Column(name = "price")
    @AndEqualTo
    private BigDecimal price;
    @AndGreaterThanOrEqualTo(property = "price")
    private BigDecimal priceStart;
    @AndLessThanOrEqualTo(property = "price")
    private BigDecimal priceEnd;
    @Column(name = "type_id")
    @AndEqualTo
    private Long typeId;
}