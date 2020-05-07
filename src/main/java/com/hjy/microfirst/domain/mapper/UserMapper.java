package com.hjy.microfirst.domain.mapper;

import com.hjy.microfirst.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    List<User> selectByParam(Map param);

    int updateByPrimaryKey(User record);
}