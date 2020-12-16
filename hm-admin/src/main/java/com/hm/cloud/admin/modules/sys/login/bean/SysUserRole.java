package com.hm.cloud.admin.modules.sys.login.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class SysUserRole implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer userId;

    private Integer roleId;
	
    // 省略getter/setter
}
