/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.jaszczur.coffemaker.domain;

/**
 *
 * @author jaszczur
 */
public class CoffeeMaker {
    public void makeACoffee(Coffee c) {
        c.prepare();
        c.save();
    }
}
