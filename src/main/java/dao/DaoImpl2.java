package dao;

public class DaoImpl2 implements IDao{
    @Override
    public double getData() {
        System.out.println("Impl web service");
        double temp = 30;
        return temp;
    }
}
