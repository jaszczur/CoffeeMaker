/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.jaszczur.coffemaker.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Transient;

/**
 *
 * @author jaszczur
 */
@Entity
public class Coffee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Lob
    private String description;
    @Transient
    private CoffeeMachineAdapterFactory factory = new CoffeeMachineAdapterFactory();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Coffee)) {
            return false;
        }
        Coffee other = (Coffee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.jaszczur.coffemaker.domain.Coffee[ id=" + id + " ]";
    }

    public void prepare() {
        description = "An aromatic coffee";
    }
    
    public void notifyMachine() {
        factory.getAdapter().prepareCoffee(this);
    }
    
    protected void addIngredient(String ingrDesc) {
        description += " with " + ingrDesc;
    }
    
}
