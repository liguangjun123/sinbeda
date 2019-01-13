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
import java.util.*;

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
    public void insertTemplate(@RequestParam Map<String, Object> map) {
        String data = (String) map.get("data");
        List list = UtilTool.jsonToObj(data, List.class);
        Map<String, Object> map1 = (Map<String, Object>) list.get(0);
        int i = templateService.insertTemplate(map1);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public void deleteTemplate(String id) {
        String[] split = id.split(",");
        int delete = templateService.delete(Arrays.asList(split));
    }

    @RequestMapping("/insertCustomer")
    @ResponseBody
    public String insertCustomer(@RequestParam Map<String, Object> map) {
        int i = templateService.insertCustomer(map);
        if (i == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    @RequestMapping("/inserOperate")
    @ResponseBody
    public String inserOperate(@RequestParam Map<String, Object> map) {
        int i = templateService.inserOperate(map);
        if (i == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    public Integer queryOperateMnum() {
        Integer mnum = templateService.queryOperateMnum();
        return mnum;
    }

    public Integer queryOperatePnum() {
        Integer pnum = templateService.queryOperatePnum();
        return pnum;
    }

    /*
        1.账号、客户名称、存储空间、代码检查行数、构建时长、部署用户数、当前流水线条数
        2.以上数据不应该包含在操作记录数内
     */
    public int queryOperateSnum() {
        List num = templateService.queryOperateSnum();
        int sum = 0;
        for (Object item : num) {
            int b = Integer.parseInt(String.valueOf(item));
            sum += b;
        }
        return sum;
    }

    @RequestMapping("/inser_sinbeda")
    @ResponseBody
    public String inserSinbeda() {
        //    定时器
        // 第一种方法：设定指定任务task在指定时间time执行 schedule(TimerTask task, Date time)
        Object that = this;
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                 ((InsertTemplateController) that).inserSinbedaData();
            }
        }, 1000,10000);// 设定指定的时间time,此处为2000毫秒
        return "定时器将在1秒后开始工作";
    }

    public void inserSinbedaData() {
        //获取总项目数         弊端：频繁操作数据库增加服务器压力
        int pnum = this.queryOperatePnum();
        //获取累计上云人数
        int mnum = this.queryOperateMnum();
        //获取累计操作数
        int sum = this.queryOperateSnum();
        long time = System.currentTimeMillis();
        //        Map<String, Object> map
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("pnum", pnum);
        map.put("mnum", mnum);
        map.put("sum_num", sum);
        map.put("create_time", time);
        templateService.inserSinbeda(map);
    }
}
