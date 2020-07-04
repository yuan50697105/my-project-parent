package org.myproject.boot.application.admin.db.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;import org.myproject.boot.application.admin.db.pojo.SysRoute;import org.myproject.boot.application.admin.db.pojo.SysRouteExample;import java.util.List;

@Mapper
public interface SysRouteMapper extends tk.mybatis.mapper.common.Mapper<SysRoute> {
    long countByExample(SysRouteExample example);

    int deleteByExample(SysRouteExample example);

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
    int insert(SysRoute record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(SysRoute record);

    List<SysRoute> selectByExample(SysRouteExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    SysRoute selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysRoute record, @Param("example") SysRouteExample example);

    int updateByExample(@Param("record") SysRoute record, @Param("example") SysRouteExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SysRoute record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SysRoute record);
}