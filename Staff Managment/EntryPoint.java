import java.util.*;

public class EntryPoint {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Please input the employee's FirstName:");
        String first = input.nextLine();
        System.out.print("Please input the employee's LastName:");
        String last = input.nextLine();
        System.out.print("Please input the employee's Age:");
        int age = input.nextInt();
        System.out.print("Please input the employee's Salary:");
        double salary = input.nextInt();
        Employee e=new Employee (first,last,age,salary);
        System.out.println(e.toString());

    }
}

