package Lab_6;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which service would you like to use?");
        System.out.println("[1]: Basic week visualizer");
        System.out.println("[2]: Advanced week visualizer");
        System.out.println("[3]: Basic calculator");
        System.out.println("[4]: Employee repertoire");
        int i = input.nextInt();

        while (i > 4 || i < 1) {
            System.out.println("Please make sure you pick a number between 1 and 4");
            i = input.nextInt();
        }
        switch (i) {
            case 1:
                BasicWeek basicWeek = new BasicWeek();
                basicWeek.printDays();
                break;
            case 2:
                AdvancedWeek advancedWeek = new AdvancedWeek();
                advancedWeek.printDays();
                break;
            case 3:
                Calculator calculator = new Calculator();
                calculator.toString();
                break;


            case 4:

                System.out.print("Please input the employee's FirstName: ");

                String first = input.nextLine();
                System.out.print("Please input the employee's LastName: ");
                String last = input.nextLine();
                System.out.print("Please input the employee's Age: ");
                int age = input.nextInt();
                System.out.print("Please input the employee's Salary: ");
                double salary = input.nextInt();
                Employee e = new Employee(first, last, age, salary);
                System.out.println(e.toString());

                break;
            default:

                break;
        }
    }
}
