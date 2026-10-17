package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class PresentationStatique {
    public static void main(String[] args) {
        // 6. Instanciation statique (avec l'opérateur new)
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();

        // 7. Injection de dépendances via le setter
        metier.setDao(dao);

        // 8. Exécution et affichage du résultat
        System.out.println("Résultat (Instanciation Statique) = " + metier.calcul());
    }
}