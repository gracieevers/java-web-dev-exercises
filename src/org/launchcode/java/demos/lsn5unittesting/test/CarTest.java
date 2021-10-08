package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CarTest {

    Car testCar;

    @Before
    public void createCarObject(){
        testCar = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest(){
        assertEquals(10, 10, .001);
    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank(){
        Car testCar = new Car("Toyota", "Prius", 10, 50);
        assertEquals(10, testCar.getGasTankLevel(), .001);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGetGasTankAfterDriving(){
        testCar.drive(50);
        assertEquals(9, testCar.getGasTankLevel(), .001);
    }

    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankAfterExceedingTankRange(){
        //You’ll need to simulate the Car travelling farther than it’s gasTankLevel allows
        testCar.drive(600);
        assertEquals(500, testCar.getOdometer(), .001);
    }

    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException() {
        testCar.addGas(5);
        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");
    }

}
