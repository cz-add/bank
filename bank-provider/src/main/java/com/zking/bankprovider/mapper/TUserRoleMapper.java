package com.zking.bankprovider.mapper;

import com.zking.bankprovider.model.TUserRole;

public interface TUserRoleMapper {
    int deleteByPrimaryKey(Integer urid);

    int insert(TUserRole record);

    int insertSelective(TUserRole record);

    TUserRole selectByPrimaryKey(Integer urid);

    int updateByPrimaryKeySelective(TUserRole record);

    int updateByPrimaryKey(TUserRole record);
}