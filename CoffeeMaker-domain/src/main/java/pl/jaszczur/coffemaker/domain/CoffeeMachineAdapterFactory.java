/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.jaszczur.coffemaker.domain;

import javax.naming.Context;
import javax.naming.InitialContext;

/**
 *
 * @author jaszczur
 */
public class CoffeeMachineAdapterFactory {

    public CoffeeMachineAdapter getAdapter() {
        // here we get a property and make some kind of lookup
        // (or use spring dependency injection)
        // but to simplify lets make some hardcode

        try {
            Context ctx = new InitialContext();
            CoffeeMachineAdapter delegate = (CoffeeMachineAdapter) ctx.lookup("java:global/pl.jaszczur.coffeemaker_CoffeeMaker-ear_ear_1.0-SNAPSHOT/CoffeeMaker-ejb-1.0-SNAPSHOT/BoshCoffeeMachine");
            return delegate;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
