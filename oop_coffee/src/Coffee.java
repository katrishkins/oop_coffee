import java.util.Scanner;

public class Coffee extends Drinks{

    private String coffeetype;
    private String milktype;
    private boolean iced;
    private double totalprice;

    public Coffee (String size, int sugartbs, double price, String coffeetype, String milktype, boolean iced, double totalprice) {
        this.coffeetype = coffeetype;
        this.milktype = milktype;
        this.iced = iced;
    }

    public Coffee takeinput() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter size of cup: S 250 ml, M 375 ml, L 500 ml");
            size = sc.nextLine();
        } while (!size.equalsIgnoreCase("S") && !size.equalsIgnoreCase("M") && !size.equalsIgnoreCase("L"));

        do {
            System.out.println("Enter type of coffee: Latte, Espresso, Cappuccino");
            coffeetype = sc.nextLine();
        } while (!coffeetype.equalsIgnoreCase("Latte") && !coffeetype.equalsIgnoreCase("Espresso") && !coffeetype.equalsIgnoreCase("Cappuccino"));

        do {
            System.out.println("Enter type of milk: Cow, Almond, Soy");
            milktype = sc.nextLine();
        } while (!milktype.equalsIgnoreCase("Cow") && !milktype.equalsIgnoreCase("Almond") && !milktype.equalsIgnoreCase("Soy"));

        System.out.println("Enter amount of tablespoons with sugar");
        sugartbs = sc.nextInt();

        System.out.println("Write 'true' if you want iced coffee or write 'false' if you want hot coffee");
        iced = sc.nextBoolean();

        Coffee newcoffee = new Coffee(size, sugartbs, getPrice(), coffeetype, milktype, iced, totalprice);
        return newcoffee;
    }
    Coffee () {
    }

    public double totalprice () {

        this.totalprice = 0;
        if (size.equalsIgnoreCase("S")) {
            totalprice = totalprice+ 0.25;
        } else if (size.equalsIgnoreCase("M")) {
            totalprice = totalprice+ 0.50;
        } else if (size.equalsIgnoreCase("L")) {
            totalprice = totalprice+ 0.75;
        }
        if (coffeetype.equalsIgnoreCase("Latte")) {
            totalprice = totalprice+ 2.75;
        } else if (coffeetype.equalsIgnoreCase("Espresso")) {
            totalprice = totalprice+ 2.50;
        } else if (coffeetype.equalsIgnoreCase("Cappuccino")) {
            totalprice = totalprice + 2.65;
        }
        if (milktype.equalsIgnoreCase("Almond")) {
            totalprice = totalprice + 0.50;
        } else if (milktype.equalsIgnoreCase("Soy")) {
            totalprice = totalprice + 1.00;
        }
        if (iced) {
            totalprice = totalprice + 0.50;
        }
        return totalprice;
    }

    public String coffeesout() {
        if (size.equalsIgnoreCase("S")) {
            return("\nSize of drink: " + size + "\nAmount of sugar: " + sugartbs + " tablespoons\nPrice of this cup size: 0.25"+"\nCoffee type: "+coffeetype+"\nMilk type: "+milktype+"\nCoffee is iced: "+iced+"\nPrice for drink: "+totalprice()+"\n-----------------------");
        } else if (size.equalsIgnoreCase("M")) {
            return("\nSize of drink: " + size + "\nAmount of sugar: " + sugartbs + " tablespoons\nPrice of this cup size: 0.50"+"\nCoffee type: "+coffeetype+"\nMilk type: "+milktype+"\nCoffee is iced: "+iced+"\nPrice for drink: "+totalprice()+"\n-----------------------");
        } else {
            return("\nSize of drink: " + size + "\nAmount of sugar: " + sugartbs + " tablespoons\nPrice of this cup size: 0.75"+"\nCoffee type: "+coffeetype+"\nMilk type: "+milktype+"\nCoffee is iced: "+iced+"\nPrice for drink: "+totalprice()+"\n-----------------------");
        }
    }
}
