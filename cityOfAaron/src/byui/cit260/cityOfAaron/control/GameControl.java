/* The GameControl Class - part of the Control Layer
 * CIT-260
 * Authors: Patricia Struk, Alejandra Canales, Yamilka Cuellar
 * Last modified: June 27, 2018
 */
package byui.cit260.cityOfAaron.control;

import java.util.ArrayList;
import byui.cit260.cityOfAaron.model.*;
import cityofaaron.CityOfAaron;


public class GameControl {
//size of the Location array
    private static final int MAX_ROW = 5;
    private static final int MAX_COL = 5;

//reference to a Game object
    private static Game theGame;

    public static void createNewGame(String pName){

	// Created the game object. Save it in the main driver file
	theGame = new Game();
	CityOfAaron.setTheGame(theGame);

	// create the player object. Save it in the game object
	Player thePlayer = new Player();
	thePlayer.setName(pName);
	theGame.setThePlayer(thePlayer);
	
        // Calls for these game control class methods       
        createCropDataObject();
        createAnimalList();
        createToolList();
        createProvisionList();
        createMap();
        
}  
    
    
// The createCropDataObject method
// Purpose: creates a crop data object, sets the initial values, saves the 
// initial values for each data member and then saves reference to the CropData
// object in the game
//Parameters: none
//Returns: none
//==============================================================================
    
// create the CropData object
public static void createCropDataObject(){
    
    //create a CropData Object
    CropData cropData = new CropData();
    //initialize it 
    cropData.setYear(0);
    cropData.setPopulation(100);
    cropData.setNewPeople(5);
    cropData.setCropYield(3);
    cropData.setNumberWhoDied(0);
    cropData.setOffering(10);
    cropData.setWheatInStore(2700);
    cropData.setAcresOwned(1000);
    cropData.setAcresPlanted(1000);
    cropData.setHarvest(3000);
    cropData.setOfferingBushels(300);
    cropData.setAcresPlanted(1000); 

    //save a reference to it in the game
    theGame.setCrop(cropData); 
}   
//The createAnimalList method
//Purpose: creates an array list of list items, the add method is used to add a
//list item to the array list
//Parameters: none
//Returns: none 
//=============================================================================


public static void createAnimalList(){
    
// create an ArrayList<ListItem> object and the list of animals in array   
    ArrayList<ListItem> animals = new ArrayList<>();
    
    animals.add(new ListItem("cureloms", 20));
    animals.add(new ListItem("cummoms", 17));
    animals.add(new ListItem("llamas", 7));
    animals.add(new ListItem("goats", 40));
    animals.add(new ListItem("aardvarks", 15));
    animals.add(new ListItem("peacocks", 10));
    animals.add(new ListItem("komodo dragons", 12));
    animals.add(new ListItem("camels", 25));
    

    theGame.setAnimals(animals);

}   

public static void createToolList(){
    
}

        
public static void createProvisionList(){
    
}
  
//The createMap method
// Purpose: creates the location objects and the map
// Parameters: none
// Returns: none
//============================================================================
public static void createMap()   {

// create the Map object, it is 5 x 5, refer to the Map constructor

    Map theMap = new Map(MAX_ROW, MAX_COL);
   

//RIVER------------------------------------------------------------------------    
// create a string that will go in the Location objects that contain the river
    String river = "\nYou are on the Jordan River. The river is the source" +
                   "\nof life for our city. The river marks the eastern" +
                   "\nboundary of the city - it is wilderness to the East.";

// create a new Location object
    Location loc = new Location();

//use setters in the Location class to set the description and symbol
    loc.setDescription(river);
    loc.setSymbol("~~~");

//set this location object in each cell of the array in column 4
    for(int i = 0; i < MAX_ROW; i++){
      theMap.setLocation(i,4,loc);  
    }
    
    
    
    
 //FARMLAND--------------------------------------------------------------------   
 // define the string for a farm land location
    String farmland = "\nYou are on the fertile banks of the River."+
    "\nIn the spring this low farmland floods and is covered with rich"+
    "\nnew soil. Wheat is planted as far as you can see." ;
    
// set a farmland location with a hint
    loc = new Location();
    loc.setDescription(farmland + "\nOne person can plant ten acres of wheat.");
    loc.setSymbol("!!!");
    theMap.setLocation(1,3,loc);
    theMap.setLocation(2,3,loc);
    
    
    
 //MOUNTAINS--------------------------------------------------------------------
 //create a string that will go in the Location objects that contain 
 //the mountains
    String mountains ="\nYou are looking at the glorious mountain range " +        
                      "\nthat surrounds our city on the west. Traveling" +
                      "\neastward, you will find the Aaron City temple in all" +
                      "\nits glory." ; 
                   
    loc = new Location();
    
//use setters in the Location class to set the description and symbol
    loc.setDescription(mountains);
    loc.setSymbol("^^^");

//set this location object in each cell of the array in column 0
    for(int i = 0; i < MAX_ROW; i++){
      theMap.setLocation(i,0,loc);
      
      
    }
    
    
    
    
    
    
    
    
    
    
    
    theGame.setMap(theMap);
            
  
  
  
  
  
  
  
  
  
  
  
  
  
}




}//end of class







