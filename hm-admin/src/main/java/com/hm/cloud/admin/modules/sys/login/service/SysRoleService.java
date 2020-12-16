package com.hm.cloud.admin.modules.sys.login.service;

import com.hm.cloud.admin.modules.sys.login.bean.SysRole;
import com.hm.cloud.admin.modules.sys.login.mapper.SysRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysRoleService {
    @Autowired
    private SysRoleMapper roleMapper;

    public SysRole selectById(Integer id){
        return roleMapper.selectById(id);
    }

    public SysRole selectByName(String name) {
        return roleMapper.selectByName(name);
    }
}
