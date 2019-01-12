package com.boot.crm.controller.thymeleaf;

import com.boot.crm.doMain.Template;
import com.boot.crm.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: 华为周旭阳
 * @Date:Create in 2019/1/3 14:42
 * @Description:
 */
@Controller
@RequestMapping("/thymeleaf")
public class Thymeleaf {
    @Autowired
    private TemplateService templateService;

    @RequestMapping("/testThymeleaf")
    public String testThymeleaf(Model model){
        model.addAttribute("yang","shen");
        List<Template> templateList = templateService.getAll(null);
        Template template = new Template();
        template.setTemplateLayoutName("一生化模板");
        template.setTemplateLayoutCode("A0001");
        model.addAttribute("templateList",templateList);
        model.addAttribute("template",template);
        return "thymeleaf/thymeleafTest";
    }
}
