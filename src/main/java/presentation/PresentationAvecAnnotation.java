package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationAvecAnnotation {
    public static void main(String[] args) {
        // 3. Scan des packages "dao" et "metier" pour détecter @Repository, @Service et @Autowired
        ApplicationContext context = new AnnotationConfigApplicationContext("dao", "metier");

        // Récupération du bean IMetier
        IMetier metier = context.getBean(IMetier.class);

        // 4. Exécution
        System.out.println("Résultat (Spring Annotations) = " + metier.calcul());
    }
}