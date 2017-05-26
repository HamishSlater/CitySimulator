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
     * Test of setSuburbs method, of class Street.
     */
    @Test
    public void testSetSuburbs() {
        System.out.println("setSuburbs");
        Suburb suburb1 = null;
        Suburb suburb2 = null;
        Suburb exit = null;
        Street instance = new Street("test");
        instance.setSuburbs(suburb1, suburb2, exit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDriver method, of class Street.
     */
    @Test
    public void testAddDriver() {
        System.out.println("addDriver");
        Driver aDriver = null;
        Street instance = new Street("test");
        instance.addDriver(aDriver);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pickSuburb method, of class Street.
     */
    @Test
    public void testPickSuburb() {
        System.out.println("pickSuburb");
        Street instance = new Street("test");
        Suburb expResult = null;
        Suburb result = instance.pickSuburb();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveToSuburb method, of class Street.
     */
    @Test
    public void testMoveToSuburb() {
        System.out.println("moveToSuburb");
        Street instance = new Street("test");
        Suburb expResult = null;
        Suburb result = instance.moveToSuburb();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
