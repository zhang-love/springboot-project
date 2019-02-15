package com.zl.springboot.po;

/**
 * @description: 权限实体->权限表sys_permission
 * @date: 2019-02-15 14:34
 */
public class SysPermissionPo {
    private String name ;
    private String url ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
