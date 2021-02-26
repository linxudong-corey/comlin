package cn.com.yg.common;

import org.slf4j.MDC;

public class ServiceException extends RuntimeException {
    private ErrorCode code;
    private String traceId;
    private Object[] args;

    public ErrorCode getCode() {
        return this.code;
    }

    public String getTraceId() {
        return this.traceId;
    }

    ServiceException(Throwable cause, ErrorCode code, Object... args) {
        super(cause);
        this.code = code;
        this.args = args;
        this.traceId = MDC.get("X-B3-TraceId");
    }

    public String getMessage() {
        String s = this.code.message();
        if (this.args != null) {
            s = String.format(s, this.args);
        }

        return s;
    }

    public Object[] getArgs() {
        return this.args;
    }

}
