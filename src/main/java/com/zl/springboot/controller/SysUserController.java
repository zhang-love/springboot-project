package com.zl.springboot.controller;

import com.zl.springboot.dao.SysUserDao;
import com.zl.springboot.po.SysUserPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 账户相关
 * @author: zl
 * @date: 2019-02-15 15:47
 */
@RestController
public class SysUserController {

    @Autowired
    SysUserDao sysUserDao;

    @RequestMapping("/getUser")
    public SysUserPo getUser(SysUserPo user){
        return sysUserDao.getUser(user);
    }
}
