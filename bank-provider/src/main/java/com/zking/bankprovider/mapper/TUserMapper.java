package com.zking.bankprovider.mapper;

import com.zking.bankprovider.model.TUser;

public interface TUserMapper {
    int deleteByPrimaryKey(String uid);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}