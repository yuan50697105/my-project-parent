package org.myproject.boot.application.admin.db.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbCustomerType;
import org.myproject.boot.application.admin.db.pojo.TbCustomerTypeExample;

import java.util.List;

@Mapper
public interface TbCustomerTypeMapper {
    long countByExample(TbCustomerTypeExample example);

    int deleteByExample(TbCustomerTypeExample example);

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
    int insert(TbCustomerType record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TbCustomerType record);

    List<TbCustomerType> selectByExample(TbCustomerTypeExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    TbCustomerType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbCustomerType record, @Param("example") TbCustomerTypeExample example);

    int updateByExample(@Param("record") TbCustomerType record, @Param("example") TbCustomerTypeExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TbCustomerType record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TbCustomerType record);
}