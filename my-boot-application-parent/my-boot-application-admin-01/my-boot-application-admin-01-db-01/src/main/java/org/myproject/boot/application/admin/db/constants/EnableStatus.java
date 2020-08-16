package org.myproject.boot.application.admin.db.constants;

import com.fasterxml.jackson.annotation.JsonValue;
import org.myproject.boot.application.admin.db.handler.BaseEnum;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-25 22:50
 */
public enum EnableStatus implements BaseEnum<EnableStatus> {
    ENABLE(0, "启用"),
    DISABLE(1, "停用");
    private final int code;
    private final String text;

    EnableStatus(int code, String text) {
        this.code = code;
        this.text = text;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    @JsonValue
    public String getText() {
        return text;
    }

    @Override
    public EnableStatus getByCode(int code) {
        switch (code) {
            case 0:
                return ENABLE;
            case 1:
                return DISABLE;
        }
        return null;
    }

}