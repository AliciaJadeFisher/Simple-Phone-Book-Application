/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook_1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alici
 */
public class PB_recordTest {
    
    public PB_recordTest() {
    }
    
    @BeforeClass
    public static void setUpClass() 
    {
        System.out.println("=========== Testing PB_record ===========");
        System.out.println("PB_Record : John Marks 07766545432");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() 
    {
   
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getfName method, of class PB_record.
     */
    @Test
    public void testGetfName() {
        System.out.println("=========== Test : getfName() ===========");
        PB_record instance = new PB_record("John", "Marks", "07766545432");
        String expResult = "John";
        String result = instance.getfName();
        assertEquals(expResult, result);
        System.out.println("Expected Result : " + expResult);
        System.out.println("Actual Result : " + result);
        System.out.println("=========================================");
    }

    /**
     * Test of getsName method, of class PB_record.
     */
    @Test
    public void testGetsName() {
        System.out.println("=========== Test : getsName() ===========");
        PB_record instance = new PB_record("John", "Marks", "07766545432");
        String expResult = "Marks";
        String result = instance.getsName();
        assertEquals(expResult, result);
        System.out.println("Expected Result : " + expResult);
        System.out.println("Actual Result : " + result);
        System.out.println("=========================================");
    }

    /**
     * Test of getNumber method, of class PB_record.
     */
    @Test
    public void testGetNumber() {
        System.out.println("=========== Test : getNumber() ===========");
        PB_record instance = new PB_record("John", "Marks", "07766545432");
        String expResult = "07766545432";
        String result = instance.getNumber();
        assertEquals(expResult, result);
        System.out.println("Expected Result : " + expResult);
        System.out.println("Actual Result : " + result);
        System.out.println("=========================================");
    }
    
}
