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
        Driver expResult = null;
        Driver result = instance.getDriver(driver);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDrivers method, of class City.
     */
    @Test
    public void testGetDrivers() {
        System.out.println("getDrivers");
        City instance = new City();
        Driver[] expResult = null;
        Driver[] result = instance.getDrivers();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pickSuburb method, of class City.
     */
    @Test
    public void testPickSuburb() {
        System.out.println("pickSuburb");
        City instance = new City();
        Suburb expResult = null;
        Suburb result = instance.pickSuburb();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startDriver method, of class City.
     */
    @Test
    public void testStartDriver() {
        System.out.println("startDriver");
        Driver driver = null;
        City instance = new City();
        instance.addDriver(driver);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class City.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Driver driver = null;
        City instance = new City();
        instance.move(driver);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of randomGenerator method, of class City.
     */
    @Test
    public void testRandomGenerator() {
        System.out.println("randomGenerator");
        int range = 0;
        City instance = new City();
        int expResult = 0;
        int result = instance.randomGenerator(range);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDriver method, of class City.
     */
    @Test
    public void testAddDriver() {
        System.out.println("addDriver");
        Driver driver = null;
        City instance = new City();
        instance.addDriver(driver);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class City.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        City instance = new City();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
