package com.cydeo.service.impl;

import com.cydeo.controller.dto.UserDTO;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends AbstractMapService<UserDTO, String> implements UserService {

    @Override
    public UserDTO save(UserDTO object) {
        return super.save(object.getUserName(),object);
    }

    @Override
    public List<UserDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(String id) {
         super.deleteById(id);
    }

    @Override
    public UserDTO findById(String s) {
        return super.findByID(s);
    }

    @Override
    public void delete(UserDTO object) {

    }
}
