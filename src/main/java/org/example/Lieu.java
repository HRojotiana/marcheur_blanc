package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Lieu {
   private final String nom;

   public Lieu(String nom){
      this.nom = nom;
   }

   public List<Rue> ajouterDesRues(Rue rue){
      List<Rue> rues = new ArrayList<>();
      rues.add(rue);
      return rues;
   }
}
