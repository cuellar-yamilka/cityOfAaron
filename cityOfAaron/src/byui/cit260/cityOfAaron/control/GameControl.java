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
    // create an ArrayList<ListItem> object and the list of tools in array   
    ArrayList<ListItem> tools = new ArrayList<>();
    
    tools.add(new ListItem("axes", 15));
    tools.add(new ListItem("hammers", 10));
    tools.add(new ListItem("nails", 150));
    tools.add(new ListItem("pliers", 12));
    tools.add(new ListItem("rakes", 13));
    tools.add(new ListItem("screwdrivers", 14));
    tools.add(new ListItem("wrenches", 10));
    tools.add(new ListItem("nuts", 30));
    tools.add(new ListItem("steel wools", 8));
    tools.add(new ListItem("tape measurers", 6));
    
    theGame.setTools(tools);
    
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
    loc.setDescription(farmland + "\nOne person can tend ten acres of land"
            + "\nand one bushel of wheat can plant two acres.");
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
    
    
    //PLAYGROUND--------------------------------------------------------------------   
    // define the string for a Playground location
    String playground = "\nThis is the local playground. It is a safe place for"+
    "\nyoung children to play and where many people come to enjoy the sunshine"+
    "\nand a picnic." ;
    
    // set a playground location 
    loc = new Location();
    loc.setDescription(playground);
    loc.setSymbol("[*]");
    theMap.setLocation(0,1,loc);
    
    
    //CITY OF AARON (CAPITAL CITY) --------------------------------------------------------------------   
    // define the string for the city of Aaron location
    String city = "\nWelcome to the capital city of Aaron. It is a humble town"+
    "\nof warm and friendly people. On Saturdays, merchants come from all around"+
    "\nto trade their goods and services at the market." ;
    
    // set a city of Aaron location 
    loc = new Location();
    loc.setDescription(city);
    loc.setSymbol("$$$");
    theMap.setLocation(1,1,loc);
    
    //TEMPLE--------------------------------------------------------------------   
    // define the string for the Temple location
    String temple = "\nWelcome to the House of the Lord. This is a holy place "+
    "\nwhere people can find peace and comfort. While you are here, make sure to"+
    "\nattend the visitors center." ;
    
    // set a temple location 
    loc = new Location();
    loc.setDescription(temple);
    loc.setSymbol("|=|");
    theMap.setLocation(2,1,loc);
    
    
    //CHIEF JUDGE/COURTHOUSE---------------------------------------------------- 
    // define the string for the courthouse location
    String courthouse = "\nWe are a law abiding people. Our chief judge, Nephi"+
    "\nrules with justice, compassion, and wisdom. We adhere to the law of "+
    "\nconsecration." ;
    
    // set a courthouse location 
    loc = new Location();
    loc.setDescription(courthouse);
    loc.setSymbol("###");
    theMap.setLocation(3,1,loc);
    
    
    
    //FOREST-------------------------------------------------------------------
    // define the string for the forest location
    String forest = "\nYou are standing in the Forest of No Return. Some of"+
    "\nour most dangerous creatures live among these trees. Don't get too close"+
    "\nor you might regret it. You might even see some Gadianton Robbers" ;
    
    // set a forest location 
    loc = new Location();
    loc.setDescription(forest);
    loc.setSymbol("YYY");
    theMap.setLocation(4,1,loc);
    
    
    //TOOLSHED------------------------------------------------------------------
    // define the string for the toolshed location
    String toolshed = "\nDoing a renovation? Need some tools? You have come to"+
    "\nthe right place. The tool shed holds the largest assortment of tools in"+
    "\nthe region." ;
    
    // set a toolshed location and leave a hint
    loc = new Location();
    loc.setDescription(toolshed + "\nTo see a list of the tools available, go"
            + "\nto the game menu and select option 2");
    loc.setSymbol("TTT");
    theMap.setLocation(0,2,loc);
    
    
    //PASTURE AND ANIMALS-------------------------------------------------------
    // define the string for the pasture location
    String pasture = "\nYou are standing in the middle of verdant pastures"+
    "\nwhere a wide variety of animals and livestock find respite. Come check"+
    "\nout our cureloms and cummoms. We bet you've never seen those before!" ;
    
    // set a pasture location and leave a hint
    loc = new Location();
    loc.setDescription(pasture + "\nTo see a list of our animals, go"
            + "\nto the game menu and select option 2");
    loc.setSymbol("xxx");
    theMap.setLocation(3,3,loc);
    theMap.setLocation(4,3,loc);

    
    //STOREHOUSE----------------------------------------------------------------
    // define the string for the storehouse location
    String storehouse = "\nThis is the bishop's storehouse. The storehouse"+
    "\nis part of our welfare system and provides necessary items for people in"+
    "\nneed. Volunteers and offerings are always welcome! See the game hint for"
            + "\nmore details." ;
    
    // set a storehouse location and leave a hint
    loc = new Location();
    loc.setDescription(toolshed + "\nTo see a list of the provisions available,"
            + "\ngo to the game menu and select option 2. Offerings above"
            + "\n12% provide the largest crop yield opportunity.");
    loc.setSymbol("+++");
    theMap.setLocation(0,3,loc);
    
    
    
    //UNDEVELOPED LAND----------------------------------------------------------
    // define a string for the expansion location

    String expansion ="\nThinking about relocating? We have reserved this land" +        
                      "\nfor new residential properties and business development," +
                      "\nin order to meet the needs of our growing community."; 
                   
    loc = new Location();
    
    //use setters in the Location class to set the description and symbol
    loc.setDescription(expansion + "\nLand prices range between 17 and 27 "
            + "\nbushels per acre, and change yearly.");
    loc.setSymbol(">>>");

    //set this location object in each cell of the array in column 0
    for(int i = 1; i < MAX_ROW; i++){
      theMap.setLocation(i,2,loc);
    
    }
    
    theGame.setMap(theMap);
            
  
}


}//end of class







