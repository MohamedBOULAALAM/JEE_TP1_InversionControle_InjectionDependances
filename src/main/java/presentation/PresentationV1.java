package presentation;   
import dao.DaoImpl;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        // Injection des dépendances par instantiation statique (new)
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(d); // injection via le setter
        System.out.println("Résultat : " + metier.calcul());
    }
/*
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        // Injection des dépendances via le constructeur avec paramèters
        //   -> cette méthode réduit nombre d'appel des méthodes
        MetierImpl metier = new MetierImpl(d);
        System.out.println("Résultat : " + metier.calcul());
    }
*/
}