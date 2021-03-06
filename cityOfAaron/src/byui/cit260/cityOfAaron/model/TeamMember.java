/*
 *The TeamMember() class file for the cityOfAaron project
 *CIT-260
 *Spring 2018
 *Team members: Patricia Struk, Alejandra Canales, Yamilka Cuellar
 */
package byui.cit260.cityOfAaron.model;

/**
 * @author Yamilka 
 * Patricia
 * Alejandra 
 */
public enum TeamMember {
    
    PATRICIA("Patricia Struk","STUDENT"),
    YAMILKA("Yamilka Cuellar","STUDENT"),
    ALEJANDRA("Alejandra Canales","STUDENT");
    
    private final String name;
    private final String title;

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
