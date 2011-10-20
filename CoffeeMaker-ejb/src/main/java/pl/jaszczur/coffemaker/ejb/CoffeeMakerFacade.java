/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.jaszczur.coffemaker.ejb;

import javax.ejb.Stateless;
import pl.jaszczur.coffemaker.domain.Coffee;
import pl.jaszczur.coffemaker.domain.CoffeeMaker;

/**
 *
 * @author jaszczur
 */
@Stateless
public class CoffeeMakerFacade implements CoffeeMakerFacadeLocal {
    private CoffeeMaker coffeeMaker = new CoffeeMaker();

    @Override
    public void makeCoffee(Coffee c) {
        System.err.println("Making a coffee");
        coffeeMaker.makeACoffee(c);
    }

}
