package lk.zerocode.transport_api.Transport.API.service.impl;

import lk.zerocode.transport_api.Transport.API.controller.request.VehicleRequest;
import lk.zerocode.transport_api.Transport.API.model.Vehicle;
import lk.zerocode.transport_api.Transport.API.repository.VehicleRepository;
import lk.zerocode.transport_api.Transport.API.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    public VehicleRepository vehicleRepository;

    @Override
    public void createVehicle(VehicleRequest vehicleRequest) {

        Vehicle vehicle = new Vehicle();

        vehicle.setId(vehicleRequest.getId());
        vehicle.setVehicleNo(vehicleRequest.getVehicleNo());
        vehicle.setType(vehicleRequest.getType());

        vehicleRepository.createVehicle(vehicle);

    }

    @Override
    public List<Vehicle> findAll() {
        return vehicleRepository.findAllVehicles();
    }

    @Override
    public Vehicle findById(Long vehicleId) {
        return vehicleRepository.findVehicleById(vehicleId);
    }

    @Override
    public void updateById(Long vehicleId, VehicleRequest request) {
        vehicleRepository.updateById(vehicleId, request);
    }
}
