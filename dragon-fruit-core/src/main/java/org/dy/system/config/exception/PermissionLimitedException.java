package org.dy.system.config.exception;

/**
 * 类说明
 *
 * @author caiwenlao
 * @date 2020/3/29 13:30
 */
public class PermissionLimitedException extends  RuntimeException{

    public PermissionLimitedException(String msg) {
        super(msg);
    }
}
