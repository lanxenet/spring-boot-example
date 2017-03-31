package org.inspireso.springboot.web.api;

import java.util.List;

import org.inspireso.springboot.domain.User;
import org.inspireso.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lanxe on 2017/3/28.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public User find(@PathVariable("id") String id) {
        return userService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void update(@RequestParam("id") String id,
                       @RequestParam("sex") String sex,
                       @RequestParam("tel") String tel,
                       @RequestParam("name") String name,
                       @RequestParam("address") String address) {
        User user = userService.findById(id);
        if (user == null) {
            user = new User();
        }
        user.setSex(sex);
        user.setTel(tel);
        user.setName(name);
        user.setAddress(address);
        userService.update(user);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        userService.delete(id);
    }

}
