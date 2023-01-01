/**
 * Employee is a subclass that inherits a members of its parent class (Person)
 */
public class Employee extends Person{

    private String employeeID;
    private String title;

    public Employee(){
        super("Bilal"); // calling a constructor from Person class with parameter name, super() always must be first in the statement
        System.out.println("This coming from Employee default constructor!");
    }

    public String getEmployeeID(){
        return employeeID;
    }
    public String getTitle(){
        return title;
    }
    public void setEmployeeID(){
        this.employeeID = employeeID;
    }
    public void setTitle(){
        this.title =title;
    }

}
