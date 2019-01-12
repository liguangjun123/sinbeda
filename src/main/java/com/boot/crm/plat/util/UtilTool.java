package com.boot.crm.plat.util;

import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: 华为周旭阳
 * @Date:Create in 2019/1/3 14:42
 * @Description:
 */
public class UtilTool {
    private static JacksonAdapter objectMapper;
    public static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
    /**
     * 判断传递进来的数组是否有效且可用
     * @param array 传递进来的Object类型数组
     * @return 是否有效
     */
    public static boolean isValidArray(Object [] array){
        return null != array && array.length>0;
    }

    /**
     * 判断字符串是否有效
     * @param string 传递进来的字符串
     * @return 字符串是否有效
     */
    public static boolean isValidString(String string){
        return null != string && string.length()>0;
    }

    public static boolean isValidCollection(Collection collection){
        return null != collection && !collection.isEmpty();
    }

    public static JsonNode jsonToObj(String json){
        try {
            return initMapper().readTree(json);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static <T> T jsonToObj(String json, Class<T> clazz){
        if (!isValidString(json)){
            return null;
        }else {
            try {
                return initMapper().readValue(json,clazz);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
    public static <T>T jsonToObj(String json, Class<T> clazz, Class... element){
        if (!isValidString(json)){
            return null;
        }else {
            try {
                return initMapper().readValue(json, initMapper().createType(clazz,element));
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    private static JacksonAdapter initMapper(){
        if (null == objectMapper){
            objectMapper = new JacksonAdapter();
        }
        return objectMapper;
    }

    /**
     * 对指定字符串中的空格,回车,换行符等空白符进行拆分
     * @param str 传递进来的字符串
     * @return 空白拆分后的set集合
     */
    public static Set<String> collectToSet(String str){
        Set<String> result = new HashSet<>();
        if (UtilTool.isValidString(str)){
            String[] split = str.split("[\\s]+");
            result.addAll(Arrays.asList(split));
        }
        return result;
    }
}
