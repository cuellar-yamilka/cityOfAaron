/* The HelpMenuView class - part of the View layer
 * The object of this class is to manage the Help Menu
 * CIT-260
 * Author: Patricia Struk 
 * Last modified June 20, 2018
 */
package byui.cit260.cityOfAaron.view;

/*
 * Lesson 9 Individual Assignment - HelpMenuView Class  Author: Patricia Struk
 */

public class HelpMenuView extends MenuView {
       
// HelpMenuView() constructor
// Purpose: Initialize the Help Menu data
// Parameters: none
// Returns: none
// ============================================================================
    public HelpMenuView(){
        super("\n" +
               "**********************************\n" +
               "        * HELP MENU *             \n" +
               "**********************************\n" +
               " 1 - What are the goals of the game?\n" +
               " 2 - Where is the city of Aaron\n" +
               " 3 - How do I view the map?\n" +
               " 4 - How do I move to another location?\n" +
               " 5 - How do I display a list of animals, provisions " + 
                        "and tools in the city storehouse?\n" +
               " 6 - Back to the Main Menu\n",
            6);
    }
    
// The doAction() method
// Purpose: performs the selected action
// Parameters: none (an int option)
// Returns: none
// ============================================================================       
    @Override public void doAction(int option){
        switch(option){
            case 1: // answers first help question
                viewGoals();
                break;
            case 2: // answers second help question 
                viewFindAaron();
                break;
            case 3: // answers third help question
                viewMapHelp();
                break;
            case 4: // answers fourth help question
                viewMoveHelp();
                break;
            case 5: // answers fifth help question
                viewListHelp();
                break;
            case 6: //return to Main Menu
                System.out.println("Hope we answered your questions. Now, you will " + 
                    "return back to the Main Menu. Have a pleasant trip!");
            
        }
    }

// The viewGoals()method
// Purpose: Shows the goals of the game help message
// Parameters: none
// Returns: none
// ===========================================================================     
    public void viewGoals(){
        System.out.println("\nThe viewGoals() option has been selected.");
}   
    
// The viewFindAaron() method
// Purpose: Shows where the City of Aaron is in a help message 
// Parameters: none
// Returns: none
// ============================================================================     
    public void viewFindAaron(){
        System.out.println("\nThe viewFindAaron() option has been selected.");
 } 
 
// The viewMapHelp() method
// Purpose: Shows the map for the City of Aaron as a help message 
// Parameters: none
// Returns: none
// ============================================================================     
    public void viewMapHelp(){
        System.out.println("\nThe viewMapHelp() option has been selected.");
 } 
 
// The viewMoveHelp() method
// Purpose: Shows how to move to another location in a help message
// Parameters: none
// Returns: none
// ============================================================================     
    public void viewMoveHelp(){
        System.out.println("\nThe viewMoveHelp() option has been selected.");
 } 

// The viewListHelp() method
// Purpose: Shows a help message on how to display lists of items in the city storehouse 
// Parameters: none
// Returns: none
// ============================================================================     
    public void viewListHelp(){
        System.out.println("\nThe viewListHelp() option has been selected.");
 }     
    
    
    
}// end of class
