package metier;
import dao.DaoImpl;
import dao.DaoImpl2;
import dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service("metier")
public class MetierImpl implements IMetier {
    private IDao dao ; // coupalge faible (depend d'interface)


    public MetierImpl(@Qualifier("dao2") IDao dao) { this.dao = dao;}
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
