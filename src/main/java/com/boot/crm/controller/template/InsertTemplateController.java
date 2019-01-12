package com.boot.crm.controller.template;

import com.boot.crm.doMain.Template;
import com.boot.crm.plat.util.UtilTool;
import com.boot.crm.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @Author: 华为周旭阳
 * @Date:Create in 2019/1/3 16:36
 * @Description:
 */
@Controller
@RequestMapping("/insetTemplate")
public class InsertTemplateController {
    @Resource
    @Qualifier("templateServiceImpl")
    private TemplateService templateService;

    @RequestMapping("/insert")
    @ResponseBody
    public void insertTemplate(@RequestParam Map<String,Object> map){
        String data =(String) map.get("data");
        List list = UtilTool.jsonToObj(data, List.class);
        Map<String,Object> map1 =(Map<String,Object>) list.get(0);
        int i = templateService.insertTemplate(map1);
    }
    @RequestMapping("/delete")
    @ResponseBody
    public void deleteTemplate(String id){
        String[] split = id.split(",");
        int delete = templateService.delete(Arrays.asList(split));
    }
    
    @RequestMapping("/insertCustomer")
    @ResponseBody
    public String insertCustomer(@RequestParam Map<String,Object> map){
        int i = templateService.insertCustomer(map);
        if(i==1) {
		return "success";
    }else {
    	return "fail";
    }
    }
    
    @RequestMapping("/inserOperate")
    @ResponseBody
    public String inserOperate(@RequestParam Map<String,Object> map){
        int i = templateService.inserOperate(map);
        if(i==1) {
		return "success";
    }else {
    	return "fail";
    }
    }
}
