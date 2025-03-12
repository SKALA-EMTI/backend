package com.emti.emti_backend.global.error;

import lombok.Getter;

@Getter
public enum ErrorCode {

    // Common
    INVALID_INPUT_VALUE(400, "C001", "Invalid Input Value"),
    RESOURCE_NOT_FOUND(404, "C002", "Resource Not Found"),
    INTERNAL_SERVER_ERROR(500, "C003", "Server Error"),

    // Member
    MEMBER_NOT_FOUND(404, "M001", "Member Not Found"),
    EMAIL_DUPLICATION(400, "M002", "Email is Duplicated"),

    // Auth
    UNAUTHORIZED(401, "A001", "Unauthorized"),
    ACCESS_DENIED(403, "A002", "Access Denied");

    private final int status;
    private final String code;
    private final String message;

    ErrorCode(int status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
