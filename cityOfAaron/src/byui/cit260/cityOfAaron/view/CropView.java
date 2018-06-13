// The CropView class - part of the view layer
// Object of this class manages the crop view 
// CIT - 260 
// Author: Patricia Struk, Yamilka Cuellar, Alejandra Canales
// Date last modified: June/12/2018
//----------------------------------------------------------------
package byui.cit260.cityOfAaron.view;

import byui.cit260.cityOfAaron.model.*;
import byui.cit260.cityOfAaron.control.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;


public class CropView {
    
// create a scanner object
    private static Scanner keyboard = new Scanner(System.in);

// get references to the Game object and the CropData object
    
    private static Game theGame = CityOfAaron.getTheGame();
    // Is this supposed to be getCrop or getCropData
    private static CropData cropData = theGame.getCrop();

// the buyLandView() method
// Purpose: interface with the user input for buying land
// Parameters: none
// Returns: none
    
public static void buyLandView(){
    
// Get the cost of land for this round
int price = CropControl.calcLandCost();

// Prompt the user to enter the number of acres to buy
System.out.format("Land is selling for %d bushels per acre.%n", price);
System.out.print("\nHow many acres of land do you wish to buy?");

// Get the user's input and save it
int toBuy;
toBuy = keyboard.nextInt();

// Call the buyLand() method in the control layer to buy the land
CropControl.buyLand(price, toBuy, cropData); 
}

// the runCropsView method()
// Purpose: runs the City Of Aaron game
//Parameters: none
//Returns: none

public static void runCropsView(){
    // call the buyLandView() method
    buyLandView();
    
    // add calls to the other crop view methods
    // as they are written
}

} // end of class
