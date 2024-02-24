package dao;

public class IDaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("database version");
        return 22;
    }
}
