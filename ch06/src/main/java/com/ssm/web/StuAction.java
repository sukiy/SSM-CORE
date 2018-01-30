package com.ssm.web;

import com.ssm.entity.Student;
import com.ssm.services.StuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/1/30.
 */
@Controller
@RequestMapping("/stuAction")
public class StuAction {

    @Resource
    private StuService stuService;

    @RequestMapping("/addStudent")
    public String addStudent(Student stu){
        if(stuService.addStudent(stu)){
            System.out.println("添加学生成功");
        }else{
            System.out.println("添加学生失败");
        }
        return  "index";
    }

    @RequestMapping("/stuList")
    public String findStuList(ModelMap map){
        List<Student> list=stuService.findStuList();
        map.put("stuList",list);
        return  "stuList";
    }

    public void setStuService(StuService stuService) {
        this.stuService = stuService;
    }
}
