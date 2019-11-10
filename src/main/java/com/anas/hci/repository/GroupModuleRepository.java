package com.anas.hci.repository;

import com.anas.hci.model.querybean.GroupModuleInfoBean;

import java.util.List;

public interface GroupModuleRepository {
    public List<GroupModuleInfoBean> queryGroupModuleByUserId (int userId);

}
