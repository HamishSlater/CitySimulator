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
public class StreetTest {

    public StreetTest() {
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
     * Test of getName method, of class Street.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Street instance = new Street("name");
        String expResult = "name";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDriver method, of class Street.
     */
    @Test
    public void testGetDriver() {
        System.out.println("getDriver");
        Driver aDriver = new Driver("driver");
        Street instance = new Street("name");
        instance.addDriver(aDriver);
        Driver expResult = aDriver;
        Driver result = instance.getDriver();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSuburb method, of class Street.
     */
    @Test
    public void testGetSuburb() {
        System.out.println("getSuburb");
        int index = 0;
        Suburb suburb = new Suburb("suburb");
        Street instance = new Street("name");
        instance.setSuburbs(suburb, suburb, suburb);
        Suburb expResult = suburb;
        Suburb result = instance.getSuburb(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of setSuburbs method, of class Street.
     */
    @Test
    public void testSetSuburbs() {
        System.out.println("setSuburbs");
        int index = 0;
        Suburb suburb1 = new Suburb("suburb1");
        Suburb suburb2 = new Suburb("suburb2");
        Suburb exit = new Suburb("exit");
        Street instance = new Street("street");
        instance.setSuburbs(suburb1, suburb2, exit);
        Suburb expResult = suburb1;
        Suburb result = instance.getSuburb(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of setSuburbs method, of class Street.
     */
    @Test
    public void testSetSuburbs2() {
        System.out.println("setSuburbs2");
        int index = 1;
        Suburb suburb1 = new Suburb("suburb1");
        Suburb suburb2 = new Suburb("suburb2");
        Suburb exit = new Suburb("exit");
        Street instance = new Street("street");
        instance.setSuburbs(suburb1, suburb2, exit);
        Suburb expResult = suburb2;
        Suburb result = instance.getSuburb(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of setSuburbs method, of class Street.
     */
    @Test
    public void testSetSuburbs3() {
        System.out.println("setSuburbs3");
        int index = 2;
        Suburb suburb1 = new Suburb("suburb1");
        Suburb suburb2 = new Suburb("suburb2");
        Suburb exit = new Suburb("exit");
        Street instance = new Street("street");
        instance.setSuburbs(suburb1, suburb2, exit);
        Suburb expResult = exit;
        Suburb result = instance.getSuburb(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of addDriver method, of class Street.
     */
    @Test
    public void testAddDriver() {
        System.out.println("addDriver");
        Driver aDriver = new Driver("driver");
        Street instance = new Street("street");
        instance.addDriver(aDriver);
        Driver expResult = aDriver;
        Driver result = instance.getDriver();
        assertEquals(expResult, result);
    }

    /**
     * Test of pickSuburb method, of class Street.
     */
    @Test
    public void testPickSuburb() {
        System.out.println("pickSuburb");
        Suburb suburb = new Suburb("suburb");
        Street instance = new Street("street");
        instance.setSuburbs(suburb, suburb, suburb);
        Suburb expResult = suburb;
        Suburb result = instance.pickSuburb();
        assertEquals(expResult, result);
    }

    /**
     * Test of moveToSuburb method, of class Street.
     */
    @Test
    public void testMoveToSuburb() {
        System.out.println("moveToSuburb");
        Driver driver = new Driver("name");
        Suburb suburb = new Suburb("suburb");
        Street instance = new Street("street");
        instance.addDriver(driver);
        instance.setSuburbs(suburb, suburb, suburb);
        Suburb expResult = suburb;
        Suburb result = instance.moveToSuburb();
        assertEquals(expResult, result);
    }

}
