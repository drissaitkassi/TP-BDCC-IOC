package pres;

import dao.IDao;
import dao.IDaoImpl;
import dao.IDaopImplV2;
import metier.IMetier;
import metier.IMetierImpl;

public class Presentation {
    public static void main(String[] args) {

        System.out.println("********* Static instantiation ********");
        System.out.println();

        IMetierImpl iMetier=new IMetierImpl();
        IDao iDao=new IDaoImpl();
        iMetier.setiDao(iDao);
        System.out.println("RESULT "+ iMetier.calcul());

        System.out.println("------------------------");
        System.out.println();

        IDao iDao2= new IDaopImplV2();
        iMetier.setiDao(iDao2);
        System.out.println("RESULT "+ iMetier.calcul());

    }
}
