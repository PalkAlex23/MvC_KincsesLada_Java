package nezet;

import java.util.Scanner;

public class KonzolNezet {
    
    private static final Scanner sc = new Scanner(System.in);
    
    public void megjelenit(String uzenet) {
        System.out.println(uzenet);
    }
    
    public int bekeres() {
        megjelenit("Hol a kincs? Csak az egyik felirat igaz!");
        return sc.nextInt() - 1;
    }
}
