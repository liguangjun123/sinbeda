package com.boot.crm.controller.template;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.crm.service.TemplateService;

/**
 * @Author: 华为周旭阳
 * @Date:Create in 2019/1/3 14:42
 * @Description:
 */
@Controller
@RequestMapping("/updateTemplate")
public class UpdateTemplateControler {
    @Autowired
    private TemplateService templateService;

    @RequestMapping("/updateCustomer")
    @ResponseBody
    public String updateCustomer(@RequestParam Map<String, Object> map) {
        Object Oid = map.get("id");
        String id = Oid.toString();
        map.remove("id");
        int i = templateService.updateCustomer(map, id);
        if (i == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    @RequestMapping("/updateOperate")
    @ResponseBody
    public String updateOperate(@RequestParam Map<String, Object> map) {
        Object Oid = map.get("id");
        String id = Oid.toString();
        map.remove("id");
        int i = templateService.updateOperate(map, id);
        if (i == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    @RequestMapping("/delete_sinbeda_one")
    @ResponseBody
    public String deleteSinbedaOne(String id) {
        int i = templateService.deleteSinbedaOne(id);
        if (i == 1) {
            return "success";
        } else {
            return "fail";
        }
    }



}
