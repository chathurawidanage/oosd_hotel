
package elements;

import java.util.Date;

/**
 * Derived class from the Person class 
 * @author Theekshana
 */
public class Employee extends Person {
    
    
    private Date joinedData =null; 
    private Double salary =0.0;
    private boolean isWorking = false ; // working or temp or perm signed out
     private String post ="" ;    // the post of the employer , eg: manager 
     
     
     // state changing methods
     
     
     public boolean upDateSalary(Double salary) {
         
         this.salary = salary ;
         return true ;
                
     }
    
     public boolean changeState(boolean state) {
         
         this.isWorking = state ;
         return true ;
     }
     
     public boolean changePost(String post) {
         
         this.post = post ;
         return true ;
         
         
         
     }
     
    //get and set metthods
    public Date getJoinedData() {
        return joinedData;
    }

    public void setJoinedData(Date joinedData) {
        this.joinedData = joinedData;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public boolean isIsWorking() {
        return isWorking;
    }

    public void setIsWorking(boolean isWorking) {
        this.isWorking = isWorking;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
     
     
     
     
    //constructors
    
    public Employee(int Id, String name, String address, String contact , Double salary , String psot ) {
        super(Id, name, address, contact);
        this.salary = salary ;
        this.post = post ;
    }
    
    
    
    
    
    
}
