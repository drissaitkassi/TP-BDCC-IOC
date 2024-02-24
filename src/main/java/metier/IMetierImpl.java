package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service("metier")
public class IMetierImpl implements IMetier {


    @Autowired

    private IDao iDao;

    public void setiDao( @Qualifier("dao") IDao iDao) {
        this.iDao = iDao;
    }

    public IDao getiDao() {
        return iDao;
    }
    @Override
    public double calcul() {
        double data=iDao.getData();
        return data*2;
    }


}
