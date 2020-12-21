package com.hm.cloud.admin.permission.service;

import com.hm.cloud.admin.permission.entity.SysPermission;
import com.hm.cloud.admin.permission.mapper.SysPermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
　* @Description: TODO
　* @author Coder编程
　* @date 2020/11/20 10:22
　*/

@Service
public class SysPermissionService {
    @Autowired
    private SysPermissionMapper permissionMapper;

    /**
     * 获取指定角色所有权限
     */
    public List<SysPermission> listByRoleId(Integer roleId) {
        return permissionMapper.listByRoleId(roleId);
    }
}
