package com.watson.project.common;

/**
 * Error code
 *
 * @author watson
 */
public enum ErrorCode {

    SUCCESS(0, "ok"),
    PARAMS_ERROR(40000, "Parameter error"),
    NOT_LOGIN_ERROR(40100, "Not logged in"),
    NO_AUTH_ERROR(40101, "No authorization"),
    NOT_FOUND_ERROR(40400, "Data not found"),
    FORBIDDEN_ERROR(40300, "Access forbidden"),
    SYSTEM_ERROR(50000, "Internal system exception"),
    OPERATION_ERROR(50001, "Operation failed");


    /**
     * 状态码
     */
    private final int code;

    /**
     * 信息
     */
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
