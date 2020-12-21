package com.hm.cloud.admin.permission.mapper;


import com.hm.cloud.admin.permission.entity.SysPermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
　* @Description: TODO
　* @author Coder编程
　* @date 2020/11/20 10:17
　*/

@Mapper
public interface SysPermissionMapper {
    @Select("SELECT * FROM sys_permission WHERE role_id=#{roleId}")
    List<SysPermission> listByRoleId(Integer roleId);
}
