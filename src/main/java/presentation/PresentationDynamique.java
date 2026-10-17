package presentation;

import dao.IDao;
import metier.IMetier;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationDynamique {
    public static void main(String[] args) {
        try {
            // 3. Lecture des noms de classes depuis config.txt
            Scanner scanner = new Scanner(new File("config.txt"));
            String daoClassName = scanner.nextLine();
            String metierClassName = scanner.nextLine();
            scanner.close();

            // 4. Chargement dynamique des classes avec Class.forName et instanciation
            Class<?> cDao = Class.forName(daoClassName);
            IDao dao = (IDao) cDao.getDeclaredConstructor().newInstance();

            Class<?> cMetier = Class.forName(metierClassName);
            IMetier metier = (IMetier) cMetier.getDeclaredConstructor().newInstance();

            // 5. Injection de dépendances par réflexion (appel dynamique de setDao)
            Method setDaoMethod = cMetier.getMethod("setDao", IDao.class);
            setDaoMethod.invoke(metier, dao);

            // 6. Exécution
            System.out.println("Résultat (Instanciation Dynamique) = " + metier.calcul());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}