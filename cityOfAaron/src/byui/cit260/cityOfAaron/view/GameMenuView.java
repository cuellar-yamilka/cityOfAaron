// The GameMenuView class - part of the view layer
// Object of this class show the Game Menu
// CIT - 260 
// Author: Yamilka Cuellar
// Date last modified: June/12/2018
//----------------------------------------------------------------
package byui.cit260.cityOfAaron.view;

import byui.cit260.cityOfAaron.model.Game;

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
            System.out.println();
          
    }
}

//The viewMap method
//Purpose: Show a map of the City of Aaron
//Parameters: none
//Returns: none 

private void viewMap() {
    System.out.println("\nThis is the map of The City Of Aaron");
          
    }

//The viewList method
//Purpose: View/print a list of options
//Parameters: none
//Returns: none 

private void viewList() {
        PrintListMenuView listMenu = new PrintListMenuView();
          listMenu.displayPrintListMenuView();
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
