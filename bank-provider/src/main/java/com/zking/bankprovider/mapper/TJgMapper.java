package com.zking.bankprovider.mapper;

import com.zking.bankprovider.model.TJg;

public interface TJgMapper {
    int deleteByPrimaryKey(Integer jgid);

    int insert(TJg record);

    int insertSelective(TJg record);

    TJg selectByPrimaryKey(Integer jgid);

    int updateByPrimaryKeySelective(TJg record);

    int updateByPrimaryKey(TJg record);
}