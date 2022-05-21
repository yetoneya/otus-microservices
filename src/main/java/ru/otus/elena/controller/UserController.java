package ru.otus.elena.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.otus.elena.entity.User;
import ru.otus.elena.service.UserService;

@RestController
public class UserController {

    private final UserService userService;

    public UserController (UserService userService){
        this.userService = userService;
    }

    @RequestMapping("/save")
    public ResponseEntity<User> save(@RequestParam("name") String name) {
        User user = userService.createUser(name);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping("/find")
    public ResponseEntity<User> findById(@RequestParam("id") int id) {
        User user = userService.findById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping ("/delete")
    public void deleteById(@RequestParam("id") int id) {
        userService.deleteById(id);
    }

}
