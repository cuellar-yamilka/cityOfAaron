/*
* The ListItem() class file for the cityOfAaron project
*CIT-260
*Spring 2018
*Team members: Patricia Struk, Alejandra Canales, Yamilka Cuellar
 */
package byui.cit260.cityOfAaron.model;

import java.io.Serializable;

/**
 *
 * @author Yamilka Cuellar
 */
public class ListItem implements Serializable {
    
    private String name;
    private int number;
    
    public ListItem(){
    
    }


    public ListItem(String name, int number) {
        this.name = name;
        this.number = number;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    
    
    
}
