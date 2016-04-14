/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesMetier;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author visalinthan
 */
public class IntermittentTest {

    public IntermittentTest(){}
    
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
     * Test of modifier method, of class Structure.
     */
    @Test
   

    public void testGetLeUser() {
        User use = new User("pierre", "1234");
        Intermittent inter = new Intermittent("fgsd", "dfbgfd", "fdsd", "fdbds", 91452, "fdsbgs", "fdsgse", "dsfrez", "fg", "yhjtj", "ghr", "yth", "hfgj", use);
        assertEquals("pierre",inter.getLeUser().getLogin());
    }

   
}
