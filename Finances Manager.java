import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.io.File;
public class FinancesManager {
    public static void main(String[] args) throws IOException {
        String qst, name, purchase;
        double pay;

        Scanner input = new Scanner(System.in);

        File file = new File("./expenses.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        Scanner scan=new Scanner(file);
        do {
            System.out.print("Input your name: ");
            name = input.next();
            System.out.println("What did you purchase?");
            purchase = input.next();
            System.out.println("How much did you pay?");
            pay = input.nextDouble();

            fileWriter.write(name + " purchased " + purchase + " for " + pay + " US Dollars." + "\n");

            input.nextLine();
            System.out.print("Would you like to log another purchase? (y/n)");
            qst = input.nextLine();
        } while (qst.equalsIgnoreCase("y"));
        fileWriter.close();
        if (qst.equalsIgnoreCase("n")) {
            System.out.println("Get off of ZoodMall!");
            System.out.println("Would you like to read a summary of your purchases?");
            String yn=input.nextLine();
            if(yn.equalsIgnoreCase("y")){String content=scan.nextLine();
                System.out.println(content);}scan.close();
        }
    }
}