/**CropControl Unit Tests
 * This class contains unit tests for CropControl methods in the Control Layer 
 * CIT-260
 * Authors: Patricia Struk, Alejandra Canales, Yamilka Cuellar
 * Last modified May 31, 2018
 */
package byui.cit260.cityOfAaron.control;

import byui.cit260.cityOfAaron.model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Lesson 6 Team Assignment
 * @authors: Patricia Struk, Alejandra Canales, Yamilka Cuellar
 */
public class CropControlTest {
    
    public CropControlTest() {
    }

    /**
     * Testing of buyLand() method in CropControl class.
     */
    @Test
    public void testBuyLandValid1() {
        System.out.println("buyLandValid1");
        CropData cropData = new CropData();
        
        int acresToBuy = 10;
        int landPrice = 20;
        cropData.setWheatInStore(2700);
        cropData.setPopulation(100);
        cropData.setAcresOwned(990);
        int returnValue = 1000;
        
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(returnValue, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

@Test
    public void testBuyLandInvalid2() {
        System.out.println("buyLandInvalid2");
        CropData cropData = new CropData();
        
        int acresToBuy = -5;
        int landPrice = 20;
        cropData.setWheatInStore(2700);
        cropData.setPopulation(100);
        cropData.setAcresOwned(1000);
        int returnValue = -1;
        
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(returnValue, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }    
    
@Test
    public void testBuyLandInvalid3() {
        System.out.println("buyLandInvalid3");
        CropData cropData = new CropData();
        
        int acresToBuy = 140;
        int landPrice = 20;
        cropData.setWheatInStore(2700);
        cropData.setPopulation(100);
        cropData.setAcresOwned(1000);
        int returnValue = -1;
        
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(returnValue, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }    
    
 @Test
    public void testBuyLandInvalid4() {
        System.out.println("buyLandInvalid4");
        CropData cropData = new CropData();
        
        int acresToBuy = 60;
        int landPrice = 20;
        cropData.setWheatInStore(2700);
        cropData.setPopulation(5);
        cropData.setAcresOwned(1000);
        int returnValue = -1;
        
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(returnValue, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }   
    
 @Test
    public void testBuyLandBoundary5() {
        System.out.println("buyLandBoundary5");
        CropData cropData = new CropData();
        
        int acresToBuy = 135;
        int landPrice = 20;
        cropData.setWheatInStore(2700);
        cropData.setPopulation(114);
        cropData.setAcresOwned(1000);
        int returnValue = 1135;
        
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(returnValue, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBuyLandBoundary6() {
        System.out.println("buyLandBoundary6");
        CropData cropData = new CropData();
        
        int acresToBuy = 0;
        int landPrice = 20;
        cropData.setWheatInStore(2700);
        cropData.setPopulation(100);
        cropData.setAcresOwned(1000);
        int returnValue = 1000;
        
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(returnValue, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
