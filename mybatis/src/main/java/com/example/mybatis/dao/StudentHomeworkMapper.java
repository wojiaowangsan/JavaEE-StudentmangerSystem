package com.example.mybatis.dao;

import com.example.mybatis.model.StudentHomework;
import com.example.mybatis.model.student;

import java.util.List;

public interface StudentHomeworkMapper {
    List<StudentHomework> findAll();

}
