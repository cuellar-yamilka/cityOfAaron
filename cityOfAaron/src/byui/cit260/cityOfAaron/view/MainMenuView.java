// The MainMenuView class - part of the view layer
// Object of this class manages the main menu 
// CIT - 260 
// Author: Patricia Struk, Yamilka Cuellar, Alejandra Canales
// Date last modified: June 2018
//----------------------------------------------------------------
package byui.cit260.cityOfAaron.view;

import byui.cit260.cityOfAaron.model.CropData;
import java.util.Scanner;
import cityofaaron.CityOfAaron;
import byui.cit260.cityOfAaron.model.Player;
import byui.cit260.cityOfAaron.model.Game;

 
public class MainMenuView {
    Scanner keyboard = new Scanner(System.in);
    private final String theMenu;
    private final int max;
            
// MainMenuView() constructor
// Purpose: Initialize the menu date
// Parameters: none
// Returns: none
// ======================================================================
    public MainMenuView()
    { 
        theMenu = "\n" +
                "********************************************\n" +
                "*   CITY OF AARON: MAIN MENU *\n" + 
                "********************************************\n" +
                "1 - Start new game\n" +
                "2 - Get and start a saved game\n" +
                "3 - Get help on playing the game\n" +
                "4 - Save game\n" +
                "5 - Quit\n";
        
        
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
        System.out.println(theMenu);
        
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
        case 1: //create and start a new game
          startNewGame();
          break;
        case 2: //get and start a saved game
          startSavedGame();
          break;
        case 3: // get help menu
          displayHelpMenuView();
          break;
        case 4: // save game
          displaySaveGameView();
          break;
        case 5:
          System.out.println("Thanks for playing... goodbye.");
    }
}
// The startNewGame method
//Purpose: creates game object and starts the game
//Parameters: none
//Returns: none
//============================================================================
public void startNewGame() 
{ 
    //Create a new Game object.
    Game theGame = new Game();
    
    //Save a reference to it in the CityOfAaron class.
    CityOfAaron.setTheGame(theGame);
    
    //Display the Banner Page.
    System.out.println("\nHELP WANTED: City Administrator, competitive"  
            + " salary with benefits.\n\nYour mission, if you choose to accept" 
            + " it, is to rebuild and grow the City of Aaron \nafter years of" 
            + " incompetent leadership. Responsibilities include: land acquisitions"
            + " \n(buying and selling); resource management (the amount of wheat"
            + " to plant each year \nand to feed the people); budgeting (payment"
            + " of annual tithes and offerings); and \nthe development of an"
            + " emergency plan (when rats eat the wheat). Employment will be"
            + " \nterminated if too many people die from starvation. Only serious"  
            + " candidates need apply. \nIf you're ready to begin...");
    
    //Create a new Player object.
    Player thePlayer = new Player();
    
    //Prompt for and get the user's name.
    String name;
    System.out.println("\nPlease type in your first name: ");
    name = keyboard.next();
    
    //Save the user's name in the Player object
    thePlayer.setName(name);
    
    //Save a reference to the player object in the Game object
    theGame.setThePlayer(thePlayer);
    
    //Display a welcome message
    System.out.println("\nWelcome " + name + " have fun.");
    
    //Display the Game menu
    GameMenuView gameMenu = new GameMenuView();
    gameMenu.displayMenuView();
    
    // Create a CropData object
    
    CropData cropData = new CropData();
    
    // Initialize it
    
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
    
    // save a reference to it in the Game
    
    theGame.setCrop(cropData);
    
      
}

// The startSavedGame method
//Purpose: starts an existing saved game.
//Parameters: none
//Returns: none
//============================================================================

public void startSavedGame()
{ 
    System.out.println("\nStart saved game option selected.");
}

// The displayHelpMenuView method
//Purpose: displays the help menu
//Parameters: none
//Returns: none
//============================================================================
public void displayHelpMenuView()
{ 
//    System.out.println("\nHelp menu option selected.");  STUB
        //code to get the Help Menu displayed
        HelpMenuView help = new HelpMenuView();  
        help.displayHelpMenuView();      
    
}

// The displaySaveGameView method
//Purpose: displays the save game options 
//Parameters: none
//Returns: none
//============================================================================
public void displaySaveGameView()
{ 
    System.out.println("\nSave game option selected.");
}



      }//end of class
