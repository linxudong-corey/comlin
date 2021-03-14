package cn.com.yg.common;

import com.alibaba.druid.wall.violation.ErrorCode;
import org.springframework.http.HttpStatus;

public enum CommonError implements ErrorCode, cn.com.yg.common.ErrorCode {
    SYSTEM_ERROR(HttpStatus.INTERNAL_SERVER_ERROR),
    MISSING_VALUE,
    EMPTY_VALUE,
    API_LEVEL_NOT_SUPPORTED,
    INVALID_VALUE,
    UPDATE_NOTHING,
    DELETE_NOTHING,
    NOT_UNIQUE,
    SESSION_TIMEOUT(HttpStatus.UNAUTHORIZED),
    LESS_MIN_LENGTH,
    GREATER_MAX_LENGTH,
    LESS_MIN_RANGE,
    GREATER_MAX_RANGE,
    FORMAT_MISMATCH,
    CONTAIN_SPECIAL_CHARACTER,
    NON_EDITABLE,
    RECORD_NOT_FOUND;

    private CommonError() {
    }

    private CommonError(HttpStatus httpStatus) {
        Errors.mapStatus(this, httpStatus);
    }
}
