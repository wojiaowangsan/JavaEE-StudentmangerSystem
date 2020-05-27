package com.example.mybatis.dao;

import com.example.mybatis.model.StudentHomework;
import com.example.mybatis.model.student;

import java.util.List;

/*
* student 的持久层操作
* */
public interface studentMapper {
    /**
     * 查询操作
     * @return
     */
    List<student>findAll();
    int deleteByPrimaryKey(Integer studentId);
    int insert(student record);
}
