package com.zking.bankprovider.mapper;

import com.zking.bankprovider.model.TPermission;

public interface TPermissionMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(TPermission record);

    int insertSelective(TPermission record);

    TPermission selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(TPermission record);

    int updateByPrimaryKey(TPermission record);
}