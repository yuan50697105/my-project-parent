package org.myproject.boot.application.admin.api;


import org.myproject.boot.application.admin.pojo.GoodsType;
import org.myproject.boot.application.admin.pojo.GoodsTypeQuery;
import org.myproject.boot.application.admin.pojo.GoodsTypeVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 16:03
 */
public interface BGoodsTypeApi {
    IPage<GoodsType> selectByQuery(GoodsTypeQuery query, int page, int size);

    List<GoodsType> selectByQuery(GoodsTypeQuery query);

    GoodsType get(Long id);

    void insert(GoodsTypeVo vo);

    void update(GoodsTypeVo vo);

    void delete(List<Long> ids);

    void delete(Long id);
}
