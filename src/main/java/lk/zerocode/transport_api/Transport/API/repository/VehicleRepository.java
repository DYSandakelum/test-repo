package lk.zerocode.transport_api.Transport.API.repository;

import lk.zerocode.transport_api.Transport.API.controller.request.VehicleRequest;
import lk.zerocode.transport_api.Transport.API.model.Vehicle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VehicleRepository {

    List<Vehicle> vehicleList = new ArrayList<>();

    public void createVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }

    public List<Vehicle> findAllVehicles() {
        return vehicleList;
    }

    public Vehicle findVehicleById(Long vehicleId) {
        for (Vehicle vehicle : vehicleList) {

            if (vehicle.getId() == vehicleId) {
                return vehicle;
            }
        }
        return null;
    }


    public void updateById(Long vehicleId, VehicleRequest request) {
        for (Vehicle vehicle : vehicleList) {

            if (vehicle.getId().equals(vehicleId)) {

                vehicle.setId(request.getId());
                vehicle.setVehicleNo(request.getVehicleNo());
                vehicle.setType(request.getType());

            }
        }

    }
}
