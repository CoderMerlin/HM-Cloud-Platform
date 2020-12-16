package com.hm.cloud.admin.modules.sys.login.service;

import com.hm.cloud.admin.modules.sys.login.bean.SysUserRole;
import com.hm.cloud.admin.modules.sys.login.mapper.SysUserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserRoleService {
    @Autowired
    private SysUserRoleMapper userRoleMapper;

    public List<SysUserRole> listByUserId(Integer userId) {
        return userRoleMapper.listByUserId(userId);
    }
}
