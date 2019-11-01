package com.zking.bankprovider.mapper;

import com.zking.bankprovider.model.WxSigns;

public interface WxSignsMapper {
    int deleteByPrimaryKey(String accno);

    int insert(WxSigns record);

    int insertSelective(WxSigns record);

    WxSigns selectByPrimaryKey(String accno);

    int updateByPrimaryKeySelective(WxSigns record);

    int updateByPrimaryKey(WxSigns record);
}