package TP;

import bandeau.Bandeau;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Bandeau b = new Bandeau();
        Scenario scenario = new Scenario(b);
        Font font = b.getFont();
        Color back = b.getBackground();
        Color fore = b.getForeground();

        scenario.ajouter(new EcrireMessage(),1);
        scenario.ajouter(new Tourner(),2);
        scenario.ajouter(new Zoomer(),2);
        scenario.ajouter(new Couleur(),2);
        scenario.ajouter(new Clignoter(),2);

        scenario.executer(1);

        b.close();

    }

}
