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
}
