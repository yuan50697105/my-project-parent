package org.myproject.boot.application.admin.db.handler;

import org.myproject.boot.application.admin.db.constants.EnableStatus;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-25 22:37
 */
public interface BaseEnum<E> {
    int getCode();

    String getText();

    EnableStatus getByCode(int code);
}
