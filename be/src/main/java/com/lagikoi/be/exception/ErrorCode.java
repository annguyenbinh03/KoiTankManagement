package com.lagikoi.be.exception;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(900, "Uncategorized Exception", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_KEY_EXCEPTION(901, "Invalid message Key", HttpStatus.INTERNAL_SERVER_ERROR),
    ROLE_NOT_FOUND(902, "Role not found", HttpStatus.INTERNAL_SERVER_ERROR),

    UNAUTHENTICATED(950, "Unauthenticated", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED(951, "You do not have permission", HttpStatus.FORBIDDEN),
    TOKEN_CREATION(952, "Failed to create token due to signing error", HttpStatus.INTERNAL_SERVER_ERROR),
    PERMISSION_EXISTED(953, "Permission is existed", HttpStatus.BAD_REQUEST),
    ROLE_EXISTED(954, "Role is existed", HttpStatus.BAD_REQUEST),

    USER_EXISTED(1001, "User is existed", HttpStatus.BAD_REQUEST),
    USER_NOT_EXISTED(1002, "User not existed", HttpStatus.NOT_FOUND),
    USER_LIST_EMPTY(1003, "User list is empty", HttpStatus.NOT_FOUND),

    FISH_EXISTED(1101, "Fish is existed", HttpStatus.BAD_REQUEST),
    FISH_CREATION_NAME_SIZE(1102, "Fish name cannot be larger than 255 characters", HttpStatus.BAD_REQUEST),
    FISH_LIST_NOT_FOUND(1100, "Fish list is empty", HttpStatus.NO_CONTENT),
    FISH_NOT_FOUND(1101, "Not found fish", HttpStatus.BAD_REQUEST),
    FISH_CATEGORY_NOT_FOUND(1102, "Fish category is empty", HttpStatus.BAD_REQUEST),
    FISH_CATEGORY_LIST_NOT_FOUND(1103, "Fish category list is empty", HttpStatus.NO_CONTENT),

    ACCESSORY_LIST_NOT_FOUND(1201, "Fish accessories list is empty", HttpStatus.NOT_FOUND),
    ACCESSORY_NOT_FOUND(1202, "Not found fish accessory", HttpStatus.BAD_REQUEST),
    ;

    int code;
    String message;
    HttpStatusCode statusCode;

    ErrorCode(int code, String message, HttpStatusCode statusCode) {
        this.code = code;
        this.message = message;
        this.statusCode = statusCode;
    }
}
