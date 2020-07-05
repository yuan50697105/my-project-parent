package org.myproject.commons.utils.pinyin.annotation;

import java.lang.annotation.*;

/**
 * @program: my-boot-commons-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-04 17:57
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Pinyin {
}