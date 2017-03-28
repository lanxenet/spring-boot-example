package org.inspireso.springboot.web.api;

import org.inspireso.springboot.domain.User;
import org.inspireso.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lanxe on 2017/3/28.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "", method = RequestMethod.GET)
    public SimpleUser find(@RequestParam("id") String id) {
        User user = userService.findById(id);
        SimpleUser result = new SimpleUser();
        result.setAddress(user.getAddress());
        result.setName(user.getName());
        return result;
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
    public void update(@RequestParam("id") String id,
                             @RequestParam("name") String name,
                             @RequestParam("address") String address) {

        User user = userService.findById(id);
        user.setName(name);
        user.setAddress(address);
        userService.update(user);
    }



    public static class SimpleUser {
        private String name;
        private String address;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

}
