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
public class BoshCoffeeMachine implements BoshCoffeeMachineLocal {

    @Override
    public void prepareCoffee(Coffee c) {
        // here we are back in ejb layer
        // we can send JMS message, call web service or whatever
        // bu to make it simple let's write some console logs
        
        System.err.print("Bosh coffee expres is making some delicious caffee. ");
        System.err.println("Wait a minute for a " + c.getDescription());
        System.err.println("Coffee.id=" + c.getId());
    }
    
}
