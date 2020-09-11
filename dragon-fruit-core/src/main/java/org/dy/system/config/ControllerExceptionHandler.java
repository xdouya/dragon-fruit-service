package org.dy.system.config;

import lombok.extern.slf4j.Slf4j;
import org.dy.system.domain._do.ServiceCode;
import org.dy.system.domain._do.ServiceData;
import org.dy.system.config.exception.AuthFailedException;
import org.dy.system.config.exception.PermissionLimitedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 类说明
 *
 * @author caiwenlao
 * @date 2020/3/28 22:45
 */
@RestControllerAdvice
@Slf4j
public class ControllerExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ServiceData<Exception> globalExceptionHandler(Exception e){
        log.error(e.getMessage(), e);
        return ServiceData.errorReturn(e, ServiceCode.ERROR);
    }

    @ExceptionHandler(AuthFailedException.class)
    public ServiceData<AuthFailedException> authFailed(AuthFailedException e){
        log.error("auth failed");
        return ServiceData.errorReturn(null, ServiceCode.AUTHENTICATED_FAILED);

    }

    @ExceptionHandler(PermissionLimitedException.class)
    public ServiceData<PermissionLimitedException> permissionLimited(PermissionLimitedException e){
        log.error("permission limited");
        return ServiceData.errorReturn(null, ServiceCode.PERMISSION_LIMITED);
    }
}
