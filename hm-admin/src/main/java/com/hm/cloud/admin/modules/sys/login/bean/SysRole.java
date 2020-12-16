package com.hm.cloud.admin.modules.sys.login.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class SysRole implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    // 省略getter/setter
}
