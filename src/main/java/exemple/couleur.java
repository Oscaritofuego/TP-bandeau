package TP;

import bandeau.Bandeau;

import java.awt.*;

public class Couleur extends Effet{

    public void realiser(Bandeau b, int nbRep) {
        for ( int i = 0; i<nbRep+1; i++) {
            b.setForeground(Color.GREEN);
            b.sleep(500);
            b.setForeground(Color.BLUE);
            b.sleep(500);
            b.setForeground(Color.MAGENTA);
            b.sleep(500);
            b.setForeground(Color.BLACK);
            b.sleep(500);
        }
    }
}
