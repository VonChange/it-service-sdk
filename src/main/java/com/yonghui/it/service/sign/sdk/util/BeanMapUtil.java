package com.yonghui.it.service.sign.sdk.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class BeanMapUtil {
    private static final Logger log = LoggerFactory.getLogger(BeanMapUtil.class);
    public static Map<String,String> BeanToMapString(Object obj){
        Map<String, String> map =new HashMap<>();
        // 获取javaBean的BeanInfo对象
        BeanInfo beanInfo = null;
        try {
            beanInfo = Introspector.getBeanInfo(obj.getClass(),Object.class);
        } catch (IntrospectionException e) {
           log.error("error create bean",e);
           return map;
        }
        // 获取属性描述器
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
            // 获取属性名
            String key = propertyDescriptor.getName();
            if (key.equals("class")) {
                continue;
            }
            // 获取该属性的值
            Method readMethod = propertyDescriptor.getReadMethod();
            // 通过反射来调用javaBean定义的getName()方法
            Object value = null;
            try {
                value = readMethod.invoke(obj);
            } catch (Exception e) {
                log.error("error get value",e);
            }
            map.put(key, ConvertUtil.toString(value));
        }
        return map;
    }
    public static Map<String,Object> BeanToMap(Object obj) throws Exception{
        Map<String, Object> map =new HashMap<>();
        // 获取javaBean的BeanInfo对象
        BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass(),Object.class);
        // 获取属性描述器
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
            // 获取属性名
            String key = propertyDescriptor.getName();
            if (key.equals("class")) {
                continue;
            }
            // 获取该属性的值
            Method readMethod = propertyDescriptor.getReadMethod();
            // 通过反射来调用javaBean定义的getName()方法
            Object value = readMethod.invoke(obj);
            map.put(key, value);
        }
        return map;
    }
}
