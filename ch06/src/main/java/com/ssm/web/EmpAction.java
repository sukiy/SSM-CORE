package com.ssm.web;

import com.ssm.entity.Emp;
import com.ssm.services.DeptService;
import com.ssm.services.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/1/30.
 */
@Controller
@RequestMapping("/empAction")
public class EmpAction {

    @Resource
    private DeptService deptService;
    @Resource
    private EmpService empService;

    //查询出所有可加入的部门
    @RequestMapping("/toAddEmp")
    public String toAddEmp(ModelMap map){
        map.put("deptList",deptService.findDeptList());
        return "addEmp";
    }

    @RequestMapping("/addEmp")
    public String addEmp(Emp emp){
        if(empService.addEmp(emp)){
            System.out.println("添加员工成功");
        }else{
            System.out.println("添加员工失败");
        }
        return "redirect:toAddEmp";
    }

    @RequestMapping("/findEmpList")
    public String findEmp(ModelMap map){
        map.put("empList",empService.findEmpList());
        return "empList";
    }


    public void setDeptService(DeptService deptService) {
        this.deptService = deptService;
    }
}
