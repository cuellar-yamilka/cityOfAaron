///**CropControl Unit Tests
// * This class contains unit tests for CropControl methods in the Control Layer 
// * CIT-260
// * Authors: Patricia Struk, Alejandra Canales, Yamilka Cuellar
// * Last modified May 31, 2018
// */
//package byui.cit260.cityOfAaron.control;
//
//import byui.cit260.cityOfAaron.model.CropData;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// * Lesson 6 Team Assignment
// * @authors: Patricia Struk, Alejandra Canales, Yamilka Cuellar
// */
//public class CropControlTest {
//    
//    public CropControlTest() {
//    }
//
//    /**
//     * Testing of buyLand() method in CropControl class.
//     */
//    @Test
//    public void testBuyLandValid1() {
//        System.out.println("buyLandValid1");
//        CropData cropData = new CropData();
//        
//        int acresToBuy = 10;
//        int landPrice = 20;
//        cropData.setWheatInStore(2700);
//        cropData.setPopulation(100);
//        cropData.setAcresOwned(990);
//        int returnValue = 1000;
//        
//        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
//        assertEquals(returnValue, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
//    
//
//@Test
//    public void testBuyLandInvalid2() {
//        System.out.println("buyLandInvalid2");
//        CropData cropData = new CropData();
//        
//        int acresToBuy = -5;
//        int landPrice = 20;
//        cropData.setWheatInStore(2700);
//        cropData.setPopulation(100);
//        cropData.setAcresOwned(1000);
//        int returnValue = -1;
//        
//        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
//        assertEquals(returnValue, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }    
//    
//@Test
//    public void testBuyLandInvalid3() {
//        System.out.println("buyLandInvalid3");
//        CropData cropData = new CropData();
//        
//        int acresToBuy = 140;
//        int landPrice = 20;
//        cropData.setWheatInStore(2700);
//        cropData.setPopulation(100);
//        cropData.setAcresOwned(1000);
//        int returnValue = -1;
//        
//        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
//        assertEquals(returnValue, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }    
//    
// @Test
//    public void testBuyLandInvalid4() {
//        System.out.println("buyLandInvalid4");
//        CropData cropData = new CropData();
//        
//        int acresToBuy = 60;
//        int landPrice = 20;
//        cropData.setWheatInStore(2700);
//        cropData.setPopulation(5);
//        cropData.setAcresOwned(1000);
//        int returnValue = -1;
//        
//        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
//        assertEquals(returnValue, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }   
//    
// @Test
//    public void testBuyLandBoundary5() {
//        System.out.println("buyLandBoundary5");
//        CropData cropData = new CropData();
//        
//        int acresToBuy = 135;
//        int landPrice = 20;
//        cropData.setWheatInStore(2700);
//        cropData.setPopulation(114);
//        cropData.setAcresOwned(1000);
//        int returnValue = 1135;
//        
//        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
//        assertEquals(returnValue, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
//    
//    @Test
//    public void testBuyLandBoundary6() {
//        System.out.println("buyLandBoundary6");
//        CropData cropData = new CropData();
//        
//        int acresToBuy = 0;
//        int landPrice = 20;
//        cropData.setWheatInStore(2700);
//        cropData.setPopulation(100);
//        cropData.setAcresOwned(1000);
//        int returnValue = 1000;
//        
//        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
//        assertEquals(returnValue, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
//
//// L06-Individual Assignment-Unit Tests for setOffering() AUTHOR: Patricia Struk
//    
//    @Test
//    public void testSetOfferingValid1() {
//        System.out.println("setOfferingValid1");
//        CropData cropData = new CropData();
//        
//        cropData.setOffering(10);
//        int returnValue = 10;
//        
//        int result = CropControl.setOffering(cropData.getOffering(), cropData);
//        assertEquals(returnValue, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
//    
//    @Test
//    public void testSetOfferingInvalid2() {
//        System.out.println("setOfferingInvalid2");
//        CropData cropData = new CropData();
//        
//        cropData.setOffering(-10);
//        int returnValue = -1;
//        
//        int result = CropControl.setOffering(cropData.getOffering(), cropData);
//        assertEquals(returnValue, result);
//    }
//        
//  @Test
//    public void testSetOfferingInvalid3() {
//        System.out.println("setOfferingInvalid3");
//        CropData cropData = new CropData();
//        
//        cropData.setOffering(110);
//        int returnValue = -1;
//        
//        int result = CropControl.setOffering(cropData.getOffering(), cropData);
//        assertEquals(returnValue, result);
//    }      
//    
// @Test
//    public void testSetOfferingBoundary4() {
//        System.out.println("setOfferingBoundary4");
//        CropData cropData = new CropData();
//        
//        cropData.setOffering(0);
//        int returnValue = 0;
//        
//        int result = CropControl.setOffering(cropData.getOffering(), cropData);
//        assertEquals(returnValue, result);
//    }   
//    
// @Test
//    public void testSetOfferingBoundary5() {
//        System.out.println("setOfferingBoundary5");
//        CropData cropData = new CropData();
//        
//        cropData.setOffering(100);
//        int returnValue = 100;
//        
//        int result = CropControl.setOffering(cropData.getOffering(), cropData);
//        assertEquals(returnValue, result);
//    }   
//    
//
//// L06-Individual Assignment-Unit Tests for plantCrops() AUTHOR: Yamilka Cuellar
//
//@Test
//public void testPlantCropsValid1() {
//    System.out.println("plantCropsValid1");
//    CropData cropData = new CropData();
//
//    int acresPlanted = 500;
//    cropData.setAcresOwned(1000);
//    cropData.setWheatInStore(2700);
//    int returnValue = 2450;
//    
//    int result = CropControl.plantCrops(acresPlanted, cropData);
//    assertEquals(returnValue, result);
//    // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//}
//
//@Test
//public void testPlantCropsInvalid2() {
//    System.out.println("plantCropsInvalid2");
//    CropData cropData = new CropData();
//
//    int acresPlanted = -5;
//    cropData.setAcresOwned(1000);
//    cropData.setWheatInStore(2700);
//    int returnValue = -1;
//    
//    int result = CropControl.plantCrops(acresPlanted, cropData);
//    assertEquals(returnValue, result);
//    
//}
//
//@Test
//public void testPlantCropsInvalid3() {
//    System.out.println("plantCropsInvalid3");
//    CropData cropData = new CropData();
//
//    int acresPlanted = 1100;
//    cropData.setAcresOwned(1000);
//    cropData.setWheatInStore(2700);
//    int returnValue = -1;
//    
//    int result = CropControl.plantCrops(acresPlanted, cropData);
//    assertEquals(returnValue, result);
//    
//}
//
//@Test
//public void testPlantCropsInvalid4() {
//    System.out.println("plantCropsInvalid4");
//    CropData cropData = new CropData();
//
//    int acresPlanted = 500;
//    cropData.setAcresOwned(1000);
//    cropData.setWheatInStore(200);
//    int returnValue = -1;
//    
//    int result = CropControl.plantCrops(acresPlanted, cropData);
//    assertEquals(returnValue, result);
//    
//}
//
//@Test
//public void testPlantCropsBoundary5() {
//    System.out.println("plantCropsBoundary5");
//    CropData cropData = new CropData();
//
//    int acresPlanted = 1000;
//    cropData.setAcresOwned(1000);
//    cropData.setWheatInStore(2700);
//    int returnValue = 2200;
//    
//    int result = CropControl.plantCrops(acresPlanted, cropData);
//    assertEquals(returnValue, result);
//    
//}
//
//@Test
//public void testPlantCropsBoundary6() {
//    System.out.println("plantCropsBoundary6");
//    CropData cropData = new CropData();
//
//    int acresPlanted = 500;
//    cropData.setAcresOwned(1000);
//    cropData.setWheatInStore(250);
//    int returnValue = 0;
//    
//    int result = CropControl.plantCrops(acresPlanted, cropData);
//    assertEquals(returnValue, result);
//    
//}
//
//@Test
//public void testPlantCropsBoundary7() {
//    System.out.println("plantCropsBoundary7");
//    CropData cropData = new CropData();
//
//    int acresPlanted = 0;
//    cropData.setAcresOwned(1000);
//    cropData.setWheatInStore(2700);
//    int returnValue = 2700;
//    
//    int result = CropControl.plantCrops(acresPlanted, cropData);
//    assertEquals(returnValue, result);
//    
//}
//    // L06-Individual Assignment-Unit Tests for feedPeople() AUTHOR: Alejandra Canales 
//    @Test
//    
//    public void testFeedPeopleValid1() {
//        System.out.println("feedPeopleValid1");
//        CropData cropData = new CropData();
//
//        int wheatWanted = 400;
//        cropData.setWheatInStore(500);
//        int returnValue = 100;
//
//        int result = CropControl.feedPeople(wheatWanted,cropData.getWheatInStore(), cropData);
//        assertEquals(returnValue , result);
//        
//        
//    }
//    @Test
//    
//    public void testFeedPeopleInvalid2() {
//        System.out.println("feedPeopleInvalid2");
//        CropData cropData = new CropData();
//
//        int wheatWanted = -5;
//        cropData.setWheatInStore(500);
//        int returnValue = -1;
//
//        int result = CropControl.feedPeople(wheatWanted,cropData.getWheatInStore(), cropData);
//        assertEquals(returnValue , result);
//        
//    }
//    @Test
//    
//     public void testFeedPeopleInvalid3() {
//        System.out.println("feedPeopleInvalid3");
//        CropData cropData = new CropData();
//
//        int wheatWanted = 600;
//        cropData.setWheatInStore(500);
//        int returnValue = -1;
//
//        int result = CropControl.feedPeople(wheatWanted,cropData.getWheatInStore(), cropData);
//        assertEquals(returnValue , result);
//        
//    }
//     @Test
//     
//     public void testFeedPeopleBoundary4() {
//        System.out.println("feedPeopleBoundary4");
//        CropData cropData = new CropData();
//
//        int wheatWanted = 500;
//        cropData.setWheatInStore(500);
//        int returnValue = 0;
//
//        int result = CropControl.feedPeople(wheatWanted,cropData.getWheatInStore(), cropData);
//        assertEquals(returnValue , result);
//    }
//     @Test
//     
//     public void testFeedPeopleBoundary5() {
//        System.out.println("feedPeopleBoundary5");
//        CropData cropData = new CropData();
//
//        int wheatWanted = 0;
//        cropData.setWheatInStore(500);
//        int returnValue = 500;
//
//        int result = CropControl.feedPeople(wheatWanted,cropData.getWheatInStore(), cropData);
//        assertEquals(returnValue , result);
//    }
//     
//   /**
//     * Unit tests for sellLand() method in CropControl class AUTHOR: Patricia Struk
//     */
//    @Test
//    public void testSellLandValid1() {
//        System.out.println("sellLandValid1");
//        CropData cropData = new CropData();
//        
//        int acresToSell = 10;
//        int landPrice = 20;
//        cropData.setAcresOwned(2800);
//        cropData.setWheatInStore(2200);
//        int returnValue = 2790;
//        
//        int result = CropControl.sellLand(landPrice, acresToSell, cropData);
//        assertEquals(returnValue, result);
//        
//    }
//    
//
//@Test
//    public void testSellLandInvalid2() {
//        System.out.println("sellLandInvalid2");
//        CropData cropData = new CropData();
//        
//        int acresToSell = -5;
//        int landPrice = 20;
//        cropData.setAcresOwned(2800);
//        cropData.setWheatInStore(2200);
//        int returnValue = -1;
//        
//        int result = CropControl.sellLand(landPrice, acresToSell, cropData);
//        assertEquals(returnValue, result);
//        
//    }    
//    
//@Test
//    public void testSellLandInvalid3() {
//        System.out.println("sellLandInvalid3");
//        CropData cropData = new CropData();
//        
//        int acresToSell = 3000;
//        int landPrice = 20;
//        cropData.setAcresOwned(2800);
//        cropData.setWheatInStore(2200);
//        int returnValue = -1;
//        
//        int result = CropControl.sellLand(landPrice, acresToSell, cropData);
//        assertEquals(returnValue, result);
//        
//    }    
// 
//     
// @Test
//    public void testSellLandBoundary4() {
//        System.out.println("sellLandBoundary4");
//        CropData cropData = new CropData();
//        
//        int acresToSell = 0;
//        int landPrice = 10;
//        cropData.setAcresOwned(2000);
//        cropData.setWheatInStore(2200);
//        int returnValue = 2000;
//        
//        int result = CropControl.sellLand(landPrice, acresToSell, cropData);
//        assertEquals(returnValue, result);
//        
//    }
//    
//    @Test
//    public void testSellLandBoundary5() {
//        System.out.println("sellLandBoundary5");
//        CropData cropData = new CropData();
//        
//        int acresToSell = 2000;
//        int landPrice = 10;
//        cropData.setAcresOwned(2000);
//        cropData.setWheatInStore(2200);
//        int returnValue = 0;
//        
//        int result = CropControl.sellLand(landPrice, acresToSell, cropData);
//        assertEquals(returnValue, result);
//        
//    }
//    
////  Unit Tests for payOffering() method        AUTHOR: Patricia Struk
//    
//    @Test
//    public void testPayOfferingValid1() {
//        System.out.println("payOfferingValid1");
//        CropData cropData = new CropData();
//        
//        
//        cropData.setOffering(12);
//        cropData.setHarvest(275);
//        cropData.setWheatInStore(2225);
//        int returnValue = 2467;
//        
//        int result = CropControl.payOffering(cropData);
//        assertEquals(returnValue, result);
//        
//    }
//    
//    @Test 
//    public void testPayOfferingValid2() {
//        System.out.println("payOfferingValid2");
//        CropData cropData = new CropData();
//        
//        cropData.setOffering(8);
//        cropData.setHarvest(330);
//        cropData.setWheatInStore(2225);
//        int returnValue = 2529;
//        
//        int result = CropControl.payOffering(cropData);
//        assertEquals(returnValue, result);
//        
//    }       
//    
//    @Test
//    public void testPayOfferingBoundary3() {
//        System.out.println("payOfferingBoundary3");
//        CropData cropData = new CropData();
//        
//        cropData.setOffering(0);
//        cropData.setHarvest(275);
//        cropData.setWheatInStore(2225);
//        int returnValue = 2500;
//        
//        int result = CropControl.payOffering(cropData);
//        assertEquals(returnValue, result);
//    }
//        
//    @Test
//    
//    public void testPayOfferingBoundary4() {
//        System.out.println("payOfferingBoundary4");
//        CropData cropData = new CropData();
//        
//        cropData.setOffering(100);
//        cropData.setHarvest(275);
//        cropData.setWheatInStore(2225);
//        int returnValue = 2225;
//        
//        int result = CropControl.payOffering(cropData);
//        assertEquals(returnValue, result);   
//    }
//  
//     
//     
//}// end of class