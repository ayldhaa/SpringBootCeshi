package com.aaa.imple;

import com.aaa.dao.DeptsDao;
import com.aaa.entity.Depts;
import com.aaa.service.DeptsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptsImple implements DeptsService {
    @Autowired
    private DeptsDao deptsDao;
    @Override
    public List<Depts> showDepts() {
        return deptsDao.showDepts();
    }
}
