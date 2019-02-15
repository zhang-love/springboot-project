package com.zl.springboot.po;

/**
 * @description: 账户实体->账户表sys_user
 * @author: zl
 * @date: 2019-02-15 14:29
 */
public class SysUserPo {
    private String username ;
    private String password ;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
