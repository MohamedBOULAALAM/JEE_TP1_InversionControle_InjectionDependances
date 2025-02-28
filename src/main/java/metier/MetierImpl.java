package metier;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("metier")
public class MetierImpl implements IMetier {
    @Autowired
    private IDao dao ; // coupalge faible (depend d'interface)

    public MetierImpl(IDao dao) { this.dao = dao;}
    public MetierImpl() {}

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t+20;
        return res;
    }

    /**
     * Pour injecter dans la variable dao un objet
     * d'une classe qui implémente l'interface IDao
     * */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
