//The PrintListMenuView - part of the view layer
//Provides the user with a set of list options
// CIT 260
//Author Alejandra Canales 
//Date last modified: June 20 2018
//--------------------------------------------------------------
package byui.cit260.cityOfAaron.view;


import java.util.ArrayList;
import cityofaaron.CityOfAaron;
import byui.cit260.cityOfAaron.model.*;

public class PrintListMenuView extends MenuView {
   

// PrintListMenuView() constructor
// Purpose: Initialize the Print List menu
// Parameters: none
// Returns: none
// ======================================================================

public PrintListMenuView(){
    super("\n" +
                "********************************************\n" +
                "*   CITY OF AARON: LIST MENU *\n" + 
                "********************************************\n" +
                "1 - List of the animals in the storehouse\n" +
                "2 - List of the tools in the storehouse\n" +
                "3 - List of the provisions in the storehouse\n" +
                "4 - List of the authors of this game\n" +
                "5 - Quit\n",
        
        
             5) ;     
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
        Game theGame = CityOfAaron.getTheGame();
        ArrayList<ListItem> animals = theGame.getAnimals();
        
        System.out.println("\nThe following animals are found in the storehouse:\n");
        
        for(ListItem n: animals){
            System.out.println(n.getName() + ": " + n.getNumber());
        }
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

//Lesson 10 - Individual Assignment             Author: Patricia Struk 

//The viewAuthors() method
//Purpose: displays authors of game
//Parameters: none
//Returns: none
//============================================================================
 
 private void viewAuthors() {
 
    System.out.println("\nThe authors of this game are: ");
    
    // Extract TeamMember objects in the enum list and put into an array
    TeamMember[] members = TeamMember.values();
       
    // Using a for-each loop, iterate through the array and display names 
    // and titles of game authors
    for(TeamMember name: members) {
        System.out.println("\n" + name.getName() + " (" + name.getTitle() + ")");
    }
}
 
 
}//end of class
