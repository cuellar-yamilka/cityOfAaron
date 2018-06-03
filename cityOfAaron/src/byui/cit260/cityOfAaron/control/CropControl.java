/* The Control Class - part of the Control Layer
 * The class contains all of the calculation methods for managing the crops
 * CIT-260
 * Authors: Patricia Struk, Alejandra Canales, Yamilka Cuellar
 * Last modified: May 31, 2018
 */
package byui.cit260.cityOfAaron.control;

import byui.cit260.cityOfAaron.model.CropData;

/**
 * Lesson 6 Team assignment
 * @authors Patricia Struk, Alejandra Canales, Yamilka Cuellar
 */
public class CropControl {
    
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

    public static int buyLand(int landPrice, int acresToBuy, CropData cropData){
     
// If acres to buy  < 0, return -1
        if (acresToBuy < 0) {
            return -1;
        }
// If wheatInStore < (acresToBuy * landPrice), return -1
        if (cropData.getWheatInStore() < (acresToBuy * landPrice)) {
            return -1;
        }

// If population < populationNeeded, return -1
        int populationNeeded = (cropData.getAcresOwned() + acresToBuy) / 10;
        if (cropData.getPopulation() < populationNeeded) {
            return -1;
        } 
        
// acresOwned = acresOwned + acresToBuy
        int acresOwned = cropData.getAcresOwned() + acresToBuy;
        cropData.setAcresOwned(acresOwned); 
        
// wheatInStore = wheatInStore – (acresToBuy * landPrice)
        int wheatInStore = cropData.getWheatInStore() - (acresToBuy * landPrice);
        cropData.setWheatInStore(wheatInStore);
        
// return acresOwned
        return acresOwned;
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

    public static int plantCrops(int acresPlanted,  CropData cropData){

//If acresPlanted < 0, return -1
        if (acresPlanted < 0) {
            return -1;
        }

//If acresPlanted > acresOwned, return -1
        if (acresPlanted > cropData.getAcresOwned()) {
            return -1;
        }

//If wheatInStore < (acresPlanted / 2), return -1
        if (cropData.getWheatInStore() < (acresPlanted / 2)) {
            return -1;
        }

//wheatInStore = wheatInStore – (acresPlanted / 2)
        int wheatInStore = cropData.getWheatInStore() - (acresPlanted / 2);
        cropData.setWheatInStore(wheatInStore);

//return wheatInStore
        return wheatInStore;

}
}
