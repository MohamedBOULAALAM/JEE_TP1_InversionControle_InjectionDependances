package presentation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import metier.IMetier;
public class PresentationSpringAnnotation {
    public static void main(String[] args) {
        System.out.println("La couche presentation avec spring annotation");
        ApplicationContext context = new AnnotationConfigApplicationContext("metier","dao");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}