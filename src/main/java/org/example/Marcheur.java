package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Marcheur {
    private final String nom;
    private final Lieu lieuDeDépart;
    private final Lieu lieuDArrivée;
    private final Carte carte;
    public void marcher(Lieu lieuDeDépart, Lieu lieuDArrivée, Carte carte){
        List<Rue> ruesDIntersection = new ArrayList<>();
        List<Rue> prochainesRues = new ArrayList<>();
        Random ruesAléatoires = new Random();

        for(Rue rue : carte.getRues()){
            if(rue.getLieu1().equals(lieuDeDépart) || rue.getLieu2().equals(lieuDeDépart)){
                ruesDIntersection.add(rue);
            }
        }
        System.out.println(ruesDIntersection);

        ruesDIntersection.stream().map(rue -> {
            int indexRueAléatoire = ruesAléatoires.nextInt(0, ruesDIntersection.size());
            ruesDIntersection.add(ruesDIntersection.get(indexRueAléatoire));
            return ruesDIntersection;
        });
    }
}