package com.zking.bankprovider.mapper;

import com.zking.bankprovider.model.TGjType;

public interface TGjTypeMapper {
    int deleteByPrimaryKey(Integer gjid);

    int insert(TGjType record);

    int insertSelective(TGjType record);

    TGjType selectByPrimaryKey(Integer gjid);

    int updateByPrimaryKeySelective(TGjType record);

    int updateByPrimaryKey(TGjType record);
}