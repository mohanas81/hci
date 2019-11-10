package com.anas.hci.repository;

import com.anas.hci.model.entity.Module;

import java.util.List;

public interface ModuleRepository {
    List queryModuleByUserId(Long id);
    void insert(Module module);
}
