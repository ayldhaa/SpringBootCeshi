package com.aaa.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class Emps {
    private Integer eid;
    private String ename;
    private Date edate;
    private Integer emoney;
    private Integer did;
    private Depts depts;
}
