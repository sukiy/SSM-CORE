package com.ssm.services.impl;

import com.ssm.dao.DeptDao;
import com.ssm.entity.Dept;
import com.ssm.services.DeptService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/1/30.
 */
@Service("deptService")
@Transactional(propagation = Propagation.REQUIRED)
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptDao deptDao;
    @Override
    public List<Dept> findDeptList() {
        return deptDao.findDeptList();
    }

    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }
}
