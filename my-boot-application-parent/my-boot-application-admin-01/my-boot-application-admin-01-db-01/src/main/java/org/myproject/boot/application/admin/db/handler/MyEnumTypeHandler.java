package org.myproject.boot.application.admin.db.handler;

import cn.hutool.core.util.ObjectUtil;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-25 22:38
 */
public class MyEnumTypeHandler<E extends Enum<E> & BaseEnum<E>> extends BaseTypeHandler<E> {
    private final Class<E> type;
    private final E[] es;

    public MyEnumTypeHandler(Class<E> type) {
        if (ObjectUtil.isEmpty(type)) {
            throw new IllegalArgumentException("");
        }
        this.type = type;
        this.es = this.type.getEnumConstants();
        if (ObjectUtil.isEmpty(this.es)) {
            throw new IllegalArgumentException("");
        }
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, E parameter, JdbcType jdbcType) throws SQLException {
        if (ObjectUtil.isNotEmpty(jdbcType)) {
            ps.setObject(i, parameter.getCode(), jdbcType.TYPE_CODE);
        } else {
            ps.setObject(i, parameter.getCode());
        }
    }

    @Override
    public E getNullableResult(ResultSet rs, String columnName) throws SQLException {
        int i = rs.getInt(columnName);
        if (rs.wasNull()) {
            return null;
        } else {
            try {
                return getEnum(i);
            } catch (Exception ex) {
                throw new IllegalArgumentException("Cannot convert " + i + " to " + type.getSimpleName() + " by ordinal value.", ex);
            }
        }
    }

    @Override
    public E getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        int i = rs.getInt(columnIndex);
        if (rs.wasNull()) {
            return null;
        } else {
            try {
                return getEnum(i);
            } catch (Exception ex) {
                throw new IllegalArgumentException("Cannot convert " + i + " to " + type.getSimpleName() + " by ordinal value.", ex);
            }
        }
    }

    @Override
    public E getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        int i = cs.getInt(columnIndex);
        if (cs.wasNull()) {
            return null;
        } else {
            try {
                return getEnum(i);
            } catch (Exception ex) {
                throw new IllegalArgumentException("Cannot convert " + i + " to " + type.getSimpleName() + " by ordinal value.", ex);
            }
        }
    }


    private E getEnum(int code) {

        for (E tmpE : this.es) {

            if (tmpE.getCode() == code) {
                return tmpE;
            }
        }
        return null;
    }
}