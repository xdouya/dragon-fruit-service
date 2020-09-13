package org.dy.system.config;

import lombok.extern.slf4j.Slf4j;
import org.dy.system.config.exception.EntityNotFoundException;
import org.dy.system.domain._do.ServiceCode;
import org.dy.system.domain._do.ServiceData;
import org.dy.system.config.exception.AuthFailedException;
import org.dy.system.config.exception.PermissionLimitedException;
import org.dy.system.utils.ThrowableUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.HttpStatus.NOT_FOUND;

/**
 * 类说明
 *
 * @author caiwenlao
 * @date 2020/3/28 22:45
 */
@RestControllerAdvice
@Slf4j
public class ControllerExceptionHandler {

    /**
     * 处理一般异常
     */
    @ExceptionHandler(Exception.class)
    public ServiceData<Exception> globalExceptionHandler(Exception e){
        log.error(e.getMessage(), e);
        return ServiceData.errorReturn(e, ServiceCode.ERROR);
    }

    /**
     * 处理AuthFailed
     */
    @ExceptionHandler(AuthFailedException.class)
    public ServiceData<AuthFailedException> authFailed(AuthFailedException e){
        log.error("auth failed");
        return ServiceData.errorReturn(null, ServiceCode.AUTHENTICATED_FAILED);

    }

    /**
     * 处理PermissionLimited
     */
    @ExceptionHandler(PermissionLimitedException.class)
    public ServiceData<PermissionLimitedException> permissionLimited(PermissionLimitedException e){
        log.error("permission limited");
        return ServiceData.errorReturn(null, ServiceCode.PERMISSION_LIMITED);
    }

    /**
     * 处理 EntityNotFound
     */
    @ExceptionHandler(value = EntityNotFoundException.class)
    public ServiceData<EntityNotFoundException> entityNotFoundException(EntityNotFoundException e) {
        // 打印堆栈信息
        log.error(e.getMessage(), e);
        Map<String, Object> other = new HashMap<>(1);
        other.put("errorMsg", e.getMessage());
        return ServiceData.errorReturn(null, ServiceCode.ERROR, other);
    }
}
