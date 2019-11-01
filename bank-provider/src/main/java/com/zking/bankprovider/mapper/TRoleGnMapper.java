package com.zking.bankprovider.mapper;

import com.zking.bankprovider.model.TRoleGn;

public interface TRoleGnMapper {
    int deleteByPrimaryKey(Integer rgid);

    int insert(TRoleGn record);

    int insertSelective(TRoleGn record);

    TRoleGn selectByPrimaryKey(Integer rgid);

    int updateByPrimaryKeySelective(TRoleGn record);

    int updateByPrimaryKey(TRoleGn record);
}