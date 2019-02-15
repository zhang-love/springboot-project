package com.zl.springboot.dao;

import com.zl.springboot.po.SysUserPo;
import org.springframework.stereotype.Repository;

/**
 * @description: 账户权限相关查询
 * @author: zl
 * @date: 2019-02-15 15:11
 */

@Repository
public interface SysUserDao {

    SysUserPo getUser(SysUserPo sysUserPo);

}
