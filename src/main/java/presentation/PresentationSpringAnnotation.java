package presentation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import metier.IMetier;
public class PresentationSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("q.jv.job","q.jv.dao");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}