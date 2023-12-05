package TP;

import bandeau.Bandeau;

import java.util.Scanner;

public class Clignoter extends Effet{


    public void realiser(Bandeau b, int nbRep){
        for ( int i = 0; i<nbRep+1; i++) {
            b.setMessage("Au revoir");
            b.sleep(250);
            b.setMessage(" ");
            b.sleep(250);
         }
    }

}
