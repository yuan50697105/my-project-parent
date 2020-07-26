package org.myproject.boot.application.admin.db.constants;

import org.myproject.boot.application.admin.db.handler.BaseEnum;

public enum OrderStatus implements BaseEnum<OrderStatus> {
    CREATE(0, "创建订单"),
    CANCEL(1, "取消订单"),
    ;
    private final int code;
    private final String text;

    OrderStatus(int code, String text) {
        this.code = code;
        this.text = text;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public EnableStatus getByCode(int code) {
        switch (code) {
            case 0:
                return CREATE;
            case 1:
                return CANCEL;
        }
        return null;
    }
}
