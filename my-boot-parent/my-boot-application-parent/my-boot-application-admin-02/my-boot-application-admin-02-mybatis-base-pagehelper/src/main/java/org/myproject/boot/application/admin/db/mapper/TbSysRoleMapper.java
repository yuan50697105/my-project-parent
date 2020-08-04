package org.myproject.boot.application.admin.db.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbSysRole;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleExample;

@Mapper
public interface TbSysRoleMapper {
    long countByExample(TbSysRoleExample example);

    int deleteByExample(TbSysRoleExample example);

    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(TbSysRole record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TbSysRole record);

    List<TbSysRole> selectByExample(TbSysRoleExample example);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    TbSysRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSysRole record, @Param("example") TbSysRoleExample example);

    int updateByExample(@Param("record") TbSysRole record, @Param("example") TbSysRoleExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TbSysRole record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TbSysRole record);

    int updateBatch(List<TbSysRole> list);

    int updateBatchSelective(List<TbSysRole> list);

    int batchInsert(@Param("list") List<TbSysRole> list);
}