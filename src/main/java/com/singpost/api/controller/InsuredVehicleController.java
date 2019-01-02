package com.singpost.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/vehicles")
public class InsuredVehicleController
{
    @PostMapping
    public String postVehicles()
    {
        return new String();
    }

    @PutMapping
    public String updateVehicles()
    {
        return new String();
    }


    @DeleteMapping
    public String deleteVehicles()
    {
        return new String();
    }

    @DeleteMapping
    public String deleteAllVehicles()
    {
        return new String();
    }
}
