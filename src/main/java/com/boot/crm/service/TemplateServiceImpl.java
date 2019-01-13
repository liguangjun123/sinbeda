package com.boot.crm.service;

import com.boot.crm.dao.TemplateMapper;
import com.boot.crm.doMain.Template;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

/**
 * @Author: 华为周旭阳
 * @Date:Create in 2019/1/3 14:42
 * @Description:
 */
@Service
@Transactional
public class TemplateServiceImpl implements TemplateService {
    @Autowired
    private TemplateMapper templateMapper;

    @Override
    public List<Template> getAll(Map<String, Object> map) {
        return templateMapper.getAll(map);
    }

    @Override
    public List<Template> getAllByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return templateMapper.getAll(new HashMap());
    }

    @Cacheable(value = "getListTemplate", key = "'User:'+#id")
    @Override
    public List<Template> getListMapTemplate() {
        List<Template> list = templateMapper.getListMapTemplate();
        return templateMapper.getListMapTemplate();
    }

    @Override
    public int insertTemplate(Map<String, Object> map) {
        return templateMapper.insertTemplate(map);
    }

    @Override
    public int delete(List list) {
        return templateMapper.deleteTemplate(list);
    }

    @Override
    public String login(String username) {
        return templateMapper.login(username);
    }

    @Override
    public List<Object> queryCustomer(int start, int end) {
        return templateMapper.queryCustomer(start, end);
    }

    @Override
    public Object queryCustomerObject(String id) {
        return templateMapper.queryCustomerObject(id);
    }


    @Override
    public List<Object> queryOperate(int start, int end) {
        return templateMapper.queryOperate(start, end);
    }

    @Override
    public int insertCustomer(Map<String, Object> map) {
        return templateMapper.insertCustomer(map);
    }

    @Override
    public int inserOperate(Map<String, Object> map) {
        return templateMapper.inserOperate(map);
    }


    @Override
    public int insertAdministrator(String name, String password, String phone, String email, String role) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", name);
        map.put("password", password);
        map.put("phone", phone);
        map.put("email", email);
        map.put("role", role);
        return templateMapper.insertTemplate(map);
    }

    @Override
    public int deleteCustomer(String id) {
        return templateMapper.deleteCustomer(id);
    }

    @Override
    public int deleteOperate(String id) {
        return templateMapper.deleteOperate(id);
    }

    @Override
    public int updateCustomer(Map<String, Object> map, String id) {
        return templateMapper.updateCustomer(map, id);
    }

    @Override
    public int updateOperate(Map<String, Object> map, String id) {
        return templateMapper.updateOperate(map, id);
    }

    @Override
    public Integer queryOperateMnum() { return templateMapper.queryOperateMnum(); }

    @Override
    public Integer queryOperatePnum() { return templateMapper.queryOperatePnum(); }


    @Override
    public List<Object> queryOperateSnum() { return templateMapper.queryOperateSnum(); }

    @Override
    public int inserSinbeda(Map<String, Object> map) {
        return templateMapper.inserSinbeda(map);
    }

    @Override
    public List<Object> querySinbeda(int start, int end) {
        return templateMapper.querySinbeda(start, end);
    }

    @Override
    public int deleteSinbedaOne(String id) {
        return templateMapper.deleteSinbedaOne(id);
    }
}
