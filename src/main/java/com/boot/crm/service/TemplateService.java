package com.boot.crm.service;

import com.boot.crm.doMain.Template;

import java.util.List;
import java.util.Map;

/**
 * @Author: 华为周旭阳
 * @Date:Create in 2019/1/3 14:42
 * @Description:
 */
public interface TemplateService {
    List<Template> getAll(Map<String,Object> map);
    List<Template> getAllByPage(int pageNum,int pageSize);
    List<Template> getListMapTemplate();
    //新增
    int insertAdministrator(String name,String password,String phone,String email,String role);
    //新增
    int insertTemplate(Map<String,Object> map);

    int insertCustomer(Map<String,Object> map);
    
    int inserOperate(Map<String,Object> map);
    
    //删除
    int delete(List list);
    
    int deleteCustomer(String id);
    
    int updateCustomer(Map<String,Object> map,String id);
    
    int updateOperate(Map<String,Object> map,String id);
    
    int deleteOperate(String id);
    
    String login(String username);
    
    List<Object> queryCustomer(int start,int end);
    
    Object queryCustomerObject(String id);
    
    List<Object> queryOperate(int start,int end);
}
