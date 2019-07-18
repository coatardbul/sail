package com.coatardbul.sail.service;

import com.coatardbul.sail.model.entity.UserInfo;
public interface UserInfoService{


    int deleteByPrimaryKey(String userId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

}
