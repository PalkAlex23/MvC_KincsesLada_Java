package nezet;

import java.util.Scanner;

public class KonzolNezet extends CuiNezet{
    
    private static final Scanner sc = new Scanner(System.in);
    
    @Override
    public void megjelenit(String uzenet) {
        System.out.println(uzenet);
    }
    
    @Override
    public int bekeres() {
        megjelenit("Hol a kincs? Csak az egyik felirat igaz!");
        return sc.nextInt() - 1;
    }
}
