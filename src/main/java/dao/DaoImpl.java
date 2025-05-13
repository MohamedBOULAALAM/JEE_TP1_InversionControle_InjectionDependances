package dao;
import org.springframework.stereotype.Component;
@Component("dao")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("1ier Impl :  Version base de donne ");
        double tepm = 27;
        return tepm ;
    }
}