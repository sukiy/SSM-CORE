package com.ssm.services.impl;

import com.ssm.dao.EmpDao;
import com.ssm.entity.Emp;
import com.ssm.services.EmpService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/1/30.
 */
@Service("empService")
@Transactional(propagation = Propagation.REQUIRED)
public class EmpServiceImpl implements EmpService {

    @Resource
    private EmpDao empDao;
    @Override
    public boolean addEmp(Emp emp) {
        return empDao.addEmp(emp);
    }

    @Override
    public List<Emp> findEmpList() {
        return empDao.findEmpList();
    }

    public void setEmpDao(EmpDao empDao) {
        this.empDao = empDao;
    }
}
