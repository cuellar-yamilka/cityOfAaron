/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityOfAaron.model;

import java.io.Serializable;

/**
 *
 * @author Yamilka 
 * Patricia
 * Alejandra 
 */
public enum TeamMember {
    
    PATRICIA("Patricia Struk","STUDENT"),
    YAMILKA("Yamilka Cuellar","STUDENT"),
    ALEJANDRA("Alejandra Canales","STUDENT");
    
    private String name;
    private String title;

    TeamMember(String name, String title) {
        this.name = name;
        this.title = title;
}

public String getName() {
        return name;
}

public String getTitle() {
        return title;
    }
    
   
}
