package org.myproject.boot.application.goods.service.api;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.commons.pojo.IPage;
import org.myproject.boot.application.admin.service.pojo.PageResult;
import org.myproject.boot.application.goods.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.goods.db.pojo.TbGoodsInfoQuery;
import org.myproject.boot.application.goods.db.service.TbGoodsInfoService;
import org.myproject.boot.application.goods.service.GoodsConverter;
import org.myproject.boot.application.goods.service.pojo.GoodsInfoAoDTO;
import org.myproject.boot.application.goods.service.pojo.GoodsInfoQueryDTO;
import org.myproject.boot.application.goods.service.pojo.GoodsInfoVoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-09 13:37
 */
@Service
@Transactional
public class GoodsInfoServiceImpl implements GoodsInfoService {
    @Autowired
    private GoodsConverter converter;
    @Autowired
    private TbGoodsInfoService goodsInfoService;

    @Override
    public void save(GoodsInfoVoDTO dto) {
        goodsInfoService.insert(converter.infoVo(dto));
    }

    @Override
    public void delete(Long id) {
        goodsInfoService.deleteByPrimaryKey(id);
    }

    @Override
    public GoodsInfoAoDTO get(Long id) {
        return converter.infoAo(goodsInfoService.selectByPrimaryKey(id));
    }

    @Override
    public List<GoodsInfoAoDTO> list(GoodsInfoQueryDTO queryDTO) {
        TbGoodsInfoQuery query = converter.infoQuery(queryDTO);
        List<TbGoodsInfo> tbGoodsInfos = goodsInfoService.selectByQuery(query);
        return converter.infoAos(tbGoodsInfos);
    }

    @Override
    public IPage<GoodsInfoAoDTO> list(GoodsInfoQueryDTO queryDTO, int page, int limit) {
        TbGoodsInfoQuery query = converter.infoQuery(queryDTO);
        PageInfo<TbGoodsInfo> pageInfo = goodsInfoService.selectByQuery(query, page, limit);
        return new PageResult<>(converter.infoAos(pageInfo));
    }

}