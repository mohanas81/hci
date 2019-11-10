package com.anas.hci.model.querybean;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GroupModuleInfoBean {

    @JsonProperty("moduleName")
    private String moduleName;

    @JsonProperty("moduleOrder")
    private int moduleOrder;
}
