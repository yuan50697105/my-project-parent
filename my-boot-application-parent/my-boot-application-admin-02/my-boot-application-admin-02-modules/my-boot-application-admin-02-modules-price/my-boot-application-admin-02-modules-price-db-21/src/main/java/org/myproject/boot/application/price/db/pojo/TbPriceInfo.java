package org.myproject.boot.application.price.db.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
    * 定价信息
    */
@Data
@EqualsAndHashCode(callSuper=true)
@TableName(value = "tb_price_info")
public class TbPriceInfo extends BaseEntity implements Serializable {
    @TableField(value = "create_time")
    private Date createTime;

    @TableField(value = "update_time")
    private Date updateTime;

    @TableField(value = "creater")
    private String creater;

    @TableField(value = "modifier")
    private String modifier;

    @TableField(value = "version")
    private Integer version;

    @TableField(value = "is_delete")
    private Integer isDelete;

    @TableField(value = "`name`")
    private String name;

    @TableField(value = "code")
    private Long code;

    /**
     * 定价
     */
    @TableField(value = "price")
    private BigDecimal price;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";

    public static final String COL_CREATER = "creater";

    public static final String COL_MODIFIER = "modifier";

    public static final String COL_VERSION = "version";

    public static final String COL_IS_DELETE = "is_delete";

    public static final String COL_NAME = "name";

    public static final String COL_CODE = "code";

    public static final String COL_PRICE = "price";
}