package org.example;

import lombok.*;

import java.util.List;
import java.util.Set;
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Rue {
    private final String nom;
    private Lieu lieu1;
    private Lieu lieu2;

    public Rue(String nom, Lieu lieu1, Lieu lieu2) {
        this.nom = nom;
        this.lieu1 = lieu1;
        this.lieu2 = lieu2;
    }

    public Boolean contain(Lieu lieu){
        if(lieu.equals(lieu1) || lieu.equals(lieu2)){
            return true;
        }else {
            return false;
        }
    }
}
