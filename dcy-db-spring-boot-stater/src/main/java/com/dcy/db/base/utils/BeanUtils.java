package com.dcy.db.base.utils;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.StrUtil;

import java.lang.reflect.Field;
import java.util.*;

/**
 * @Author：dcy
 * @Description: Bean相关处理工具类
 * @Date: 2020-02-12 08:53
 */
public class BeanUtils {
    /**
     * 获取类所有属性（包含父类中属性）
     *
     * @param clazz
     * @return
     */
    public static List<Field> extractAllFields(Class clazz) {
        List<Field> fieldList = new ArrayList<>();
        Set<String> fieldNameSet = new HashSet<>();
        while (clazz != null) {
            Field[] fields = clazz.getDeclaredFields();
            //被重写属性，以子类override的为准
            if (notEmpty(fields)) {
                Arrays.stream(fields).forEach((field) -> {
                    if (!fieldNameSet.contains(field.getName())) {
                        fieldList.add(field);
                        fieldNameSet.add(field.getName());
                    }
                });
            }
            clazz = clazz.getSuperclass();
        }
        return fieldList;
    }

    /***
     * 对象是否为空
     * @param obj
     * @return
     */
    public static boolean notEmpty(Object obj) {
        if (obj instanceof String) {
            return StrUtil.isNotBlank((String) obj);
        } else if (obj instanceof Collection) {
            return CollUtil.isEmpty((Collection) obj);
        } else if (obj instanceof Map) {
            return CollUtil.isEmpty((Map) obj);
        } else if (obj instanceof String[]) {
            return ArrayUtil.isEmpty((String[]) obj);
        } else {
            return obj != null;
        }
    }
}
