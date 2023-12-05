package TP;

import bandeau.Bandeau;

import java.awt.*;

public class Zoomer extends Effet{

    public void realiser(Bandeau b, int nbRep){
        for ( int i = 0; i<nbRep+1; i++){
            for (int j = 5; j < 60; j+= 5) {
                b.setFont(new Font("Dialog", Font.BOLD, 5 + j));
                b.sleep(100);
            }
        }
    }
}
