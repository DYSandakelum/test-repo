package lk.zerocode.transport_api.Transport.API.service;

import lk.zerocode.transport_api.Transport.API.controller.request.DriverRequest;
import lk.zerocode.transport_api.Transport.API.model.Driver;

import java.util.List;


public interface DriverService {

    void create (DriverRequest driverRequest);

    List<Driver> getAll();

}
