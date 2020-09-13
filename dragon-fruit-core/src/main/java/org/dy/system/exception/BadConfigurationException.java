package org.dy.system.exception;

/**
 * 关于错误配置信息异常
 * @author caiwl
 * @date 2020/9/13 22:02
 */
public class BadConfigurationException extends RuntimeException  {
    public BadConfigurationException() {
        super();
    }
    public BadConfigurationException(String message) {
        super(message);
    }
    public BadConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }
    public BadConfigurationException(Throwable cause) {
        super(cause);
    }
    protected BadConfigurationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
