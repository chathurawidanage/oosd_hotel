/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package elements;

/**
 * Customer class 
 * @author Theekshana
 */
public class Customer extends Person {
    
    
    private String detailing="";
    private boolean previosCustomer = false ;

    // Set and set methods
    public String getDetailing() {
        return detailing;
    }

    public void setDetailing(String detailing) {
        this.detailing = detailing;
    }

    public boolean isPreviosCustomer() {
        return previosCustomer;
    }

    public void setPreviosCustomer(boolean previosCustomer) {
        this.previosCustomer = previosCustomer;
    }
    
    

    
    
    // the constructor
    public Customer(int Id, String name, String address, String contact,String detailing) {
        super(Id, name, address, contact);
        this.detailing = detailing ;
    }
    
}
