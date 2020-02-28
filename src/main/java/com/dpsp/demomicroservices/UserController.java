package com.dpsp.demomicroservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class UserController {
    @Autowired
    UserRepository userRepository;
    @GetMapping("/users")
    public @ResponseBody Iterable<User> getUsers() {
        return userRepository.findAll();
    }
}
