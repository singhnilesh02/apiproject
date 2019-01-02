package com.singpost.api.service;

import com.singpost.api.persistence.entity.InsuredVehicle;

import java.util.List;

public interface InsuredVehicleService
{
    InsuredVehicle saveVehicle(InsuredVehicle vehicle);
    List<InsuredVehicle> saveAllVehicles(List<InsuredVehicle> vehicleList);
    int deleteVehicle(int id);
    InsuredVehicle updateVehicle(InsuredVehicle vehicle);
    List<InsuredVehicle> updateAllVehicles(List<InsuredVehicle> vehicleList);
    InsuredVehicle findByVechicleId(int id);
    List<InsuredVehicle> findAllVechicles(int id);
}
