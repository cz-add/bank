package com.zking.bankprovider.mapper;

import com.zking.bankprovider.model.TPermissionRole;

public interface TPermissionRoleMapper {
    int deleteByPrimaryKey(Integer rrid);

    int insert(TPermissionRole record);

    int insertSelective(TPermissionRole record);

    TPermissionRole selectByPrimaryKey(Integer rrid);

    int updateByPrimaryKeySelective(TPermissionRole record);

    int updateByPrimaryKey(TPermissionRole record);
}