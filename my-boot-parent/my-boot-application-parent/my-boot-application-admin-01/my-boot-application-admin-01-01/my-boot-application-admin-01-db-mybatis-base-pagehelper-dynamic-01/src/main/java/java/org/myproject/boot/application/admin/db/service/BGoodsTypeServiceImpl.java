package java.org.myproject.boot.application.admin.db.service;

import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.converter.TbGoodsTypeConverter;
import org.myproject.boot.application.admin.db.pojo.TbGoodsType;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeExample;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeQuery;
import org.myproject.boot.application.admin.db.service.table.TbGoodsTypeService;
import org.myproject.boot.application.admin.pojo.GoodsType;
import org.myproject.boot.application.admin.pojo.GoodsTypeQuery;
import org.myproject.boot.application.admin.pojo.GoodsTypeVo;
import org.myproject.boot.application.admin.service.BGoodsTypeService;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 16:04
 */
@Service
@Transactional
@AllArgsConstructor
public class BGoodsTypeServiceImpl implements BGoodsTypeService {
    private final TbGoodsTypeService goodsTypeService;
    private final TbGoodsTypeConverter goodsTypeConverter;

    @Override
    public IPage<GoodsType> selectByQuery(GoodsTypeQuery query, int page, int size) {
        TbGoodsTypeQuery goodsTypeQuery = goodsTypeConverter.convert(query);
        PageInfo<TbGoodsType> pageInfo = goodsTypeService.selectByQuery(goodsTypeQuery, page, size);
        return new PageResult<>(goodsTypeConverter.convert(pageInfo));
    }

    @Override
    public List<GoodsType> selectByQuery(GoodsTypeQuery query) {
        TbGoodsTypeQuery goodsTypeQuery = goodsTypeConverter.convert(query);
        List<TbGoodsType> list = goodsTypeService.selectByQuery(goodsTypeQuery);
        return goodsTypeConverter.convert(list);
    }

    @Override
    public void insert(GoodsTypeVo vo) {
        TbGoodsType goodsType = goodsTypeConverter.convert(vo);
        goodsTypeService.insert(goodsType);
    }

    @Override
    public void update(GoodsTypeVo vo) {
        TbGoodsType goodsType = goodsTypeConverter.convert(vo);
        goodsTypeService.updateByPrimaryKeySelective(goodsType);
    }

    @Override
    public void delete(List<Long> ids) {
        TbGoodsTypeExample example = new TbGoodsTypeExample();
        example.or().andIdIn(ids);
        goodsTypeService.deleteByExample(example);
    }

    @Override
    public void delete(Long id) {
        goodsTypeService.deleteByPrimaryKey(id);
    }

    @Override
    public GoodsType selectById(Long id) {
        TbGoodsType tbGoodsType = goodsTypeService.selectByPrimaryKey(id);
        return goodsTypeConverter.convert(tbGoodsType);
    }


}