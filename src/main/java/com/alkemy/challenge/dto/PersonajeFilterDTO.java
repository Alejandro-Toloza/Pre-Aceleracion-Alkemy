
package com.alkemy.challenge.dto;

import java.util.List;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author alejandro
 */
@Getter
@Setter
public class PersonajeFilterDTO {
    
    private String name;
    private String date;
    private Set<Long> peliculas;
    private String order;

    public PersonajeFilterDTO(String name, String date, Set<Long> peliculas, String order) {
        this.name = name;
        this.date = date;
        this.peliculas = peliculas;
        this.order = order;
    }
    
    public boolean isASC(){
        return this.order.compareToIgnoreCase("ASC") == 0;
    }
        public boolean isADESC(){
        return this.order.compareToIgnoreCase("DESC") == 0;
    }
    
}