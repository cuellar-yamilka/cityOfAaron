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
     
// Random number generator
     private static final Random random = new Random();
     
// The buyLand method
// Purpose: To buy land
// Parameters: the price of land, the number of acres to buy, and a reference 
//               to a CropData object
// Returns: the total number of acres owned
// Pre-conditions: The Price of the land must be >= 17 and <= 27
// The amount of land to buy must be positive
// The amount of wheat in store has to be enough to buy the land
// The population needs to be enough to tend all the land owned and bought 
// 1 person can tend 10 acres

    public static void buyLand(int landPrice, int acresToBuy, CropData cropData) 
        throws CropException {
     
// If acres to buy  < 0, throw exception
        if (acresToBuy < 0){ 
            throw new CropException("Negative values are not allow, please try again");
        }
// If wheatInStore < (acresToBuy * landPrice), throw exception
        if (cropData.getWheatInStore() < (acresToBuy * landPrice)) {
            throw new CropException("There is insufficient wheat to buy this much land");
        }

// If population < populationNeeded, throw exception
        int populationNeeded = (cropData.getAcresOwned() + acresToBuy) / 10;
        if (cropData.getPopulation() < populationNeeded) {
            throw new CropException ("There are not enough people to work that much land");
     
        }
// acresOwned = acresOwned + acresToBuy
        int acresOwned = cropData.getAcresOwned() + acresToBuy;
        cropData.setAcresOwned(acresOwned); 
        
// wheatInStore = wheatInStore – (acresToBuy * landPrice)
        int wheatInStore = cropData.getWheatInStore() - (acresToBuy * landPrice);
        cropData.setWheatInStore(wheatInStore);
        
    } 
    
// Lesson 6 Individual Assignment - setOffering() method - AUTHOR Patricia Struk
      
// The setOffering() method 
// Purpose: To get an offering percentage inputted by the user and verify if it
//           fits the pre-conditions. If it is valid, the percentage is saved. 
// Parameters: An offering percentage and a reference to a CropData object
// Returns: A valid percentage, or an error message if it’s invalid.  
// Pre-conditions: The percentage entered must positive. 
//                 The percentage must be <= 100. 

    public static int setOffering(int offeringPercentage, CropData cropData){
      
// If offeringPercentage < 0, return -1
        if (offeringPercentage < 0) {
            return -1;
        }
// If offeringPercentage is > 100, return -1
        if (offeringPercentage > 100) {
            return -1;
        }
// Otherwise, save offeringPercentage 
        cropData.setOffering(offeringPercentage);  
        
// return offeringPercentage	
        return offeringPercentage;
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

//If wheatInStore < (acresPlanted / 2), throw exception
        if (cropData.getWheatInStore() < (acresPlanted / 2)) {
            throw new CropException("Sorry, you don't have enough wheat to plant this land");
        }

//wheatInStore = wheatInStore – (acresPlanted / 2)
        int wheatInStore = cropData.getWheatInStore() - (acresPlanted / 2);
        cropData.setWheatInStore(wheatInStore);
        
//save the acresPlanted in the cropData object
        cropData.setAcresPlanted(acresPlanted); 
}
        
// Lesson 6 Individual Assignment - feedPeople() method - AUTHOR Alejandra Canales
// the feedPeople method
// purpose: to figure out how many bushels of grain the user wants to give the people
// the method to allocate wheat for the feeding the people
// parameters: The number of bushels of wheat wanted, number of bushels of wheat in storage
// reference to a CropData object.
// returns: the number of bushels of wheat you have left
// pre-conditions: the amount of bushels of grain they want must be positive
// and <= the number of wheat that the city has in storage.
    
public static int feedPeople(int wheatWanted, int wheatInStore, CropData cropData){

//If wheatWanted < 0, return -1
	if(wheatWanted < 0){
	return -1;
        }
//If wheatInStore < wheatWanted, return -1
	if(cropData.getWheatInStore() < wheatWanted){
	return -1;
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


// remaining sellLand() method in CropControl class - assigned to Patricia Struk  
// ============================================================================
// The sellLand method
// Purpose: To sell land
// Parameters: the price of land, the number of acres to sell, a reference to  
//               a CropData object
// Returns: the number of acres left after the sale
// Pre-conditions: acres to sell must be positive and <= the number of acresowned
// Last modified June 2018               


    public static int sellLand(int landPrice, int acresToSell, CropData cropData) {

// If acres to sell < 0 or if acresOwned < acresToSell, return -1
        if(acresToSell < 0 || cropData.getAcresOwned() < acresToSell){
            return -1;
        }
// acresOwned = acresOwned – acresToSell, save result
        int totAcresOwned = cropData.getAcresOwned() - acresToSell;
        cropData.setAcresOwned(totAcresOwned);

// wheatInStore = wheatInStore + (acresToSell x landPrice), save result
        int totWheatInStore = cropData.getWheatInStore() + (acresToSell * landPrice);
        cropData.setWheatInStore(totWheatInStore);
// return acresOwned
        return totAcresOwned;

}    

// remaining payOffering() method in Crop Control class assigned to Patricia Struk   
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





} // end of class
