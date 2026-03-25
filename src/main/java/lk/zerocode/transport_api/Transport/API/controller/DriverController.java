package lk.zerocode.transport_api.Transport.API.controller;

import lk.zerocode.transport_api.Transport.API.controller.request.DriverRequest;
import lk.zerocode.transport_api.Transport.API.controller.response.DriverResponse;
import lk.zerocode.transport_api.Transport.API.model.Driver;
import lk.zerocode.transport_api.Transport.API.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DriverController {

    @Autowired
    private DriverService driverService;

    @PostMapping("driver")
    public void create (@RequestBody DriverRequest driverRequest){
        driverService.create(driverRequest);

    }

    @GetMapping("driver")
    public List<DriverResponse> getAll (){

        List<Driver> driverList = driverService.getAll();
        List <DriverResponse> driverResponseList = new ArrayList<>();

        for (Driver driver: driverList){
            DriverResponse driverResponse = new DriverResponse();
            driverResponse.setDriveId(driver.getDriveId());
            driverResponse.setName(driver.getName());
            driverResponse.setAge(driver.getAge());
            driverResponse.setEmail(driver.getEmail());
            driverResponse.setMobile(driver.getMobile());

            driverResponseList.add(driverResponse);
        }

        return driverResponseList;
    }
}
