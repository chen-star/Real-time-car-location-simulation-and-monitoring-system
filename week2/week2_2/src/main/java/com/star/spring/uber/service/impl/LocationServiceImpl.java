package com.star.spring.uber.service.impl;

import com.star.spring.uber.domain.Location;
import com.star.spring.uber.domain.LocationRepository;
import com.star.spring.uber.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService{

    private LocationRepository locationRepository;

    @Autowired
    public LocationServiceImpl(LocationRepository locationRepository){
        this.locationRepository = locationRepository;
    }

    public List<Location> saveCarLocations(List<Location> carLocations){
        return locationRepository.save(carLocations);
    }

    public void deleteAll(){
        this.locationRepository.deleteAll();

    }

    public Page<Location> findByVehicleMovementType(String movementType, Pageable pageable){
        // call vehicle registration web service
        // vehicle valid or not

        return this.locationRepository.findByVehicleMovementType(Location.VehicleMovementType.valueOf(movementType), pageable);
    }

    public Page<Location> findByVin(String vin, Pageable pageable){
        return this.locationRepository.findByUnitInfoUnitVin(vin, pageable);
    }



}
