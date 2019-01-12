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
@RequestMapping("/deletTemplate")
public class DeletTemplateController {
	@Autowired
    private TemplateService templateService;

    @RequestMapping("/deleteCustomer")
    @ResponseBody
    public String deleteCustomer(String id){
        int delete = templateService.deleteCustomer(id);
        if(delete==1) {
    		return "success";
        }else {
        	return "fail";
        }
    }

    
    @RequestMapping("/deleteOperate")
    @ResponseBody
    public String deleteOperate(String id){
        int delete = templateService.deleteOperate(id);
        if(delete==1) {
    		return "success";
        }else {
        	return "fail";
        }
    }
}
