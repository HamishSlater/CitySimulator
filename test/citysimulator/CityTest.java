/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citysimulator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hamish
 */
public class CityTest {

    public CityTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getDriver method, of class City.
     */
    @Test
    public void testGetDriver() {
        System.out.println("getDriver");
        int driver = 0;
        City instance = new City();
        String expResult = "Driver 1";
        String result = instance.getDriver(driver).getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDriver method, of class City.
     */
    @Test
    public void testGetDriver2() {
        System.out.println("getDriver");
        int driver = 4;
        City instance = new City();
        String expResult = "Driver 5"; // don't expect the "unexpected"
        String result = instance.getDriver(driver).getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDrivers method, of class City.
     */
    @Test
    public void testGetDrivers() {
        System.out.println("getDrivers");
        City instance = new City();
        Driver[] expResult = instance.drivers;
        Driver[] result = instance.getDrivers();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of pickSuburb method, of class City.
     */
    @Test
    public void testPickSuburb() {
        System.out.println("pickSuburb");
        City instance = new City();
        Class expResult = Suburb.class;
        Class result = instance.pickSuburb().getClass();
        assertEquals(expResult, result);
    }

    /**
     * Test of addDriver method, of class City.
     */
    @Test
    public void testAddDriver() {
        System.out.println("addDriver");
        Driver driver = new Driver("driver");
        City instance = new City();
        Class expResult = Suburb.class;
        instance.addDriver(driver);
        Class result = instance.currentSuburb.getClass();
        assertEquals(expResult, result);
    }

    /**
     * Test of move method, of class City.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Driver driver = new Driver("driver");
        Street street = new Street("street");
        Suburb suburb = new Suburb("suburb");
        suburb.setStreets(street, street);
        street.setSuburbs(suburb, suburb, suburb);
        suburb.addDriver(driver);
        City instance = new City();
        instance.currentSuburb = suburb;
        Suburb expResult = suburb;
        instance.move(driver);
        Suburb result = instance.currentSuburb;
        assertEquals(expResult, result);
    }

    /**
     * Test of run method, of class City.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        //instance.run(); Print
        assertTrue(true);
    }
}
