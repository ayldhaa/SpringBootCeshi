package com.aaa.service;

import com.aaa.entity.Emps;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface EmpsService {

    public List<Emps> show();

    public PageInfo<Emps>showPage(Integer pageNum,Integer pageSize);

    public Integer Add(Emps emps);

    public Integer Del(String[] arrays);

    public Integer Up(Emps emps);

    public List<Emps> showId(Integer eid);



}
