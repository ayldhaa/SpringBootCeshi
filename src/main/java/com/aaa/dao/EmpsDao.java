package com.aaa.dao;

import com.aaa.entity.Emps;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Repository
public interface EmpsDao {

    public List<Emps> show();

    public PageInfo<Emps>showPage(Integer pageNum,Integer pageSize);

    public Integer Add(Emps emps);

    public Integer Del(String[] arrays);

    public Integer Up(Emps emps);

    public List<Emps> showId(Integer eid);

}
