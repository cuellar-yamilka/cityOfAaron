//The PrintListMenuView - part of the view layer
//Provides the user with a set of list options
// CIT 260
//Author Alejandra Canales 
//Date last modified: June 20 2018
//--------------------------------------------------------------
package byui.cit260.cityOfAaron.view;

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
