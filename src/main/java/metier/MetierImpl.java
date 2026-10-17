package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier {
    // Coupling with interface IDao, not the concrete implementation DaoImpl
    private IDao dao;

    @Override
    public double calcul() {
        double d = dao.getValue();
        double resultat = d * 2; // Example business logic calculation
        return resultat;
    }

    // Setter used for Dependency Injection
    @Autowired
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calculate() {
        return 0;
    }
}
