// The GameMenuView class - part of the view layer
// Object of this class show the Game Menu
// CIT - 260 
// Author: Yamilka Cuellar
// Date last modified: June/12/2018
//----------------------------------------------------------------
package byui.cit260.cityOfAaron.view;

import byui.cit260.cityOfAaron.model.Game;
import java.util.Scanner;

public class GameMenuView {
    
    Scanner keyboard = new Scanner(System.in);
    private final String gameMenu;
    private final int max;
    private Game theGame; 
    
// MainMenuView() constructor
// Purpose: Initialize the Game menu
// Parameters: none
// Returns: none
// ======================================================================
    
    public GameMenuView(){
        
       gameMenu = "\n" +
                "********************************************\n" +
                "*   CITY OF AARON: GAME MENU *\n" + 
                "********************************************\n" +
                "1 - View the map\n" +
                "2 - View/Print a list\n" +
                "3 - Move to a new location\n" +
                "4 - Manage the crops\n" +
                "5 - Return to the Main Menu\n";
        
        
        max = 5;
    }
    
//The displayMenuView method
//Purpose: displays the menu, gets the user's input, and does the selected action
//Parameters: none
//Returns: none
//===================================================================== 
    
public void displayMenuView()
{
   int menuOption;
   do{
        //Display the menu
        System.out.println(gameMenu);
        
        //Prompt the user and get the user's input
        menuOption = getMenuOption();
        
        //Perform the desired action
        doAction(menuOption);
        
        //Determine and display the next view
        } while (menuOption != max);
   
    }

// The getMenuOption method
// Purpose: gets the user's input
// Parameters: none
// Returns: integer - the option selected 
// ======================================================================
public int getMenuOption()
{
    //declare a variable to hold user's input
    int userInput;
    
    //begin loop
    do {
        // get user input from the keyboard
        userInput = keyboard.nextInt();
        
        // if it is not a valid value, output an error message 
        if(userInput < 1 || userInput > max)
        {
            System.out.println("\noption must be between 1 and " + max);        
        }
        
        // loop back to the top if input was not valid
        } while(userInput < 1 || userInput > max);
    
        // return the value input by the user
        return userInput;
}

//The doAction method
//Purpose: performs the selected action
//Parameters: none
//Returns: none 
//===========================================================================

public void doAction(int option)
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
          MainMenuView theMenu = new MainMenuView();
          theMenu.displayMenuView();
          
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
        System.out.println("\nThis is manage the crops option");
    }

    
}// end of class
