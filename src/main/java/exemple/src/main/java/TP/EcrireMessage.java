package TP;

import bandeau.Bandeau;

public class EcrireMessage extends Effet{

    public void realiser(Bandeau b,int nbRep){
        for ( int i = 0; i<nbRep+1; i++){
            b.setMessage("Bonjour");
            b.sleep(1000);
        }
    }

}
