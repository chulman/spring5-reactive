package com.chulman.access.jdbc;

import com.chulman.access.jdbc.vehicle.Vehicle;
import com.chulman.access.jdbc.vehicle.VehicleConfiguration;
import com.chulman.access.jdbc.vehicle.VehicleDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(VehicleConfiguration.class);

        VehicleDao vehicleDao = context.getBean(VehicleDao.class);
        Vehicle vehicle = new Vehicle("TEM0001", "Red", 4, 4);
        vehicleDao.insert(vehicle);

        vehicle = vehicleDao.findByVehicleNo("TEM0001");
        System.out.println(vehicle);
    }

}