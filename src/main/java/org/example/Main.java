package org.example;

import java.util.HashSet;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Lieu hei = new Lieu("hei");
        Lieu pullman = new Lieu("pullman");
        Lieu balançoire = new Lieu("balançoire");
        Lieu esti = new Lieu("esti");
        Lieu sekolintsika = new Lieu("sekolintsika");
        Rue andriantsitoharana = new Rue("Andriantsitoharana", hei, pullman);
        Rue ranaivo = new Rue("Ranaivo", pullman, balançoire);
        Rue versEsti = new Rue("", balançoire, esti);
        Rue versSekolintsika = new Rue("", sekolintsika, hei);
        Set rues = new HashSet();
        rues.add(andriantsitoharana);
        rues.add(ranaivo);
        rues.add(versEsti);
        rues.add(versSekolintsika);
        Carte carte = new Carte(rues);
        Marcheur marcheurMarc = new Marcheur("Marc", hei, balançoire, carte);
        marcheurMarc.marcher(hei, esti, carte);
    }
}