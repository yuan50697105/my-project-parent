package org.myproject.cloud.application.admin.api.base;


import org.myproject.cloud.application.admin.api.pojo.BGoodsType;
import org.myproject.cloud.application.admin.api.pojo.BGoodsTypeQuery;
import org.myproject.cloud.application.admin.api.pojo.BGoodsTypeVo;
import org.myproject.cloud.application.admin.api.pojo.IPage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 16:03
 */

@RequestMapping("goods/type")
@ResponseBody
public interface BGoodsTypeApi {
    @GetMapping("data")
    IPage<BGoodsType> selectByQuery(BGoodsTypeQuery query, int page, int size);

    @GetMapping("list")
    List<BGoodsType> selectByQuery(BGoodsTypeQuery query);

    @GetMapping("{id}")
    BGoodsType get(@PathVariable Long id);

    @PostMapping()
    void save(@RequestBody BGoodsTypeVo vo);

    @PutMapping
    void update(@RequestBody BGoodsTypeVo vo);

    @DeleteMapping(params = "ids")
    void delete(List<Long> ids);

    @DeleteMapping("{id}")
    void delete(@PathVariable Long id);
}
