package com.hjy.microfirst.domain.mapper;

import com.hjy.microfirst.domain.Role;
import com.hjy.microfirst.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface RoleMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    Role selectByPrimaryKey(Integer id);

    List<Role> selectAll();

    List<Role> selectByParam(Map param);

    int updateByPrimaryKey(Role record);
}