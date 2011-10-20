/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.jaszczur.coffemaker.ejb;

import javax.ejb.Local;
import pl.jaszczur.coffemaker.domain.Coffee;

/**
 *
 * @author jaszczur
 */
@Local
public interface CoffeeMakerFacadeLocal {

    void makeCoffee(Coffee c);
    
}
