package org.dy.system.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.dy.system.config.interceptor.AuthInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.*;

import java.util.List;

/**
 * 类说明
 *
 * @author caiwenlao
 * @date 2020/3/28 22:44
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Autowired
    private AuthInterceptor authInterceptor;


    /**
     * 消息转换配置
     *
     * @param converters 转换器
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(
                SerializerFeature.DisableCircularReferenceDetect,   //消除循环引用
                SerializerFeature.WriteNullListAsEmpty,              //list字段为null，则输出[]
                SerializerFeature.WriteNullStringAsEmpty,           //字符类型如果为null,则输出为""
                SerializerFeature.WriteMapNullValue                 //map为null，同样输出
        );
        fastJsonConfig.setDateFormat("yyyy-MM-dd HH:mm:ss");
        fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
        converters.add(fastJsonHttpMessageConverter);
    }

    /**
     * 跨域配置
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  //允许被跨域的路径
                .allowedOrigins("*")            //允许访问跨域资源的域名
                .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")
                .maxAge(3600)                   //请求的有效时间
                .allowCredentials(true);        //是否允许发送cookies
    }

    /**
     * 自定义拦截器配置
     * @param registry 拦截器注册
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        WebMvcConfigurer.super.addInterceptors(registry);
//        registry.addInterceptor(authInterceptor)
//                .addPathPatterns("/**")
//                .excludePathPatterns("/swagger-resource/**", "/webjars/**", "/swagger-ui.html");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }
}
