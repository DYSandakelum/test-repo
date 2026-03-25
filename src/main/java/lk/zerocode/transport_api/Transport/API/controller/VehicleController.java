package lk.zerocode.transport_api.Transport.API.controller;

import lk.zerocode.transport_api.Transport.API.controller.request.VehicleRequest;
import lk.zerocode.transport_api.Transport.API.controller.response.VehicleResponse;
import lk.zerocode.transport_api.Transport.API.model.Vehicle;
import lk.zerocode.transport_api.Transport.API.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/vehicles")
    public void createVehicle(@RequestBody VehicleRequest vehicleRequest){

        vehicleService.createVehicle(vehicleRequest);

    }

    @GetMapping("/vehicles")
    public List<VehicleResponse> getAll(){

        List<Vehicle> vehicleList = vehicleService.findAll();

        List<VehicleResponse> vehicleResponseList = new ArrayList<>();

        for (Vehicle vehicle : vehicleList){
            VehicleResponse vehicleResponse = new VehicleResponse();

            vehicleResponse.setId(vehicle.getId());
            vehicleResponse.setVehicleNo(vehicle.getVehicleNo());
            vehicleResponse.setType(vehicle.getType());

            vehicleResponseList.add(vehicleResponse);
        }

        return vehicleResponseList;

    }


}
