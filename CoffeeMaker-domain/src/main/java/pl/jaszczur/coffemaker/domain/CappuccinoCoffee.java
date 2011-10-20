/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.jaszczur.coffemaker.domain;

/**
 *
 * @author jaszczur
 */
public class CappuccinoCoffee extends Coffee {
    
    @Override
    public void prepare() {
        super.prepare();
        addIngredient("a steamed milk foam");
    }
}
