package com.bitstudio.admin.service.impl;

import java.util.List;

import com.bitstudio.admin.dao.SysUserMapper;
import com.bitstudio.admin.model.SysUser;
import com.bitstudio.admin.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findByUserId(Long userId) {
        return sysUserMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.selectAll();
    }
}
