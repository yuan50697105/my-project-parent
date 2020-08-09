package org.myproject.boot.application.admin.web.db.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.web.db.pojo.TbSysUser;
import org.myproject.boot.application.admin.web.db.pojo.TbSysUserExample;

import java.util.List;

@Mapper
public interface TbSysUserMapper {
    long countByExample(TbSysUserExample example);

    int deleteByExample(TbSysUserExample example);

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
    int insert(TbSysUser record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TbSysUser record);

    List<TbSysUser> selectByExample(TbSysUserExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    TbSysUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSysUser record, @Param("example") TbSysUserExample example);

    int updateByExample(@Param("record") TbSysUser record, @Param("example") TbSysUserExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TbSysUser record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TbSysUser record);

    int updateBatch(List<TbSysUser> list);

    int updateBatchSelective(List<TbSysUser> list);

    int batchInsert(@Param("list") List<TbSysUser> list);
}