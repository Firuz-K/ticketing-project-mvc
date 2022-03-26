package com.cydeo.service.impl;

import com.cydeo.controller.dto.RoleDTO;
import com.cydeo.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl extends AbstractMapService<RoleDTO,Long> implements RoleService {
    @Override

    public RoleDTO save(RoleDTO object) {
        return super.save(object.getId(),object);
    }

    @Override
    public List<RoleDTO> findAll() {
        return super.findAll();
    }

    @Override
    public RoleDTO findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public void delete(RoleDTO object) {

    }

    @Override
    public void deleteById(Long id) {

        super.deleteById(id);
    }
}
