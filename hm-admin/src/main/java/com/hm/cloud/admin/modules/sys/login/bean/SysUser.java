package com.hm.cloud.admin.modules.sys.login.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Coder编程
 * @Title: SysUser
 * @ProjectName hm-cloud-platform
 * @Description: TODO
 * @date 2020/11/17 19:17
 */

@Data
public class SysUser implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String password;

    // 省略getter/setter
}
