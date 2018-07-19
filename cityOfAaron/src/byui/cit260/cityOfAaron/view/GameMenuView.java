// The GameMenuView class - part of the view layer
// Object of this class show the Game Menu
// CIT - 260 
// Author: Yamilka Cuellar
// Date last modified: June/12/2018
//----------------------------------------------------------------
package byui.cit260.cityOfAaron.view;

import byui.cit260.cityOfAaron.model.*;

public class GameMenuView extends MenuView {
    
    private Game theGame; 
    
// MainMenuView() constructor
// Purpose: Initialize the Game menu
// Parameters: none
// Returns: none
// ======================================================================
    
    public GameMenuView(){
       
        // super: calls the base class constructor
       super("\n" +
                "********************************************\n" +
                "*   CITY OF AARON: GAME MENU *\n" + 
                "********************************************\n" +
                "1 - View the map\n" +
                "2 - View/Print a list\n" +
                "3 - Move to a new location\n" +
                "4 - Manage the crops\n" +
                "5 - Return to the Main Menu\n",
               5);
    }

//The doAction method
//Purpose: performs the selected action
//Parameters: none
//Returns: none 
//===========================================================================

@Override public void doAction(int option)
{
    switch(option)
    {
        case 1: //view the map
          viewMap();
          break;
        case 2: //view/print a list
          viewList();
          break;
        case 3: // Move to a new location
          moveToNewLocation();
          break;
        case 4: // Manage the crops
          manageCrops();
          break;
        case 5: // Return to Main Menu
            System.out.println("You will return to the Main Menu now");
          
    }
}

// Lesson 13 - Individual Assignment                    AUTHOR: Patricia Struk

// The viewMap method
// Purpose: Displays a map of the City of Aaron, along with a key for the map
// Parameters: none
// Returns: none
// Last Modified July 19, 2018
//=============================================================================
    private void viewMap() {
           
        // Get the current game 
        theGame = cityofaaron.CityOfAaron.getTheGame();
        
        // Get the map   
        Map map = theGame.getMap();
        Location locations = null;
        
        // Print the map's title
        System.out.println("\n*** Map: CITY OF AARON and Surrounding Area ***\n");
        // Print the column numbers 
        System.out.println("     1     2     3     4     5");
            // for every row:
            for (int i = 0; i < max; i++){
                // Print a row divider
                System.out.println("  -------------------------------");
                // Print the row number
                System.out.print((i + 1) + " ");
                // for every column:
                for(int j = 0; j<max; j++){
                    // Print a column divider
                    System.out.print("|");
                    // Get the symbols and locations(row, column) for the map
                    locations = map.getLocation(i, j);
                    System.out.print(" " + locations.getSymbol() + " ");
                }
                // Print the ending column divider
                System.out.println("|");
            }
            // Print the ending row divider
            System.out.println("  -------------------------------\n");
            
            // Print a key for the map
            System.out.println("Key:\n" + "|=| - Temple\n" + "~~~ - River\n" 
                + "!!! - Farmland\n" + "^^^ - Mountains\n" + "[*] - Playground\n" 
                + "$$$ - Capital " + "City of Aaron\n" + "### - Chief Judge/Courthouse\n" 
                + "YYY - Forest\n" + "TTT - Toolshed\n" +"xxx - Pasture with "
                + "Animals\n" + "+++ - Storehouse\n" +">>> - Undeveloped Land\n");
    } 

//The viewList method
//Purpose: View/print a list of options
//Parameters: none
//Returns: none 

private void viewList() {
        PrintListMenuView listMenu = new PrintListMenuView();
          listMenu.displayMenu();
    }

//The moveToNewLocation method
//Purpose: Show move to a new location option
//Parameters: none
//Returns: none 

private void moveToNewLocation() {
        System.out.println("\nThis is the move to a new location option");
    }
    
//The manageCrops method
//Purpose: Show manage the crops option
//Parameters: none
//Returns: none 

    private void manageCrops() {
//      System.out.println("\nThis is manage the crops option");
        CropView.runCropsView();
    }

    
}// end of class
