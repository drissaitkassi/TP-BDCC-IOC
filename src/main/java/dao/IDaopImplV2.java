package dao;

public class IDaopImplV2 implements IDao{
    @Override
    public double getData() {

        System.out.println("Web service Verion");
        return 25;
    }
}
