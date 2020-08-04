package org.myproject.boot.application.admin.db.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbSysUserRole;
import org.myproject.boot.application.admin.db.pojo.TbSysUserRoleExample;

@Mapper
public interface TbSysUserRoleMapper {
    long countByExample(TbSysUserRoleExample example);

    int deleteByExample(TbSysUserRoleExample example);

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
    int insert(TbSysUserRole record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TbSysUserRole record);

    List<TbSysUserRole> selectByExample(TbSysUserRoleExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    TbSysUserRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSysUserRole record, @Param("example") TbSysUserRoleExample example);

    int updateByExample(@Param("record") TbSysUserRole record, @Param("example") TbSysUserRoleExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TbSysUserRole record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TbSysUserRole record);

    int updateBatch(List<TbSysUserRole> list);

    int batchInsert(@Param("list") List<TbSysUserRole> list);

    /**
     * delete by primary key
     *
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(@Param("id") Long id, @Param("userId") Long userId, @Param("roleId") Long roleId);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    TbSysUserRole selectByPrimaryKey(@Param("id") Long id, @Param("userId") Long userId, @Param("roleId") Long roleId);

    int updateBatchSelective(List<TbSysUserRole> list);
}