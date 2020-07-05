package org.myproject.boot.application.admin.db.service.business;

import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoQuery;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoVo;
import org.myproject.boot.mybatis.pojo.PageResult;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-03
 * @description:
 * @author: yuane
 * @create: 2020-07-05 23:03
 */
public interface BGoodsInfoService {
    PageResult<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query, int page, int size);

    List<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query);

    TbGoodsInfo selectById(Long id);

    void save(TbGoodsInfoVo vo);

    void update(TbGoodsInfoVo vo);

    void delete(List<Long> ids);

    void delete(Long id);
}
