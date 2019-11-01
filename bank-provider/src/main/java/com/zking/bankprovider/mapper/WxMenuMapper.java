package com.zking.bankprovider.mapper;

import com.zking.bankprovider.model.WxMenu;

public interface WxMenuMapper {
    int insert(WxMenu record);

    int insertSelective(WxMenu record);
}