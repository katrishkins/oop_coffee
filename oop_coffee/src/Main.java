import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello! Welcome to our cafe! What would you like to order: coffee or tea?");
        Scanner sc = new Scanner(System.in);
        String choice1 = sc.nextLine();
        double priceofallorder = 0;
        String choice2;
        ArrayList<String> drinks = new ArrayList<String>();

        if (choice1.equalsIgnoreCase("Coffee")) {
            System.out.println("How many coffee cups do you want?");
            int i = sc.nextInt();
            for ( int j = 0; j < i ; j++) {
                Coffee newcoffee = new Coffee();
                newcoffee.takeinput();
                newcoffee.coffeesout();
                priceofallorder = priceofallorder + newcoffee.totalprice();
                System.out.println("-----------------------");
                System.out.println("Your final price now is: "+priceofallorder);
                System.out.println("-----------------------");
                drinks.add(newcoffee.coffeesout());
            }

            do {
                System.out.println("Do you want to order also tea? (yes or no)");
                choice2 = sc.nextLine();
            } while (!choice2.equalsIgnoreCase("Yes") && !choice2.equalsIgnoreCase("No"));

            if (choice2.equalsIgnoreCase("Yes")) {
                System.out.println("How many tea cups do you want?");
                i = sc.nextInt();
                for (int j = 0; j < i; j++) {
                    Tea newtea = new Tea();
                    newtea.takeinput();
                    newtea.teasout();
                    priceofallorder = priceofallorder + newtea.totalprice();
                    System.out.println("-----------------------");
                    System.out.println("Your final price now is: " + priceofallorder);
                    System.out.println("-----------------------");
                    drinks.add(newtea.teasout());
                }
            } else {
                System.out.println("-----------------------");
                System.out.println("Your final price now is: "+priceofallorder);
                System.out.println("-----------------------");
            }

        } else if (choice1.equalsIgnoreCase("Tea")) {
            System.out.println("How many tea cups do you want?");
            int i = sc.nextInt();
            for (int j = 0; j < i; j++) {
                Tea newtea = new Tea();
                newtea.takeinput();
                newtea.teasout();
                priceofallorder = priceofallorder + newtea.totalprice();
                System.out.println("-----------------------");
                System.out.println("Your final price now is: " + priceofallorder);
                System.out.println("-----------------------");
                drinks.add(newtea.teasout());
            }

            do {
                System.out.println("Do you want to order also coffee? (yes or no)");
                choice2 = sc.nextLine();
            } while (!choice2.equalsIgnoreCase("Yes") && !choice2.equalsIgnoreCase("No"));

            if (choice2.equalsIgnoreCase("Yes")) {
                System.out.println("How many coffee cups do you want?");
                i = sc.nextInt();
                for ( int j = 0; j < i ; j++) {
                    Coffee newcoffee = new Coffee();
                    newcoffee.takeinput();
                    newcoffee.coffeesout();
                    priceofallorder = priceofallorder + newcoffee.totalprice();
                    System.out.println("-----------------------");
                    System.out.println("Your final price now is: "+priceofallorder);
                    System.out.println("-----------------------");
                    drinks.add(newcoffee.coffeesout());
                }
            } else {
                System.out.println("-----------------------");
                System.out.println("Your final price now is: "+priceofallorder);
                System.out.println("-----------------------");
            }
        }

        System.out.println("Your final order:");
        for (String i : drinks) {
            System.out.println(i);
        }
        System.out.println("Thank you for your purchase :)\nWaiting for seeing you later!");

        try {
            FileWriter fw = new FileWriter("finalorder");
            fw.write("Your final order:\n");
            for (String i : drinks) {
                fw.write(i);
            }
            fw.write("\nYour final price now is: "+priceofallorder);
            fw.write("\n-----------------------");
            fw.write("\nThank you for your purchase :)\nWaiting for seeing you later!");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}