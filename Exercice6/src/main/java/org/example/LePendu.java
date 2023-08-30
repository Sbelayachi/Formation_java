package org.example.exo.exo6;

import org.example.MotAleatoire;

import java.util.Random;

public class LePendu {

    private String motAtrouver;
    private String motAtrouver;

    private String masque;

    private String [] motAtrouver;

    public LePendu(Mo mots) {
        this.mot = motAleat.genererMot();
    }

    String[] mots = {"maison", "ami", "ordinateur", "poisson", "voiture"};

    public static String genererMot() {
        return mots[new Random().nextInt(0, mots.length)];




    public String genererMot() {
        return motAtrouver[new Random().nextInt(0, motAtrouver.length)];
    }

    public void genererMasque() {
        masque = "";
        for (int i = 0; i < mot.length() ; i++) {
            masque += "*";
        }
    }

    public boolean testChar(char lettre) {
        for (int i = 0; i < mot.length() ; i++) {
            if (mot.charAt(i) == lettre) {
                return true;
            }
        }
        return false;
    }

    public boolean testVictoire() {
        return mot.equals(masque);
    }

    public String getMot() {
        return mot;
    }

    public String getMasque() {
        return masque;
    }

    public void setMasque(String masque) {
        this.masque = masque;
    }
}