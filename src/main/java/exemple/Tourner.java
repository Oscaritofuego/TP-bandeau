package TP;

import bandeau.Bandeau;


public class Tourner extends Effet{

public void realiser(Bandeau b, int nbRep){
    for ( int i = 0; i<nbRep+1; i++){
        b.setRotation(Math.PI / 2.0f);
        b.sleep(1000);
        b.setRotation(Math.PI);
        b.sleep(1000);
        b.setRotation(Math.PI * 3/2.0f);
        b.sleep(1000);
        b.setRotation(Math.PI * 2.0f);
        b.sleep(1000);
        b.setRotation(0.0f);
    }
}

}
