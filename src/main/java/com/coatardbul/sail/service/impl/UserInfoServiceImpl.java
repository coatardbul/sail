package com.coatardbul.sail.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.coatardbul.sail.model.entity.UserInfo;
import com.coatardbul.sail.mapper.UserInfoMapper;
import com.coatardbul.sail.service.UserInfoService;
@Service
public class UserInfoServiceImpl implements UserInfoService{

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public int deleteByPrimaryKey(String userId) {
        return userInfoMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(UserInfo record) {
        return userInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(UserInfo record) {
        return userInfoMapper.insertSelective(record);
    }

    @Override
    public UserInfo selectByPrimaryKey(String userId) {
        return userInfoMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(UserInfo record) {
        return userInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserInfo record) {
        return userInfoMapper.updateByPrimaryKey(record);
    }

}
