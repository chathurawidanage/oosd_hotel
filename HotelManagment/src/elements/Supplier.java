

package elements;

/**
 * Supplier class
 * @author Theekshana
 */
public class Supplier extends Person {
    
    
    private String details="" ;
    private int noOfTransactions = 0 ;
    
    
    public int getNoOfTransactions() {
        
        return noOfTransactions ;
    }
    
    public boolean incrementTransactions() {
        
        noOfTransactions += 1 ; 
        return true ;
    }

    // get ans set methods
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    
    
    // constrctor
    public Supplier(int Id, String name, String address, String contact, String Details ) {
        
   
        super(Id, name, address, contact);
        this.details = Details ;
    }
    
    
    
}
