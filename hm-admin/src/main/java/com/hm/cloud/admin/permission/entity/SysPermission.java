package com.hm.cloud.admin.permission.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
　* @Description: 权限实体类
　* @author Merlin
　* @date 2020/11/20 10:10
　*/

@Data
public class SysPermission implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer id;

    private String url;

    private Integer roleId;

    private String permission;

    private List permissions;

    // 省略除permissions外的getter/setter

    public List getPermissions() {
        return Arrays.asList(this.permission.trim().split(","));
    }

    public void setPermissions(List permissions) {
        this.permissions = permissions;
    }
}
