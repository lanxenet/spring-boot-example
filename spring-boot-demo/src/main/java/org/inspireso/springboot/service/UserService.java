package org.inspireso.springboot.service;

import javax.transaction.Transactional;

import org.inspireso.springboot.domain.User;
import org.inspireso.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lanxe on 2017/3/28.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public User register(User user) {
        return userRepository.saveAndFlush(user);
    }

    public User findById(String id) {
        return userRepository.findOne(id);
    }

    public User update(User user) {
        return userRepository.saveAndFlush(user);
    }

    public User updateName(String id, String name) {
//        User user = userRepository.findOne(id);
//        if(user != null){
//            user.setName(name);
//            userRepository.saveAndFlush(user);
//        }
        int effected = userRepository.updateNameById(id, name);
        if(effected > 0){
            return userRepository.findOne(id);
        }else{
            throw new RuntimeException("update fail!");
        }

    }

}
