package org.myproject.boot.application.admin.db.pojo;

public enum EnabledState {
    ENABLED("ENABLED"), DISABLE("DISABLE");
    private final String state;

    EnabledState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
