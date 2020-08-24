package com.laowang.simple.mapper;

import com.laowang.simple.model.SysRole;
import com.laowang.simple.model.SysUser;

import java.util.List;

public interface UserMapper {
    /**
     * 通过id查询
     * @param id
     * @return
     */
    SysUser selectById(Long id);
    List<SysUser> selectAll();
    List<SysRole> selectRolesByUserId(Long userId);
}
