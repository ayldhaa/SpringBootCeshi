package com.aaa.dao;

import com.aaa.entity.Depts;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeptsDao {

    public List<Depts> showDepts();


}
