package com.example.mybatis.dao;

import com.example.mybatis.model.StudentHomework;
import com.example.mybatis.model.homework;

import java.util.List;

public interface StudentHomeworkMapper {
    int deleteByPrimaryKey(Integer id);
    List<StudentHomework> findAll();
    int insert(StudentHomework record);

}
