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
public class SuburbTest {

    public SuburbTest() {
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
     * Test of getName method, of class Suburb.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Suburb instance = new Suburb("name");
        String expResult = "name";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDriver method, of class Suburb.
     */
    @Test
    public void testGetDriver() {
        System.out.println("getDriver");
        Suburb instance = new Suburb("name");
        Driver expResult = null;
        Driver result = instance.getDriver();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStreets method, of class Suburb.
     */
    @Test
    public void testSetStreets() {
        System.out.println("setStreets");
        Suburb instance = new Suburb("test");
        Street left = new Street("left");
        Street right = new Street("right");
        instance.setStreets(left, right);
        Street expResult = left;
        Street result = instance.getLeftStreet();
        assertEquals(expResult, result);

        Street expResult2 = right;
        Street result2 = instance.getRightStreet();
        assertEquals(expResult2, result2);
    }

    /**
     * Test of addDriver method, of class Suburb.
     */
    @Test
    public void testAddDriver() {
        System.out.println("addDriver");
        Driver aDriver = new Driver("name");
        Suburb instance = new Suburb("name");
        instance.addDriver(aDriver);
        Driver expResult = aDriver;
        Driver result = instance.getDriver();
        assertEquals(expResult, result);
    }

    /**
     * Test of pickStreet method, of class Suburb.
     */
    @Test
    public void testPickStreet() {
        System.out.println("pickStreetLeft");
        Suburb instance = new Suburb("name");
        Street left = new Street("left");
        Street right = new Street("right");
        instance.setStreets(left, right);
        Street expResult = left;
        Street result = instance.pickStreet(0);
        assertEquals(expResult, result);
    }

    /**
     * Test of pickStreet method, of class Suburb.
     */
    @Test
    public void testPickStreetRight() {
        System.out.println("pickStreetRight");
        Suburb instance = new Suburb("name");
        Street left = new Street("left");
        Street right = new Street("right");
        instance.setStreets(left, right);
        Street expResult = right;
        Street result = instance.pickStreet(1);
        assertEquals(expResult, result);
    }

    /**
     * Test of moveToStreet method, of class Suburb.
     */
    @Test
    public void testMoveToStreet() {
        System.out.println("moveToStreet");
        Driver driver = new Driver("name");
        Street street = new Street("street");
        Suburb instance = new Suburb("name");
        instance.addDriver(driver);
        instance.setStreets(street, street);
        Class expResult = Street.class;
        Class result = instance.moveToStreet().getClass();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLeftStreet method, of class Suburb.
     */
    @Test
    public void testGetLeftStreet() {
        System.out.println("getLeftStreet");
        Suburb instance = new Suburb("name");
        Street left = new Street("left");
        Street right = new Street("right");
        instance.setStreets(left, right);
        Street expResult = left;
        Street result = instance.getLeftStreet();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRightStreet method, of class Suburb.
     */
    @Test
    public void testGetRightStreet() {
        System.out.println("getRightStreet");
        Suburb instance = new Suburb("name");
        Street left = new Street("left");
        Street right = new Street("right");
        instance.setStreets(left, right);
        Street expResult = right;
        Street result = instance.getRightStreet();
        assertEquals(expResult, result);
    }

}
