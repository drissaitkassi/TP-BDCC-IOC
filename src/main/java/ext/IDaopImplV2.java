package ext;


import dao.IDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao2")
public class IDaopImplV2 implements IDao {
    @Override
    public double getData() {

        System.out.println("Web service Verion");
        return 25;
    }
}
