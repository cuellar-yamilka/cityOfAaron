/* The Control Class - part of the Control Layer
 * The class contains all of the calculation methods for managing the crops
 * CIT-260
 * Authors: Patricia Struk, Alejandra Canales, Yamilka Cuellar
 * Last modified: July 4, 2018
 */
package byui.cit260.cityOfAaron.control;

import byui.cit260.cityOfAaron.exceptions.CropException;
import byui.cit260.cityOfAaron.model.CropData;
import java.util.Random;

/**
 * Lesson 6 Team assignment
 * @authors Patricia Struk, Alejandra Canales, Yamilka Cuellar
 */


public class CropControl {
        
// Constants
     private static final int LAND_RANGE = 10;
     private static final int LAND_BASE = 17;
     
// constants for the cropYield()
     private static final int YIELD_RANGE = 3;
     private static final int YIELD_BASE = 2;
     
// Random number generator
     private static final Random random = new Random();
     
// The buyLand method
// Purpose: To buy land
// Parameters: the price of land, the number of acres to buy, and a reference 
//               to a CropData object
// Returns: none
// Pre-conditions: The Price of the land must be >= 17 and <= 27
// The amount of land to buy must be positive
// The amount of wheat in store has to be enough to buy the land
// The population needs to be enough to tend all the land owned and bought 
// 1 person can tend 10 acres

    public static void buyLand(int landPrice, int acresToBuy, CropData cropData) 
        throws CropException {
     
// If acres to buy  < 0, throw exception
        if (acresToBuy < 0){ 
            throw new CropException("\nNegative values are not allowed, please try again");
        }
// If wheatInStore < (acresToBuy * landPrice), throw exception
        if (cropData.getWheatInStore() < (acresToBuy * landPrice)) {
            throw new CropException("\nThere is insufficient wheat to buy this much land");
        }

// If population < populationNeeded, throw exception
        int populationNeeded = (cropData.getAcresOwned() + acresToBuy) / 10;
        if (cropData.getPopulation() < populationNeeded) {
            throw new CropException ("\nThere are not enough people to work that much land");
     
        }
// acresOwned = acresOwned + acresToBuy
        int acresOwned = cropData.getAcresOwned() + acresToBuy;
        cropData.setAcresOwned(acresOwned); 
        
// wheatInStore = wheatInStore – (acresToBuy * landPrice)
        int wheatInStore = cropData.getWheatInStore() - (acresToBuy * landPrice);
        cropData.setWheatInStore(wheatInStore);
        
    } 
    
// Lesson 11 - Individual Assignment - setOffering() method - AUTHOR Patricia Struk
      
// The setOffering() method 
// Purpose: To get an offering percentage inputted by the user and verify if it
//           fits the pre-conditions. If it is valid, the percentage is saved. 
// Parameters: An offering percentage and a reference to a CropData object
// Returns: An error message if offering percentage is invalid.  
// Pre-conditions: The percentage entered must positive. 
//                 The percentage must be <= 100. 

    public static void setOffering(int offeringPercentage, CropData cropData) 
        throws CropException{
      
// If offeringPercentage < 0, throw exception
        if (offeringPercentage < 0) {
            throw new CropException("\nA negative value was input. Please try again.");
        }
// If offeringPercentage is > 100, throw exception
        if (offeringPercentage > 100) {
            throw new CropException("\nPercentage cannot exceed 100. Please try again.");
        }
// Otherwise, save offeringPercentage 
        cropData.setOffering(offeringPercentage);  
        
    }
    

// Lesson 6 Individual Assignment - plantCrops() method - AUTHOR Yamilka Cuellar

// The plantCrops () method
// Purpose: To plant crops
// Parameters: The number of acres to plant is get from the user input and a 
//      reference to a CropData object
// Returns: The amount of wheat you have left
// Pre-conditions: The number of acres to plant needs to be positive
// The number of acres owned needs to be enough to plant the land
// The amount of wheat in store has to be enough to plant the land 
//     (you can plant 2 acres with one bushel of wheat)

    public static void plantCrops(int acresPlanted,  CropData cropData)
    throws CropException{

//If acresPlanted < 0, throw exception
        if (acresPlanted < 0) {
            throw new CropException("A negative value was input");
        }

//If acresPlanted > acresOwned, throw exception
        if (acresPlanted > cropData.getAcresOwned()) {
            throw new CropException("Sorry, you don't have that much land to plant");
        }

//If wheatInStore < (acresPlanted * 2), throw exception
        if (cropData.getWheatInStore() < (acresPlanted * 2)) {
            throw new CropException("Sorry, you don't have enough wheat to plant this land");
        }

//wheatInStore = wheatInStore – (acresPlanted * 2)
        int updateWheatInStore = cropData.getWheatInStore() - (acresPlanted * 2);
        cropData.setWheatInStore(updateWheatInStore);
        
//save the acresPlanted in the cropData object
        cropData.setAcresPlanted(acresPlanted);
        
            
}
// Lesson 11 Individual Assignment - feedPeople() method - AUTHOR Alejandra Canales
// the feedPeople method
// purpose: to figure out how many bushels of grain the user wants to give the people
// the method to allocate wheat for the feeding the people
// parameters: The number of bushels of wheat wanted, number of bushels of wheat in storage
// reference to a CropData object.
// returns: the number of bushels of wheat you have left
// pre-conditions: the amount of bushels of grain they want must be positive
// and <= the number of wheat that the city has in storage.
    
public static int feedPeople(int wheatWanted, int wheatInStore, CropData cropData)
        throws CropException {

//If wheatWanted < 0, return -1
	if(wheatWanted < 0){
	throw new CropException("\nNegative values are not allowed, please try "
                + "again");
        }
//If wheatInStore < wheatWanted, return -1
	if(cropData.getWheatInStore() < wheatWanted){
	throw new CropException("\nThere is insufficient wheat, please try again");
        }

//wheatOwned = wheatInStore – wheatWanted
	int wheatOwned = wheatInStore - wheatWanted ; 
        cropData.setWheatInStore(wheatOwned);
        
// save the wheat wanted 
        cropData.setWheatForPeople(wheatWanted);
 
//return wheatOwned
	return wheatOwned;
    } 

// Lesson 8 Individual Assignment - calcLandCost() method - AUTHOR Yamilka Cuellar

// The calcLandCost () method
// Purpose: The cost of the land is a random number between 17 and 26 bushels per acre
// Parameters: none
// Returns: The land cost

public static int calcLandCost()
        {
        int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;
        return landPrice;
        }


// sellLand() method                                    AUTHOR: Patricia Struk  
// ============================================================================
// The sellLand method
// Purpose: To sell land
// Parameters: the price of land, the number of acres to sell, a reference to  
//               a CropData object
// Returns: none
// Pre-conditions: acres to sell must be positive and <= the number of acresowned
// Last modified July 2018               


   public static void sellLand(int landPrice, int acresToSell, CropData cropData) 
        throws CropException {

// If acres to sell < 0, throw an exception 
        if(acresToSell < 0){
            throw new CropException("\nA negative value was inputed. Please try again.");
        }
// If acresOwned < acresToSell, throw an exception
        if(cropData.getAcresOwned() < acresToSell){
            throw new CropException("\nYou tried to sell more land than you own. " +
                                       "Please try again.");
        }
// acresOwned = acresOwned – acresToSell, save result
        int totAcresOwned = cropData.getAcresOwned() - acresToSell;
        cropData.setAcresOwned(totAcresOwned);

// wheatInStore = wheatInStore + (acresToSell x landPrice), save result
        int totWheatInStore = cropData.getWheatInStore() + (acresToSell * landPrice);
        cropData.setWheatInStore(totWheatInStore);

}     
   
//=============================================================================
// Individual Assignment: Lesson 13                      Author: Yamilka Cuellar   
// The harvestCrops() method
// Purpose: Calculate the cropYield
// Parameters: Reference to CropData objects
// Returns: none
// Last modified July 21 2018               

    public static int harvestCrops(CropData cropData) {
        
        // Calculate cropYield that is equal to a random number base on the 
        // percentage paid in offerings.
        int cropYield;
        
        // If the percentage the player use to pay tithe and offering is between 8-12%
        if (cropData.getOffering() >= 8 && cropData.getOffering() <= 12) {
            cropYield = random.nextInt(YIELD_RANGE) + YIELD_BASE;
            cropData.setCropYield(cropYield);
        }
            
        // If the percentage the player use to pay tithe and offering is below 8%
        if (cropData.getOffering() < 8 ) {
            cropYield = random.nextInt(YIELD_RANGE) + (YIELD_BASE - 1);
            cropData.setCropYield(cropYield);
        }
        // If the percentage the player use to pay tithe and offering is between 8-12%
        if (cropData.getOffering() > 12) {
            cropYield = random.nextInt(YIELD_RANGE + 1) + YIELD_BASE;
            cropData.setCropYield(cropYield);
        }
        
        // Calculate the number of bushels of wheat harvested.
        int harvest = cropData.getAcresPlanted() * cropData.getCropYield();
        cropData.setHarvest(harvest);
        return harvest;
        
    }

// payOffering() method                                 Author: Patricia Struk   
// ============================================================================
// The payOffering() method
// Purpose: To calculate the amount of wheat to be paid to offerings
// Parameters: offeringPercentage and a reference to a CropData object
// Returns: wheatInStore (for unit testing purposes)
// Pre-conditions: if offeringBushels results in a decimal point number,round result  
// Last modified June 2018               

    public static int payOffering(CropData cropData) {
// To ensure that offeringBushels calculates as an integer, round the result of:
// offeringBushels = offeringPercentage x harvestAmt, change it (or cast it) to
// an int, then save the result.

        int offeringBushels = (int)Math.round((cropData.getOffering() / 100.0)
                                * cropData.getHarvest());
        cropData.setOfferingBushels(offeringBushels);

// harvestAfterOffering = harvest – offeringBushels;
// save harvestAfterOffering
        int harvestAfterOffering = cropData.getHarvest() - offeringBushels;
        cropData.setHarvestAfterOffering(harvestAfterOffering);

// wheatInStore = wheatInStore + harvestAfterOffering;
// save wheatInStore
        int wheatInStore = cropData.getWheatInStore() + harvestAfterOffering;
        cropData.setWheatInStore(wheatInStore);
    
// return wheatInStore to unit test
        return wheatInStore;

}

//=============================================================================
// Individual Assignment: Lesson 13                      Author: Yamilka Cuellar   
// The calcStarved () method
// Purpose: Calculate the number of people adequately fed 
//and return the number of people that starved and died.
// Parameters: Reference to CropData objects
// Returns: The number of people that starved
// Last modified July 21 2018               

    public static int calcStarved(CropData cropData) {
        
// Calculate how many people were adequately fed during the year
     int peopleFed = cropData.getWheatForPeople() / 20;
     int numberWhoDied;
          
// Calculate how many people died of starvation
     if (peopleFed < cropData.getPopulation()){
        numberWhoDied = cropData.getPopulation() - peopleFed;
        // Save the numberWhoDied to the cropData object
        cropData.setNumberWhoDied(numberWhoDied);
     }
// Subtract the numberWhoDied from the current population   
    int population = cropData.getPopulation() - cropData.getNumberWhoDied();
// Update population in the cropData object
    cropData.setPopulation(population);

    return population;
    }





} // end of class
