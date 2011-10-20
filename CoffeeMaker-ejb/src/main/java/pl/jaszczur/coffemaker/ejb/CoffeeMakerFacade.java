/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.jaszczur.coffemaker.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pl.jaszczur.coffemaker.domain.Coffee;
import pl.jaszczur.coffemaker.domain.CoffeeMaker;

/**
 *
 * @author jaszczur
 */
@Stateless
public class CoffeeMakerFacade implements CoffeeMakerFacadeLocal {
    private CoffeeMaker coffeeMaker = new CoffeeMaker();
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public void makeCoffee(Coffee c) {
        System.err.println("Making a coffee");
        em.persist(c);
        coffeeMaker.makeACoffee(c);
    }

}
