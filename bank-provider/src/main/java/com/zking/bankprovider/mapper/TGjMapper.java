package com.zking.bankprovider.mapper;

import com.zking.bankprovider.model.TGj;

public interface TGjMapper {
    int deleteByPrimaryKey(Integer jid);

    int insert(TGj record);

    int insertSelective(TGj record);

    TGj selectByPrimaryKey(Integer jid);

    int updateByPrimaryKeySelective(TGj record);

    int updateByPrimaryKey(TGj record);
}