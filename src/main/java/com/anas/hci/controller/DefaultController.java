package com.anas.hci.controller;

import com.anas.hci.model.dto.ModuleInfoResponse;
import com.anas.hci.model.querybean.GroupModuleInfoBean;
import com.anas.hci.repository.GroupModuleRepository;
import com.anas.hci.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class DefaultController {
    @Autowired
    GroupModuleRepository repo;
    @GetMapping("/UserID/{UserID}")
    public ModuleInfoResponse home(@PathVariable("UserID") int userId ){

        ModuleInfoResponse res= new ModuleInfoResponse();
        List<GroupModuleInfoBean> list= repo.queryGroupModuleByUserId(userId);

        res.setModules(list);

        return res;
    }
}
