package com.anas.hci.model.dto;

import com.anas.hci.model.querybean.GroupModuleInfoBean;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ModuleInfoResponse {
    List<GroupModuleInfoBean> modules;
}
