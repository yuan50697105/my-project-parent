package org.myproject.boot.application.goods.service.api;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.commons.pojo.IPage;
import org.myproject.boot.application.goods.db.pojo.TbGoodsType;
import org.myproject.boot.application.goods.db.pojo.TbGoodsTypeQuery;
import org.myproject.boot.application.goods.db.service.TbGoodsTypeService;
import org.myproject.boot.application.goods.service.GoodsConverter;
import org.myproject.boot.application.goods.service.pojo.GoodsTypeAoDTO;
import org.myproject.boot.application.goods.service.pojo.GoodsTypeQueryDTO;
import org.myproject.boot.application.goods.service.pojo.GoodsTypeVoDTO;
import org.myproject.boot.application.goods.service.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-09 13:36
 */
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {
    @Autowired
    private GoodsConverter converter;
    @Autowired
    private TbGoodsTypeService goodsTypeService;

    @Override
    public void save(GoodsTypeVoDTO goodsTypeVoDTO) {
        TbGoodsType tbGoodsType = converter.typeVo(goodsTypeVoDTO);
        goodsTypeService.insert(tbGoodsType);
    }

    @Override
    public void delete(Long id) {
        goodsTypeService.deleteByPrimaryKey(id);
    }

    @Override
    public GoodsTypeAoDTO get(Long id) {
        TbGoodsType tbGoodsType = goodsTypeService.selectByPrimaryKey(id);
        return converter.typeAo(tbGoodsType);
    }

    @Override
    public List<GoodsTypeAoDTO> list(GoodsTypeQueryDTO queryDTO) {
        TbGoodsTypeQuery query = converter.typeQuery(queryDTO);
        List<TbGoodsType> list = goodsTypeService.selectByQuery(query);
        return converter.typeAos(list);
    }

    @Override
    public IPage<GoodsTypeAoDTO> list(GoodsTypeQueryDTO queryDTO, int page, int limit) {
        TbGoodsTypeQuery query = converter.typeQuery(queryDTO);
        PageInfo<TbGoodsType> pageInfo = goodsTypeService.selectByQuery(query, page, limit);
        return new PageResult<>(converter.typeAos(pageInfo));
    }
}