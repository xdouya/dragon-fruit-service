package org.dy.system.exception;

import org.springframework.util.StringUtils;

/**
 * @author caiwl
 * @date 2020/9/13 22:00
 */
public class EntityNotFoundException extends RuntimeException{
    public EntityNotFoundException(Class clazz, String field, String val) {
        super(EntityNotFoundException.generateMessage(clazz.getSimpleName(), field, val));
    }

    private static String generateMessage(String entity, String field, String val) {
        return StringUtils.capitalize(entity)
                + " with " + field + " "+ val + " does not exist";
    }
}
