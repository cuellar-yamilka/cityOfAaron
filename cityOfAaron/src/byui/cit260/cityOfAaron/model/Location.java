/*
 * This is the Location class. 
 * CIT-260
 * Spring 2018
 * Team members: Patricia Struk, Alejandra Canales, Yamilka Cuellar
 * The author of this class is Alejandra Canales
 */
package byui.cit260.cityOfAaron.model;

import java.io.Serializable;

/**
 *
 * @author aleja
 */
public class Location implements Serializable {
    private String description;
    private String symbol;

    public Location() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    
    
}
