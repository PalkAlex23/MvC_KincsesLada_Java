package main;

import modell.JatekModell;
import nezet.CuiNezet;
import nezet.FelugroNezet;
import nezet.KonzolNezet;
import vezerlo.CuiVezerlo;



public class KincsesLada {

    public static void main(String[] args) {
        // new JatekModell();
        JatekModell modell = new JatekModell();
        
        /*
        KonzolNezet nezet = new KonzolNezet();
        FelugroNezet nezet = new FelugroNezet();
        
        new KonzolVezerlo(modell, nezet);
        new FelugroVezerlo(modell, nezet);
        */
        CuiNezet nezet;
        nezet = new KonzolNezet();
        //nezet = new FelugroNezet();
        
        new CuiVezerlo(modell, nezet);
    }
    
}
