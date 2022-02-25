public class Employee {
    private String FirstName;
    private String LastName;
    private int Age;
    private double Salary;

    public Employee( String fn, String ln, int a,double s){
        FirstName=fn;
        LastName=ln;
        Age=a;
        Salary=s;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public void setAge(int age) {
        Age = age;
    }
    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getFirstName(){
        return FirstName;
    }
    public String getLastName(){
        return LastName;
    }
    public int getAge(){
        return Age;
    }
    public double getSalary(){
        return Salary;
    }

    public String toString(){
        String s=("Employee Information: "+FirstName+" "+LastName+", "+Age+", "+Salary);
        return s;
    }
}