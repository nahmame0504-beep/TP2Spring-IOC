package com.example;

import dao.DaoImpl;
import dao.DaoImpl2;
import metier.IMetier;
import metier.MetierImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import presentation.Presentation2;

import static org.junit.Assert.assertEquals;

/**
 * Tests unitaires pour l'application Spring IoC.
 */
public class AppTest {

    @Test
    public void testCalculAvecDaoImpl() {
        MetierImpl metier = new MetierImpl();
        metier.setDao(new DaoImpl());
        double resultat = metier.calcul();
        System.out.println("Test unitaire avec DaoImpl : Résultat = " + resultat);
        assertEquals(200.0, resultat, 0.001);
    }

    @Test
    public void testCalculAvecDaoImpl2() {
        MetierImpl metier = new MetierImpl();
        metier.setDao(new DaoImpl2());
        double resultat = metier.calcul();
        System.out.println("Test unitaire avec DaoImpl2 : Résultat = " + resultat);
        assertEquals(300.0, resultat, 0.001);
    }

    @Test
    public void testSpringContextPresentation2() {
        System.out.println("Exécution via conteneur Spring IoC :");
        ApplicationContext context = new AnnotationConfigApplicationContext(Presentation2.class);
        IMetier metier = context.getBean(IMetier.class);
        double resultat = metier.calcul();
        System.out.println("Résultat = " + resultat);
        assertEquals(300.0, resultat, 0.001);
    }
}
