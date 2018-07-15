// The MainMenuView class - part of the view layer
// Object of this class manages the main menu 
// CIT - 260 
// Author: Patricia Struk, Yamilka Cuellar, Alejandra Canales
// Date last modified: July 12, 2018
//----------------------------------------------------------------
package byui.cit260.cityOfAaron.view;

import byui.cit260.cityOfAaron.control.*;
import byui.cit260.cityOfAaron.model.*;

public class MainMenuView extends MenuView {
          
// MainMenuView() constructor
// Purpose: Initialize the menu date
// Parameters: none
// Returns: none
// ======================================================================
    public MainMenuView(){ 
        super("\n" +
                "********************************************\n" +
                "*   CITY OF AARON: MAIN MENU *\n" + 
                "********************************************\n" +
                "1 - Start new game\n" +
                "2 - Get and start a saved game\n" +
                "3 - Get help on playing the game\n" +
                "4 - Save game\n" +
                "5 - Quit\n",        
            5);
            
    }
    
// The doAction method
// Purpose: performs the selected action
// Parameters: none
// Returns: none 
//===========================================================================

@Override public void doAction(int option)
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
// Purpose: creates game object and starts the game
// Parameters: none
// Returns: none
//============================================================================
public void startNewGame() { 
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
    
    //Prompt for and get the user's name.
    String name;
    System.out.println("\nPlease type in your first name: ");
    name = keyboard.next();
   
    //Display a welcome message
    System.out.println("\nWelcome " + name + " have fun.");
    
    //call the createNewGame( ) method. Pass the name as a parameter
    GameControl.createNewGame(name);
         
    //Display the Game menu
    GameMenuView gameMenu = new GameMenuView();
    gameMenu.displayMenu();
     
}

// The startSavedGame method - Gets a file name from the user, passes this file 
//   name to a method in the GameControl class, which loads a saved Game from the 
//   disk.  
// Purpose: starts an existing saved game.  
// Parameters: none
// Returns: none
//============================================================================

public static void startSavedGame() {
    
    // get rid of nl character left in the stream (with a dummy nextLine())
    keyboard.nextLine();
  
    // prompt user and get a file path
    System.out.println("Please enter the name of the file path where your game "
            + "is stored.");
    String path = keyboard.nextLine();
    
    // call the getSavedGame( ) method in the GameControl class to load the game
    GameControl.getSavedGame(path);
    
    // display the game menu for the loaded game
    GameMenuView gameMenu = new GameMenuView();
    gameMenu.displayMenu();
 
}

// The displayHelpMenuView method
// Purpose: displays the help menu
// Parameters: none
// Returns: none
//============================================================================
public void displayHelpMenuView()
{ 
    //code to get the Help Menu displayed
    HelpMenuView help = new HelpMenuView();  
    help.displayMenu();      
    
}

// The displaySaveGameView() method
// Purpose: displays the save game menu options 
// Parameters: none
// Returns: none
//============================================================================
public void displaySaveGameView() {
    
    // get rid of nl character left in the stream (with a dummy nextLine())
    keyboard.nextLine();
    
    // prompt user and get a file path
    System.out.println("\nPlease enter the name of the file path where you would "
            + "like to save this game.");
    String path = keyboard.nextLine();
    
    // call the saveGame() method in the GameControl class to save the game
    Game game = cityofaaron.CityOfAaron.getTheGame(); 
    GameControl.saveGame(game, path);
    
    // display the gameMenuView options to user
    GameMenuView gameMenu = new GameMenuView();
    gameMenu.displayMenu();
    
}

}//end of class
