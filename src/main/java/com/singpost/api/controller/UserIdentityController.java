package com.singpost.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserIdentityController
{
    @PostMapping
    public String createUser()
    {
        return new String();
    }

    @PutMapping
    public String updateUser()
    {
        return new String();
    }

    @PutMapping
    public String deactivateUser()
    {
        return new String();
    }

    @GetMapping
    public String getUsers()
    {
        return new String();
    }

    @GetMapping
    public String getUser(@PathVariable("id") int id)
    {
        return new String();
    }
}
