package org.myproject.boot.application.admin.db.service.business;

import org.myproject.boot.application.admin.db.pojo.TbGoodsType;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeQuery;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeVo;
import org.myproject.boot.mybatis.pojo.PageResult;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-07
 * @description:
 * @author: yuane
 * @create: 2020-07-06 21:49
 */
public interface BGoodsTypeService {
    PageResult<TbGoodsType>  selectByQuery(TbGoodsTypeQuery query, int page, int size);

    List<TbGoodsType> selectByQuery(TbGoodsTypeQuery query);

    TbGoodsType selectById(Long id);

    void save(TbGoodsTypeVo sysUser);

    void update(TbGoodsTypeVo sysUserVo);

    void delete(List<Long> ids);

    void delete(Long id);
}
