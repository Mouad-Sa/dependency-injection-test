package net.hafid.Pres;

import net.hafid.Dao.DaoImpl;
import net.hafid.Metier.MetierImpl;

public class PresOne {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        //Using setter and default Constructor
        //MetierImpl m = new MetierImpl();
        //m.setDao(d);

        //Using Constructor
        MetierImpl m = new MetierImpl(d);
        System.out.println("results: "+m.calcul());
    }
}
