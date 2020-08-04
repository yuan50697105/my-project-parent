package org.myproject.boot.application.admin.db.handler;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-25 22:37
 */
public interface BaseEnum<E> {
    int getCode();

    String getText();

    E getByCode(int code);
}
