package com.itmk.web.sys_role.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itmk.web.sys_role.entity.RoleParm;
import com.itmk.web.sys_role.entity.SysRole;

public interface SysRoleService extends IService<SysRole> {
    IPage<SysRole> list(RoleParm parm);
}