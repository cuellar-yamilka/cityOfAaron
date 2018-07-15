// The PrintListMenuView - part of the view layer
// Provides the user with a set of list options
// CIT 260
// Author Alejandra Canales 
// Date last modified: July 14, 2018
//--------------------------------------------------------------
package byui.cit260.cityOfAaron.view;


import java.util.ArrayList;
import cityofaaron.CityOfAaron;
import byui.cit260.cityOfAaron.model.*;
import java.io.PrintWriter;

public class PrintListMenuView extends MenuView {
   

// PrintListMenuView() constructor
// Purpose: Initialize the Print List menu
// Parameters: none
// Returns: none
// ======================================================================

public PrintListMenuView(){
    super("\n" +
                "********************************************\n" +
                "       * CITY OF AARON: LIST MENU *\n" + 
                "********************************************\n" +
                "1 - Display or Save a list of the animals in the storehouse\n" +
                "2 - List of the tools in the storehouse\n" +
                "3 - List of the provisions in the storehouse\n" +
                "4 - List of the authors of this game\n" +
                "5 - Quit\n",
        
            5) ;     
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
        case 1: //view list of animals in storehouse 
          viewOrSaveAnimals();
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

// Lesson 12 - Individual Assignment                AUTHOR: Patricia Struk 
// The viewOrSaveAnimals() method
// Purpose: Allows the user to choose whether they want to display a list of 
//   animals or save a list of animals to the disk.
// Parameters: none
// Returns: none
//============================================================================
    private void viewOrSaveAnimals() {
        
        int selection;
        boolean valid = false;
        
        // display a list of options until the user makes a valid selection
        do {
            System.out.println("\nEnter 1 - To display a list of animals.");
            System.out.println("Enter 2 - To save a list of animals to the disk.");
            System.out.println("Enter 3 - If you want to exit and return to the "
                                +"List Menu.");
            System.out.print("\nPlease make your selection by entering a "
                                + "number:");
            
            // get the user's selection, determine if it's valid, if it's not,
            // then display an error message.  
            selection = keyboard.nextInt();
            
            if (selection > 0 && selection <4) {
                valid = true;
            }
            else {
                System.out.println("\nIncorrect selection. Selection must be 1,2, "
                                    + "or 3. Try again.");
            }
        } while (!valid);
        
        // When the user makes a valid selection, call the applicable method.
        switch(selection){
            case 1: // view a list of animals in the storehouse 
                viewAnimals();
                break;
            case 2: // save a list of animals to the disk
                saveAnimalsList();
                break;
            case 3: // exit and return to the List Menu
                break;
         }
    
    }

// The viewAnimals method
// Purpose: To display a list of animals in the storehouse
// Parameters: none
// Returns: none
//============================================================================
    private void viewAnimals() {
        Game theGame = CityOfAaron.getTheGame();
        ArrayList<ListItem> animals = theGame.getAnimals();
        
        System.out.println("\nThe following animals are found in the storehouse:");
        
        for(ListItem n: animals){
            System.out.printf("%n%-21s%5d", n.getName() + ":"
                                          , n.getNumber());
        }
        System.out.println();
    }
    
    
// Lesson 12 - Individual Assignment                AUTHOR: Patricia Struk    
// The saveAnimalsList() method
// Purpose: To print a report to disk of the animals in the storehouse
// Parameters: none
// Returns: none
//============================================================================
    private void saveAnimalsList() {
        
        // declare a string to hold the file name
        String fileName;
        
        // declare a reference to a PrintWriter object
        PrintWriter output = null;
        
        // prompt the user for a file name, get and save the user’s input
        System.out.println("\nTo save the animal list, please enter a file name.");
        keyboard.nextLine();
        fileName = keyboard.nextLine();
        
        try {
            // create a printwriter object
            output = new PrintWriter(fileName);  
            
            // get a reference to the ArrayList you want to output
            Game theGame = CityOfAaron.getTheGame();
            ArrayList<ListItem> animalList = theGame.getAnimals();
            
            // output a heading for the report
            output.println("\n***Animals in the Storehouse***");
            output.println("\nAnimal Name          Quantity");
            output.print("-----------          --------");
            
            // use a for loop to get the data from the ArrayList and output it
            for(ListItem n: animalList){
            output.printf("%n%-21s%5d", n.getName()
                                      , n.getNumber());
            }
        }
        catch(Exception e) {
    
            // output error message
            System.out.println("\nThere was an error saving your list.");
            return;
        }
        finally {
            System.out.println("\nYour list has been saved.");
            if(output !=null){
                output.close();
            }
        }    
   
}//end of method 
  

//Lesson 10 - Individual Assignment             Author: Alejandra Canales

// The viewTools method
//Purpose: displays tools in storehouse
//Parameters: none
//Returns: none
//=============================================================================
  
 private void viewTools() {
        Game theGame = CityOfAaron.getTheGame();
        ArrayList<ListItem> tools = theGame.getTools();
        
        System.out.println("\nThis is the list of tools in your storehouse");
    
        for(ListItem n: tools){
            System.out.println(n.getName() + ": " + n.getNumber());
        }
    }  
 
//Lesson 10 - Individual Assignment             Author: Yamilka Cuellar   
//The viewProvisions method
//Purpose: displays provisions in storehouse
//Parameters: none
//Returns: none
//============================================================================
private void viewProvisions() {
        Game theGame = CityOfAaron.getTheGame();
        ArrayList<ListItem> provisions = theGame.getProvisions();
 
        System.out.println("\nThis is the list of provisions in your storehouse");
        
        provisions.forEach((n) -> {
            System.out.println(n.getName() + ": " + n.getNumber());
    });
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
