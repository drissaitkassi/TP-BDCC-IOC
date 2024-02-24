package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class pres3 {
    public static void main(String[] args) {
        System.out.println("********* SPRING WITH XML CONFIG  ********");
        System.out.println();
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        IMetier metier =context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
