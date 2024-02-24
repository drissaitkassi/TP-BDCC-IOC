package metier;

import dao.IDao;

public class IMetierImpl implements IMetier {



    private IDao iDao;

    public void setiDao(IDao iDao) {
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
