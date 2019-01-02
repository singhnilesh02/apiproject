package com.singpost.api.service;


import com.singpost.api.persistence.entity.InsuredVehicle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsuredVehicleServiceImpl implements InsuredVehicleService
{

    @Override
    public InsuredVehicle saveVehicle(InsuredVehicle vehicle) {
        return null;
    }

    @Override
    public List<InsuredVehicle> saveAllVehicles(List<InsuredVehicle> vehicleList) {
        return null;
    }

    @Override
    public int deleteVehicle(int id) {
        return 0;
    }

    @Override
    public InsuredVehicle updateVehicle(InsuredVehicle vehicle) {
        return null;
    }

    @Override
    public List<InsuredVehicle> updateAllVehicles(List<InsuredVehicle> vehicleList) {
        return null;
    }

    @Override
    public InsuredVehicle findByVechicleId(int id) {
        return null;
    }

    @Override
    public List<InsuredVehicle> findAllVechicles(int id) {
        return null;
    }
}
