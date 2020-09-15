package org.dy.core.exception;

import org.springframework.util.StringUtils;

/**
 * @author caiwl
 * @date 2020/9/13 22:05
 */
public class EntityExistException extends RuntimeException{
    public EntityExistException(Class clazz, String field, String val) {
        super(EntityExistException.generateMessage(clazz.getSimpleName(), field, val));
    }

    private static String generateMessage(String entity, String field, String val) {
        return StringUtils.capitalize(entity)
                + " with " + field + " "+ val + " existed";
    }
}
