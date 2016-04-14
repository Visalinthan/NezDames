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
public class StructureTest {
    
    public StructureTest() {
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
     * Test of modifier method, of class Structure.
     */
    @Test
    public void testModifier() {
        PersonneStructure p = new PersonneStructure(0112, 153656, "Pierre", "poiuytr", "0260540525");
        Structure a = new Structure(121, 231, 0032, "Apple", "71 rue michelet", "Montreuil", 93100, "charles@live.fr",45, p, p);
        
        a.modifier(121,231, "Alcatel", "71 rue ", "Montreuil", 93100,"charles@live.fr");
        
        assertEquals("Alcatel", a.getRaisonSociale());
    }

    /**
     * Test of getIdStructure method, of class Structure.
     */
 

    /**
     * Test of setIdStructure method, of class Structure.
     */
  


    /**
     * Test of getCodeNafOuApe method, of class Structure.
     */
   
   
    
}
