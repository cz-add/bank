package com.zking.bankprovider.mapper;

import com.zking.bankprovider.model.TRole;

public interface TRoleMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(TRole record);

    int insertSelective(TRole record);

    TRole selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(TRole record);

    int updateByPrimaryKey(TRole record);
}