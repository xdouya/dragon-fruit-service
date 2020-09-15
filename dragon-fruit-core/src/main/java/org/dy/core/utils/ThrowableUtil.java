package org.dy.core.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @author caiwl
 * @date 2020/9/13 21:49
 */
public class ThrowableUtil {
    /**
     * 获取堆栈信息
     */
    public static String getStackTrace(Throwable throwable){
        StringWriter sw = new StringWriter();
        try (PrintWriter pw = new PrintWriter(sw)) {
            throwable.printStackTrace(pw);
            return sw.toString();
        }
    }
}
