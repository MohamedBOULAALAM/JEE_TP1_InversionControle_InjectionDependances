package dao;
import org.springframework.stereotype.Component;
@Component("dao2")
public class DaoImpl2 implements IDao{
    @Override
    public double getData() {
        System.out.println("Impl web service");
        double temp = 30;
        return temp;
    }
}
