package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {


        System.out.println("********* Dynamic instantiation ********");
        System.out.println();

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("./src/main/resources/config.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao=(IDao) cDao.getConstructor().newInstance();


        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.getConstructor().newInstance();
        Method  mMethod=cMetier.getDeclaredMethod("setiDao",IDao.class);
        mMethod.invoke(metier,dao);

        System.out.println(metier.calcul());

    }
}
