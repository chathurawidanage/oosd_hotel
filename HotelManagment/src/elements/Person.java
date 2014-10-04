
/**
 * Class for the general element in the hotel management system
 * @author Theekshana
 */
package elements;


public class Person {
    
    
    protected int Id ;
    protected String name ="" ;
    protected String address="" ;
    protected String contact ="";
    
    
    // get set methods for the private variables

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    
    // constructor for the person class

    public Person( int Id , String name , String address , String contact ) {
        
        this.Id = Id ;
        this.name = name ;
       this.address = address ;
       this.contact = contact ;
        
        
    }
    
    
    
}
