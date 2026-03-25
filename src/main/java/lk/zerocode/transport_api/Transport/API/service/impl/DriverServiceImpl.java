package lk.zerocode.transport_api.Transport.API.service.impl;

import lk.zerocode.transport_api.Transport.API.controller.request.DriverRequest;
import lk.zerocode.transport_api.Transport.API.model.Driver;
import lk.zerocode.transport_api.Transport.API.repository.DriverRepository;
import lk.zerocode.transport_api.Transport.API.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public void create(DriverRequest driverRequest) {

        Driver driver = new Driver();
        driver.setDriveId(driverRequest.getDriveId());
        driver.setName(driverRequest.getName());
        driver.setAge(driverRequest.getAge());
        driver.setMobile(driverRequest.getMobile());
        driver.setEmail(driverRequest.getEmail());

        driverRepository.createDriver(driver);



    }

    @Override
    public List<Driver> getAll() {

        return driverRepository.findAllDrivers();
    }

    @Override
    public Driver getById(Long driverId) {
        Driver driver= driverRepository.findDriverById(driverId);
        return driver;
    }
}
