/* The ViewInterface in the View Layer
 * Contains the method signatures that other classes implement when accessing the Interface
 * CIT-260
 * Authors: Patricia Struk, Yamilka Cuellar, Alejandra Canales
 * Last modified June 20, 2018
 */
package byui.cit260.cityOfAaron.view;


public interface ViewInterface {
    public void displayMenu();
    public int getMenuOption();
    public void doAction(int option);
    
}
