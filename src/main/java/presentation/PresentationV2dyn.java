package presentation;
import dao.IDao;
import metier.IMetier;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationV2dyn {
    public static void main(String[] args) {
        System.out.println("Faire l'injection des dépendances par instanciation dynamique");
        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            //Instance new DaoImp()
            String daoClassName = scanner.nextLine();  // donner le nom de la classe
            Class cDao = Class.forName(daoClassName);  // chercher la classe s'il existe et le récupérer
            IDao dao = (IDao) cDao.getConstructor().newInstance();  // créer un objet

            //Instance new MetieImp
            String metierClassName = scanner.nextLine();
            Class cMetierClass = Class.forName(metierClassName);
            IMetier metier = (IMetier) cMetierClass.getConstructor().newInstance(); //MetierImpl metier = new MetierImpl();
            // IMetier metier = (IMetier) cMetierClass.getConstructor(IDao.class).newInstance(dao); //MetierImpl metier = new MetierImpl(d);

            //metier.setDao(d);
            Method setDaoMeth = cMetierClass.getMethod("setDao", IDao.class);
            setDaoMeth.invoke(metier, dao);

            System.out.println(metier.calcul());
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
