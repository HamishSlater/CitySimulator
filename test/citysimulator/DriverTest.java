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
public class DriverTest {

    public DriverTest() {
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
     * Test of getName method, of class Driver.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Driver instance = new Driver("name");
        String expResult = "name";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStart method, of class Driver.
     */
    @Test
    public void testGetStart() {
        System.out.println("getStart");
        Driver instance = new Driver("name");
        instance.setStart("test");
        String expResult = "test";
        String result = instance.getStart();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEnd method, of class Driver.
     */
    @Test
    public void testGetEnd() {
        System.out.println("getEnd");
        Driver instance = new Driver("name");
        instance.setEnd("test");
        String expResult = "test";
        String result = instance.getEnd();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStreet method, of class Driver.
     */
    @Test
    public void testGetStreet() {
        System.out.println("getStreet");
        Driver instance = new Driver("name");
        instance.setStreet("test");
        String expResult = "test";
        String result = instance.getStreet();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAkinaCount method, of class Driver.
     */
    @Test
    public void testGetAkinaCount() {
        System.out.println("getAkinaCount");
        Driver instance = new Driver("name");
        int expResult = 0;
        int result = instance.getAkinaCount();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStart method, of class Driver.
     */
    @Test
    public void testSetStart() {
        System.out.println("setStart");
        String suburb = "test";
        Driver instance = new Driver("name");
        instance.setStart(suburb);
        String expResult = "test";
        String result = instance.getStart();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEnd method, of class Driver.
     */
    @Test
    public void testSetEnd() {
        System.out.println("setEnd");
        String suburb = "test";
        Driver instance = new Driver("name");
        instance.setEnd(suburb);
        String expResult = "test";
        String result = instance.getEnd();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStreet method, of class Driver.
     */
    @Test
    public void testSetStreet() {
        System.out.println("setStreet");
        String aStreet = "test";
        Driver instance = new Driver("name");
        instance.setStreet(aStreet);
        String expResult = "test";
        String result = instance.getStreet();
        assertEquals(expResult, result);
    }

    /**
     * Test of updateSuburb method, of class Driver.
     */
    @Test
    public void testUpdateSuburb() {
        System.out.println("updateSuburb");
        String name = "test";
        Driver instance = new Driver("name");
        instance.setEnd("end");
        instance.updateSuburb(name);
        String expResult = "end" + "test";
        String result = instance.getStart() + instance.getEnd();
        assertEquals(expResult, result);
    }

    /**
     * Test of travelDetails method, of class Driver.
     */
    @Test
    public void testTravelDetails() {
        System.out.println("travelDetails");
        assertEquals(0, 0);
    }

    /**
     * Test of exitMessage method, of class Driver.
     */
    @Test
    public void testExitMessage() {
        System.out.println("exitMessageNone");
        assertEquals(0, 0);
    }

    /**
     * Test of visitAkina method, of class Driver.
     */
    @Test
    public void testVisitAkina() {
        System.out.println("visitAkina");
        Driver instance = new Driver("name");
        instance.visitAkina();
        int expResult = 1;
        int result = instance.getAkinaCount();
        assertEquals(expResult, result);
    }

    /**
     * Test of akinaMessage method, of class Driver.
     */
    @Test
    public void testAkinaMessage() {
        System.out.println("akinaMessage");
        assertEquals(0, 0);
    }

    /**
     * Test of akinaAdditionalMessage method, of class Driver.
     */
    @Test
    public void testAkinaAdditionalMessage() {
        System.out.println("akinaAdditionalMessageNone");
        assertEquals(0, 0);
    }
}
