//The PrintListMenuView - part of the view layer
//Provides the user with a set of list options
//Author Alejandra Canales 
//Date last modified: June 13 2018
//--------------------------------------------------------------
package byui.cit260.cityOfAaron.view;

import java.util.Scanner;

public class PrintListMenuView {
Scanner keyboard = new Scanner(System.in);
private final String listMenu;
private final int max;


//The PrintListMenuView method 
//Purpose: Provides the user with a set of list options
//Parameters:none
//Returns: none
//==============================================================
    
public PrintListMenuView(){
    listMenu = "\n" +
                "********************************************\n" +
                "*   CITY OF AARON: LIST MENU *\n" + 
                "********************************************\n" +
                "1 - List of the animals in the storehouse\n" +
                "2 - List of the tools in the storehouse\n" +
                "3 - List of the provisions in the storehouse\n" +
                "4 - List of the authors of this game\n" +
                "5 - Quit\n";
        
        
    max = 5;
        
}     

//The displayPrintListMenuView method
//Purpose: displays the menu, gets the user's input, and does the selected action
//Parameters: none
//Returns: none
//=====================================================================    
    
public void displayPrintListMenuView(){
   int menuOption;
   do{
        //Display the menu
        System.out.println(listMenu);
        
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

  public int getMenuOption(){
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
        case 1: //view list of animals in storehouse 
          viewAnimals();
          break;
        case 2: //view list of tools in storehouse
          viewTools();
          break;
        case 3: // view list of provisions in the storehouse
          viewProvisions();
          break;
        case 4: // view list of authors of this game
          viewAuthors();
          break;
        case 5:
          System.out.println();
    }
}
  
  // The viewAnimals method
//Purpose: displays animals in storehouse
//Parameters: none
//Returns: none
//============================================================================
  private void viewAnimals() {
        System.out.println("\nThis is the list of animals in your storehouse");
    }
  
  
  // The viewTools method
//Purpose: displays tools in storehouse
//Parameters: none
//Returns: none
//============================================================================
  
 private void viewTools() {
        System.out.println("\nThis is the list of tools in your storehouse");
    }
  
  // The viewProvisions method
//Purpose: displays provisions in storehouse
//Parameters: none
//Returns: none
//============================================================================
 
 private void viewProvisions() {
        System.out.println("\nThis is the list of provisions in your storehouse");
    }
  
  // The viewAuthors method
//Purpose: displays authors of game
//Parameters: none
//Returns: none
//============================================================================
 
 private void viewAuthors() {
        System.out.println("\nThese are the authors of this game");
    }
  
  
  
}//end of code
