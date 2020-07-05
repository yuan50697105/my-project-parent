package org.myproject.boot.application.admin.db.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.SysRoleRoute;
import org.myproject.boot.application.admin.db.pojo.SysRoleRouteExample;

import java.util.List;

@Mapper
public interface SysRoleRouteMapper {
    long countByExample(SysRoleRouteExample example);

    int deleteByExample(SysRoleRouteExample example);

    /**
     * delete by primary key
     *
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(SysRoleRoute record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(SysRoleRoute record);

    List<SysRoleRoute> selectByExample(SysRoleRouteExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    SysRoleRoute selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysRoleRoute record, @Param("example") SysRoleRouteExample example);

    int updateByExample(@Param("record") SysRoleRoute record, @Param("example") SysRoleRouteExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SysRoleRoute record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SysRoleRoute record);
}