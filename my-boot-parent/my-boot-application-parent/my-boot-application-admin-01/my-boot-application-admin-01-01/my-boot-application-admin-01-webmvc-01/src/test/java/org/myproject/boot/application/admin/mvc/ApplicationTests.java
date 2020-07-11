package org.myproject.boot.application.admin.mvc;

import cn.hutool.extra.pinyin.PinyinUtil;
import org.junit.jupiter.api.Test;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-04 18:52
 */
public class ApplicationTests {
    @Test
    void t1() {
//        String letter = PinyinUtil.getPinyin("石福超", null);
//        System.out.println("letter = " + letter);
        System.out.println("PinyinUtil.getEngine() = " + PinyinUtil.getEngine());
    }
}