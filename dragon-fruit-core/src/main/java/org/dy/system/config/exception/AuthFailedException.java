package org.dy.system.config.exception;

/**
 * 类说明
 *
 * @author caiwenlao
 * @date 2020/3/29 13:34
 */
public class AuthFailedException extends RuntimeException{

    public AuthFailedException(String message) {
        super(message);
    }
}
