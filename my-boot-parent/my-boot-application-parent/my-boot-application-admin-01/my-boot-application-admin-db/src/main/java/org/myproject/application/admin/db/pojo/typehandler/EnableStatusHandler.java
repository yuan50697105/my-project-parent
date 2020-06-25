package org.myproject.application.admin.db.pojo.typehandler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;
import org.myproject.application.admin.db.pojo.enumerate.EnableStatus;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 13:00
 */
public class EnableStatusHandler implements TypeHandler<EnableStatus> {
    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, EnableStatus enableStatus, JdbcType jdbcType) throws SQLException {

    }

    @Override
    public EnableStatus getResult(ResultSet resultSet, String s) throws SQLException {
        return null;
    }

    @Override
    public EnableStatus getResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    @Override
    public EnableStatus getResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}