package java.org.myproject.boot.application.admin.db.service.table;

import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoExample;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoQuery;

import java.util.List;

public interface TbGoodsInfoService {


    long countByExample(TbGoodsInfoExample example);

    int deleteByExample(TbGoodsInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbGoodsInfo record);

    int insertSelective(TbGoodsInfo record);

    List<TbGoodsInfo> selectByExample(TbGoodsInfoExample example);

    TbGoodsInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(TbGoodsInfo record, TbGoodsInfoExample example);

    int updateByExample(TbGoodsInfo record, TbGoodsInfoExample example);

    int updateByPrimaryKeySelective(TbGoodsInfo record);

    int updateByPrimaryKey(TbGoodsInfo record);

    PageInfo<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query, int page, int size);

    List<TbGoodsInfo> selectByQuery(TbGoodsInfoQuery query);
}

