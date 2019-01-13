package com.boot.crm.dao;

import com.boot.crm.doMain.Template;
import org.apache.ibatis.annotations.Param;

import java.util.*;

/**
 * @Author: 华为周旭阳
 * @Date:Create in 2019/1/3 14:42
 * @Description:
 */

public interface TemplateMapper {
    /**
     * 注意：@param("值"):此注解适应于xml中直接使用foreach循环
     * 若是直接引用map的key，则不用@Param注解
     */
    List<Template> getAll(Map<String, Object> map);
    List<Template> getListMapTemplate();

    //管理员新增
    int insertAdministrator(@Param("map")Map<String,Object> map);
    //新增模板
    int insertTemplate(@Param("map")Map<String,Object> map);
    
    int insertCustomer(@Param("map")Map<String,Object> map);
    
    int inserOperate(@Param("map")Map<String,Object> map);
    
    //删除
    int deleteTemplate(List list);
    
    int deleteCustomer(String id);
    
    int deleteOperate(String id);
    
    int updateCustomer(@Param("map")Map<String,Object> map,@Param("id")String id);
    
    int updateOperate(@Param("map")Map<String,Object> map,@Param("id")String id);

    String login(String username);
    
    List<Object> queryCustomer(@Param("start")int start,@Param("end")int end);
    
    Object queryCustomerObject(String id);
    
    List<Object> queryOperate(@Param("start")int start,@Param("end")int end);
    //管理员查询
    List<Object> queryAdministrator(@Param("start")int start,@Param("end")int end);

    Integer queryOperateMnum();

    Integer queryOperatePnum();

    List<Object> queryOperateSnum();

    int inserSinbeda(@Param("map")Map<String,Object> map);

    List<Object> querySinbeda(@Param("start")int start,@Param("end")int end);

    int deleteSinbedaOne(@Param("id")String id);
}