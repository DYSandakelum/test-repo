package lk.zerocode.transport_api.Transport.API.service;

import lk.zerocode.transport_api.Transport.API.controller.request.VehicleRequest;
import lk.zerocode.transport_api.Transport.API.model.Vehicle;

import java.util.List;

public interface VehicleService {

    void createVehicle(VehicleRequest vehicleRequest);

    List<Vehicle> findAll();

    Vehicle findById(Long vehicleId);
}
