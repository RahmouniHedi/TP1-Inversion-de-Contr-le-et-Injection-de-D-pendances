package dao;

import org.springframework.stereotype.Repository;

@Repository
public class DaoImpl implements IDao {
    private double value;

    public DaoImpl() {
        this.value = 0.0;
    }


    @Override
    public double getValue() {
        System.out.println("Version Base de données");
        return 100.0;
    }
    }
