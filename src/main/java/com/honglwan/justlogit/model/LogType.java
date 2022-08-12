package com.honglwan.justlogit.model;

/**
 * @author honglwan
 */

public enum LogType {

    PARAMS("parameters", 1),

    RESULT("result", 2),

    ALL("all", 3);

    private String type;

    private int code;

    LogType(String type, int code) {
        this.type = type;
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public int getCode() {
        return code;
    }
}
