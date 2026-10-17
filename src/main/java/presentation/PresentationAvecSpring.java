package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationAvecSpring {
    public static void main(String[] args) {
        // 4. Chargement du contexte Spring à partir du fichier config.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Récupération du bean metier (type interface IMetier)
        IMetier metier = (IMetier) context.getBean("metier");

        // 5. Exécution
        System.out.println("Résultat (Spring XML) = " + metier.calcul());
    }
}