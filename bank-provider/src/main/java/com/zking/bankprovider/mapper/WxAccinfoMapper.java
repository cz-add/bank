package com.zking.bankprovider.mapper;

import com.zking.bankprovider.model.WxAccinfo;

public interface WxAccinfoMapper {
    int deleteByPrimaryKey(String accno);

    int insert(WxAccinfo record);

    int insertSelective(WxAccinfo record);

    WxAccinfo selectByPrimaryKey(String accno);

    int updateByPrimaryKeySelective(WxAccinfo record);

    int updateByPrimaryKey(WxAccinfo record);
}