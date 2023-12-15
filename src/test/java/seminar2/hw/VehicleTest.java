package seminar2.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void testCarInstanceOfVehicle() {
        Car car = new Car("VAZ", "Vesta", 2021);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    void testCarHasFourWheels() {
        Car car = new Car("Aurus", "Senat", 2022);
        assertEquals(car.getNumWheels(), 4);
    }

    @Test
    void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Aurus", "Cortege", 2023);
        assertEquals(motorcycle.getNumWheels(), 2);
    }

    @Test
    void testCarTestDriveSpeed() {
        Car car = new Car("Porsche", "911", 2020);
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    @Test
    void testMotorcycleSpeed() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR1100XX", 2007);
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }

    @Test
    void testCarPark() {
        Car car = new Car("Porsche", "Panamera", 2019);
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }
    @Test

    void testMotorcyclePark() {
        Motorcycle motorcycle = new Motorcycle("Honda", "GL 1800", 2018);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0);
    }
}