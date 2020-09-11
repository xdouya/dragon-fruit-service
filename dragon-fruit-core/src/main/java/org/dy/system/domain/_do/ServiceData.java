package org.dy.system.domain._do;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * 类说明
 *
 * @author caiwenlao
 * @date 2020/3/28 22:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceData<T> {
    private T bo;
    private ServiceCode code;
    private Map<String, Object> other;

    public static<T> ServiceData<T> successReturn(T bo){
        return new ServiceData<>(bo, ServiceCode.SUCCESS, null);
    }

    public static<T> ServiceData<T> successReturn(T bo, Map<String, Object> other){
        return new ServiceData<>(bo, ServiceCode.SUCCESS, other);
    }

    public static<T> ServiceData<T> errorReturn(T bo, ServiceCode code){
        return new ServiceData<>(bo, code, null);
    }

    public static<T> ServiceData<T> errorReturn(T bo, ServiceCode code, Map<String, Object> other){
        return new ServiceData<>(bo, code, other);
    }
}
