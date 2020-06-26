package test;

import cn.hutool.json.JSONUtil;
import org.junit.jupiter.api.Test;
import org.myproject.boot.mybatis.commons.pojo.AbstractPage;
import org.myproject.boot.mybatis.commons.pojo.IPage;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-27 01:38
 */
public class AA {
    @Test
    void name() {
        IPage<String> iPage = new AbstractPage<>();
        ((AbstractPage<String>) iPage).add("111");
        System.out.println("JSONUtil.toJsonPrettyStr(iPage) = " + JSONUtil.toJsonPrettyStr(iPage));
    }
}