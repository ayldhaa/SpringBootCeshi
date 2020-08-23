package com.aaa.Controller;

import com.aaa.entity.Depts;
import com.aaa.entity.Emps;
import com.aaa.service.DeptsService;
import com.aaa.service.EmpsService;
import com.github.pagehelper.PageInfo;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class EmpsController {
    @Autowired
    private EmpsService empsService;

    @Autowired
    private DeptsService deptsService;

    @GetMapping("/show")
    public String show(Model model)
    {
        System.out.println("进入控制层");
        List<Emps> empsList =empsService.show();
        model.addAttribute("EmpsList",empsList);
        return "emps/EmpsShow";
    }

    @GetMapping("/showPage/{pageNum}")
    public String showPage(@PathVariable("pageNum") Integer pageNum,@RequestParam(name = "pageSize",defaultValue = "3")Integer pageSize
    ,Model model)
    {
        System.out.println("进入控制层方法");
        PageInfo<Emps>empsPageInfo =empsService.showPage(pageNum,pageSize);
        model.addAttribute("PageList",empsPageInfo);
        List<Depts> depts =deptsService.showDepts();
        model.addAttribute("DeptsList",depts);
        return "emps/EmpsShow";
    }

    @PostMapping("/Add")
    public String Add(Emps emps)
    {
        Integer c =empsService.Add(emps);
        if(c>0)
        {
            System.out.println("添加成功");
        }
        return "redirect:/showPage/1";
    }

    @PostMapping("/Test")
    public String Test(String testname)
    {
        System.out.println(testname);
        String [] c =testname.split(",");
        Integer c1 =empsService.Del(c);
        if(c1>0)
        {
            System.out.println("删除成功");
        }
        return "redirect:/showPage/1";
    }

    @GetMapping("/showId/{eid}")
    public String shwoId(@PathVariable("eid") Integer eid,Model model)
    {
        System.out.println("eid:"+eid);
        List<Emps>emps =empsService.showId(eid);
        System.out.println(emps);
        return "redirect:/showPage/1";
    }



}
