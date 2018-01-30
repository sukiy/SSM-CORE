package com.ssm.services.impl;

import com.ssm.dao.StuDao;
import com.ssm.entity.Student;
import com.ssm.services.StuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/1/30.
 */
@Service("stuService")
@Transactional(propagation = Propagation.REQUIRED)
public class StuServiceImpl implements StuService {

    @Resource
    private StuDao stuDao;
    @Override
    public boolean addStudent(Student stu) {
        return stuDao.addStudent(stu);
    }

    @Override
    public List<Student> findStuList() {
        return stuDao.findStuList();
    }

    public void setStuDao(StuDao stuDao) {
        this.stuDao = stuDao;
    }
}
