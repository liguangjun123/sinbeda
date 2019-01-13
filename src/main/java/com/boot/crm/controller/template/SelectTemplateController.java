package com.boot.crm.controller.template;

import com.boot.crm.doMain.QueryField;
import com.boot.crm.doMain.Template;
import com.boot.crm.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: 华为周旭阳
 * @Date:Create in 2019/1/3 14:42
 * @Description:
 */
@Controller
@RequestMapping("/template")
public class SelectTemplateController {
    @Autowired
    private TemplateService templateService;

    @Value("${book.author}")
    private String bookAuthor;
    @Value("${book.name}")
    private String bookName;

    @RequestMapping("/ss")
    @ResponseBody
    public String index() {
        return "book bookName is : " + bookName + " and bookAuthor is : " + bookAuthor;
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(String username, String password) {
        String pass = templateService.login(username);
        if (pass.equals(password) || pass == password) {
            return "sucess";
        }
        return "fail";
    }


    @RequestMapping("/queryCustomer")
    @ResponseBody
    public List queryCustomer(int page) {
        int end = page * 10 - 1;
        int start;
        if (end > 10) {
            start = end - 10;
        } else {
            start = 0;
        }
        if (page > 0) {
            List<Object> list = templateService.queryCustomer(start, end);
            return list;

        }
        return null;
    }

    @RequestMapping("/queryCustomerObject")
    @ResponseBody
    public Object queryCustomerObject(String id) {
        Object object = templateService.queryCustomerObject(id);
        return object;
    }

    @RequestMapping("/queryOperate")
    @ResponseBody
    public List queryOperate(int page) {
        int end = page * 10 - 1;
        int start;
        if (end > 10) {
            start = end - 10;
        } else {
            start = 0;
        }
        if (page > 0) {
            List<Object> list = templateService.queryOperate(start, end);
//            功能点

            return list;
        }
        return null;

    }

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Template> getAll(QueryField queryField, Template template, @RequestParam Map<String, Object> map1) {
        Map<String, Object> map = new HashMap<>();
//        Map<String, Object> queryByMap = resoleQuery(queryField, template);
        map.put("pageIndex", Integer.parseInt(map1.get("pageIndex").toString()));
        map.put("pageSize", Integer.parseInt(map1.get("pageSize").toString()));
        List<Template> data = templateService.getAll(map1);
        map.put("total", data.size());
        map.put("data", data);
        return data;
    }

    @RequestMapping("/getAllByPage/{pageNum}/{pageSize}")
    @ResponseBody
    public List<Template> getAllByPage(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize, String test) {
        List<Template> allByPage = templateService.getAllByPage(pageNum, pageSize);
//        List<Template> all = templateService.getAll();
//        List<Template> listMapTemplate = templateService.getListMapTemplate();
        return allByPage;
    }

    public static Map<String, Object> resoleQuery(QueryField queryField, Template template) {
        Map<String, Object> map = new HashMap<>();
        map.put("queryField", queryField);
        map.put("template", template);
        return map;
    }

    @RequestMapping("/getDept")
    @ResponseBody
    public Map<String, Object> getDept() {
//        List<String> data = new ArrayList<>();
        Map<String, Object> data = new HashMap<>();
        data.put("dept1", "一生化");
        data.put("dept2", "QA");
        data.put("dept3", "质量保证部");
        return data;
    }

    @RequestMapping("/query_sinbeda")
    @ResponseBody
    public List querySinbeda(int page) {
        int end = page * 10 - 1;
        int start;
        if (end > 10) {
            start = end - 10;
        } else {
            start = 0;
        }
        if (page > 0) {
            List<Object> list = templateService.querySinbeda(start, end);
//            功能点
            return list;
        }
        return null;
    }
}
