/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.jaszczur.coffemaker.ejb;

import javax.ejb.Stateless;
import pl.jaszczur.coffemaker.domain.Coffee;

/**
 *
 * @author jaszczur
 */
@Stateless
public class CoffeeMakerFacade implements CoffeeMakerFacadeLocal {

    @Override
    public void makeCoffee(Coffee c) {
    }

}
