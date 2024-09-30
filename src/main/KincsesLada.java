package main;

import modell.JatekModell;
import nezet.FelugroNezet;
import vezerlo.FelugroVezerlo;
/*
import nezet.KonzolNezet;
import vezerlo.KonzolVezerlo;
*/

public class KincsesLada {

    public static void main(String[] args) {
        // new JatekModell();
        
        
        JatekModell modell = new JatekModell();
        // KonzolNezet nezet = new KonzolNezet();
        FelugroNezet nezet = new FelugroNezet();
        
        // new KonzolVezerlo(modell, nezet);
        new FelugroVezerlo(modell, nezet);
    }
    
}
