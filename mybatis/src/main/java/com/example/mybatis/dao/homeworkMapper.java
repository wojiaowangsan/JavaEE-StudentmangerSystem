package com.example.mybatis.dao;

import com.example.mybatis.model.homework;

import java.util.List;

public interface homeworkMapper {
    int deleteByPrimaryKey(Integer userId);
    List<homework> findAll();
}
