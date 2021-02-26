package cn.com.yg.common;

import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

public class Errors {
    private static final Map<ErrorCode, HttpStatus> statusMap = new HashMap();

    public Errors() {
    }

    public static void mapStatus(ErrorCode errorCode, HttpStatus httpStatus) {
        statusMap.put(errorCode, httpStatus);
    }

    public static HttpStatus mapStatus(ErrorCode errorCode) {
        return (HttpStatus)statusMap.getOrDefault(errorCode, HttpStatus.BAD_REQUEST);
    }

    public static ServiceException wrap(ErrorCode errorCode, Object... args) {
        return wrap(null, errorCode, args);
    }

    public static ServiceException wrap(Throwable cause) {
        return cause instanceof ServiceException ? (ServiceException)cause : wrap((ErrorCode) cause, CommonError.SYSTEM_ERROR, cause.toString());
    }

    public static ServiceException wrap(Throwable cause, ErrorCode errorCode, Object... args) {
        ServiceException e = new ServiceException(cause, errorCode, args);
        return e;
    }
}
