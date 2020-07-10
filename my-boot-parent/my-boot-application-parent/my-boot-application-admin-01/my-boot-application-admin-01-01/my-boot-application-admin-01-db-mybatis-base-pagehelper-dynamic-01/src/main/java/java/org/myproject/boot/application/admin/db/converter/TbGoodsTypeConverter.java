package java.org.myproject.boot.application.admin.db.converter;

import com.github.pagehelper.PageInfo;
import org.mapstruct.Mapper;
import org.myproject.boot.application.admin.db.pojo.TbGoodsType;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeQuery;
import org.myproject.boot.application.admin.db.pojo.TbGoodsTypeVo;
import org.myproject.boot.application.admin.pojo.GoodsType;
import org.myproject.boot.application.admin.pojo.GoodsTypeQuery;
import org.myproject.boot.application.admin.pojo.GoodsTypeVo;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-25 23:16
 */
@Mapper(componentModel = "spring")
public interface TbGoodsTypeConverter {
    TbGoodsType voToPo(TbGoodsTypeVo vo);

    PageInfo<GoodsType> convert(PageInfo<TbGoodsType> pageInfo);

    TbGoodsTypeQuery convert(GoodsTypeQuery query);

    List<GoodsType> convert(List<TbGoodsType> list);

    TbGoodsType convert(GoodsTypeVo vo);

    GoodsType convert(TbGoodsType selectByPrimaryKey);

}
