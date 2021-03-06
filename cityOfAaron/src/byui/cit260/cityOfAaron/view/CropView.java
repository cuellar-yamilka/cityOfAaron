// The CropView class - part of the view layer
// Object of this class manages the crop view 
// CIT - 260 
// Author: Patricia Struk, Yamilka Cuellar, Alejandra Canales
// Date last modified: July 2018
//----------------------------------------------------------------
package byui.cit260.cityOfAaron.view;

import byui.cit260.cityOfAaron.model.*;
import byui.cit260.cityOfAaron.control.*;
import byui.cit260.cityOfAaron.exceptions.CropException;
import java.util.Scanner;
import cityofaaron.CityOfAaron;

public class CropView {
// create a scanner object
    private static Scanner keyboard = new Scanner(System.in);

// get references to the Game object and the CropData object
    
    private static Game theGame = CityOfAaron.getTheGame();
    // Is this supposed to be getCrop or getCropData
    private static CropData cropData = theGame.getCrop();
    private static int price;

// the buyLandView() method
// Purpose: interface with the user input for buying land
// Parameters: none
// Returns: none
    
public static void buyLandView(){
    
// Get the cost of land for this round
    price = CropControl.calcLandCost();
    // Display the current price of buying an acre of land in bushels of wheat
    System.out.format("\nLand is selling for %d bushels per acre.%n", price);
    
    int toBuy;
    boolean paramsNotOkay;
    //Set up a do-while loop to try and catch exceptions, set paramsNotOkay to false
    do
    {
        paramsNotOkay = false;
        // Prompt the user to enter the number of acres to buy
        System.out.print("\nHow many acres of land do you wish to buy?\n");
        // Get the users input and save it
        toBuy = keyboard.nextInt();
        
        try
        {
            // Call the buyLand() method in the control layer to buy the land
            CropControl.buyLand(price, toBuy, cropData); 
        }
        catch(CropException e){
            System.out.println("\nI am sorry master, I cannot do this.");
            System.out.println(e.getMessage());
            // Set paramsNotOkay to true
            paramsNotOkay = true;
        }
    } while(paramsNotOkay);
    
}

// the runCropsView method()
// Purpose: runs the City Of Aaron game
//Parameters: none
//Returns: none

public static void runCropsView(){
// call the buyLandView() method
    buyLandView();
    
// add calls to the other crop view methods as they are written
    sellLandView();
    feedPeopleView(); 
    plantCropsView();
    payOfferingView();
}

//Individual assignment Lesson 8 author Yamilka Cuellar
// the plantCropsView method()
// Purpose: Interface with the user input for plant crops
//Parameters: none
//Returns: none

public static void plantCropsView(){

// Get the user's input and save it
int toPlant;

boolean paramsNotOkay;
//Set up a do-while loop to try and catch exceptions, set paramsNotOkay to false
do {
    paramsNotOkay = false;
    // Prompt the user to enter the number of acres to plant
    System.out.println("\nHow many acres of land do you want to plant? "
            + "You can plant 2 acres with one bushel of wheat.\n");
    toPlant = keyboard.nextInt();
    
    try {
        // Call the plantCrops() method in the control layer to plant the crops
        CropControl.plantCrops(toPlant, cropData);        
    }
    catch(CropException e){
        System.out.println("\nI am sorry master, I cannot do this.\n");
        System.out.println(e.getMessage());
        paramsNotOkay = true;
    }
} while(paramsNotOkay);
 
}

// Lesson 8 - Individual Assignment-sellLandView()     Author: Patricia Struk

// The sellLandView() method
// Purpose: To interface with user input in order to sell land
// Parameters: none
// Returns: none
// ============================================================================

   public static void sellLandView(){
    
// A land price was randomly generated in the buyLand() method and stored in 
// a class variable called "price". The value in "price" is accessed here.
    
    //Display the current price of selling an acre of land (in bushels)
    System.out.format("\nLand is selling for %d bushels per acre.%n", price);
        
    boolean paramsNotOkay;
    //set up a do/while loop to try and catch exceptions, set paramsNotOkay to false
    do {
        paramsNotOkay = false;
        // Ask user to enter the number of acres of land they want to sell
        System.out.print("\nHow many acres of land would you like to sell?\n"); 

        //  Get the user’s input and save it.
        int toSell;
        toSell = keyboard.nextInt();
        try {
        // Call the sellLand() method in the control layer to sell the land
            CropControl.sellLand(price, toSell, cropData);
        }
        catch(CropException e) {
            System.out.println("\nI am sorry master, I cannot do this.");
            System.out.println(e.getMessage());
            //set paramsNotOkay to true
            paramsNotOkay = true;
        }
    } while(paramsNotOkay); 
          
    }    

// Lesson 11 - Individual Assignment - PayOfferingView()  AUTHOR: Patricia Struk      
// The payOfferingView() method
// Purpose: To interface with user input that will determine amount of offerings
// Parameters: none
// Returns: none
// ============================================================================   
    
   public static void payOfferingView(){
    
    boolean paramsNotOkay;
    //set up a do/while loop to try and catch exceptions, set paramsNotOkay to false
    do {
        paramsNotOkay = false;
        int theOffering;
        
        // Ask user to enter the percentage they would like to pay for tithes/offerings    
        System.out.print("\nWhat percentage of the harvest do you want to pay" +
                            " for tithes and offerings?\n");      
        // Get user's input and save it.
        theOffering = keyboard.nextInt();
        try {
            // Call setOffering() method in control layer to check if input is valid
            // and to save the value in the offering variable in CropData.
            CropControl.setOffering(theOffering, cropData);
        }
        catch(CropException e) {
            System.out.println("\nI am sorry master, I cannot do this.");
            System.out.println(e.getMessage());
            //set paramsNotOkay to true
            paramsNotOkay = true;
        }
    } while(paramsNotOkay); 
          
    // Call payOffering() to calculate and pay tithes and offerings
        CropControl.payOffering(cropData);
    
    }    
    
//Individual assignment Lesson 11 Author: Alejandra Canales
// the feedPeopleView method()
// Purpose: To interface with user input in order to determine grain to feed 
// the people
//Parameters: none
//Returns: none

public static void feedPeopleView(){
    boolean paramsNotOkay;
    //set up a do/while loop to try and catch exceptions, set paramsNotOkay to false
    do {
        paramsNotOkay = false;
        int wheatWanted;
        
    // Prompt the user to enter the number of bushels of grain wanted to give
        System.out.print("\nHow many bushels of grain do you want to give"
                + " to the people?\n");

   // Get the user's input
        wheatWanted = keyboard.nextInt();
        
        try {
   // Call feedPeople() method in control layer to check if input is valid
   // and to save the value in the toFeed variable in CropData.
            CropControl.feedPeople(wheatWanted, price, cropData);
        }
        catch(CropException e) {
            System.out.println("\nI am sorry master, I cannot do this.");
            System.out.println(e.getMessage());
            
            //set paramsNotOkay to true
            paramsNotOkay = true;
        }
    } while(paramsNotOkay); 
            
    }    
    
} // end of class
