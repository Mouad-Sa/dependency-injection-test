package net.hafid.Metier;

import net.hafid.Dao.IDao;

public class MetierImpl implements Imetier{
    private IDao dao;// this is supposed to be how we do loose coupling

    @Override
    public double calcul() {
        double T = dao.res();
        double res = T*40*Math.random();
        return res;
    }
        //to inject the variable dao with a class object that implements IDao interface
        // if you use the constructor the change is done at the initialisation
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    public MetierImpl() {

        //To inject the variable dao with a class object that implements the interface IDao
        // if you use seter the change is done after the initialisation
    }
    public void setDao(IDao dao) {
        this.dao = dao;
    }

}
