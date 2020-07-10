package java.org.myproject.boot.application.admin.db.service;

import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.myproject.boot.application.admin.db.converter.TbGoodsInfoConverter;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoExample;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoQuery;
import org.myproject.boot.application.admin.db.service.table.TbGoodsInfoService;
import org.myproject.boot.application.admin.pojo.GoodsInfo;
import org.myproject.boot.application.admin.pojo.GoodsInfoQuery;
import org.myproject.boot.application.admin.pojo.GoodsInfoVo;
import org.myproject.boot.application.admin.service.BGoodsInfoService;
import org.myproject.boot.mybatis.commons.pojo.IPage;
import org.myproject.boot.mybatis.pojo.PageResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: my-boot-application-admin-01-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 16:23
 */
@Service
@AllArgsConstructor
@Transactional
public class BGoodsInfoServiceImpl implements BGoodsInfoService {
    private final TbGoodsInfoService goodsInfoService;
    private final TbGoodsInfoConverter goodsInfoConverter;

    @Override
    public IPage<GoodsInfo> selectByQuery(GoodsInfoQuery query, int page, int size) {
        TbGoodsInfoQuery goodsInfoQuery = goodsInfoConverter.convert(query);
        PageInfo<TbGoodsInfo> pageInfo = goodsInfoService.selectByQuery(goodsInfoQuery, page, size);
        return new PageResult<>(goodsInfoConverter.convert(pageInfo));
    }

    @Override
    public List<GoodsInfo> selectByQuery(GoodsInfoQuery query) {
        TbGoodsInfoQuery goodsInfoQuery = goodsInfoConverter.convert(query);
        List<TbGoodsInfo> list = goodsInfoService.selectByQuery(goodsInfoQuery);
        return goodsInfoConverter.convert(list);
    }

    @Override
    public void insert(GoodsInfoVo vo) {
        TbGoodsInfo entity = goodsInfoConverter.convert(vo);
        goodsInfoService.insert(entity);
    }

    @Override
    public void update(GoodsInfoVo vo) {
        TbGoodsInfo entity = goodsInfoConverter.convert(vo);
        goodsInfoService.updateByPrimaryKeySelective(entity);
    }

    @Override
    public void delete(List<Long> ids) {
        TbGoodsInfoExample example = new TbGoodsInfoExample();
        example.or().andIdIn(ids);
        goodsInfoService.deleteByExample(example);
    }

    @Override
    public void delete(Long id) {
        goodsInfoService.deleteByPrimaryKey(id);
    }

}