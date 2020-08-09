package org.myproject.boot.application.goods.service.api;

import org.myproject.boot.application.commons.pojo.IPage;
import org.myproject.boot.application.goods.service.pojo.GoodsTypeAoDTO;
import org.myproject.boot.application.goods.service.pojo.GoodsTypeQueryDTO;
import org.myproject.boot.application.goods.service.pojo.GoodsTypeVoDTO;

import java.util.List;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-09 13:35
 */
public interface GoodsTypeService {
    void save(GoodsTypeVoDTO goodsTypeVoDTO);

    void delete(Long id);

    GoodsTypeAoDTO get(Long id);

    List<GoodsTypeAoDTO> list(GoodsTypeQueryDTO queryDTO);

    IPage<GoodsTypeAoDTO> list(GoodsTypeQueryDTO queryDTO, int page, int limit);
}
