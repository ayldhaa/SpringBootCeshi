package com.aaa.imple;

import com.aaa.dao.EmpsDao;
import com.aaa.entity.Emps;
import com.aaa.service.EmpsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmpsImple implements EmpsService {
    @Autowired
    private EmpsDao empsDao;


    @Override
    public List<Emps> show() {
        return empsDao.show();
    }

    @Override
    public PageInfo<Emps> showPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Emps> emps =empsDao.show();
        PageInfo<Emps> empsPageInfo =new PageInfo<>(emps);
        return empsPageInfo;
    }

    @Override
    public Integer Add(Emps emps) {
        return  empsDao.Add(emps);
    }

    @Override
    public Integer Del(String[] arrays) {
        return  empsDao.Del(arrays);
    }

    @Override
    public Integer Up(Emps emps) {
        return empsDao.Up(emps);
    }

    @Override
    public List<Emps> showId(Integer eid) {
        return  empsDao.showId(eid);
    }


}
