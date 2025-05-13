package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationV3SpringXml {
    public static void main(String[] args) {
        System.out.println("La couche presentation avec spring version XML");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
