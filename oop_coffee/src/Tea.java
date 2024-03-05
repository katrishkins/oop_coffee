import java.util.Scanner;

public class Tea extends Drinks {

    private String teatype;
    private double totalprice;

    public Tea(String size, int sugartbs, double price, String teatype, double totalprice) {
        this.teatype = teatype;
    }

    public Tea takeinput() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter size of cup: S 250 ml, M 375 ml, L 500 ml");
            size = sc.nextLine();
        } while (!size.equalsIgnoreCase("S") && !size.equalsIgnoreCase("M") && !size.equalsIgnoreCase("L"));

        do {
            System.out.println("Enter type of tea: Green, Black, Fruit");
            teatype = sc.nextLine();
        } while (!teatype.equalsIgnoreCase("Green") && !teatype.equalsIgnoreCase("Black") && !teatype.equalsIgnoreCase("Fruit"));

        System.out.println("Enter amount of tablespoons with sugar");
        sugartbs = sc.nextInt();

        Tea newtea = new Tea(size, sugartbs, getPrice(), teatype, totalprice);
        return newtea;
    }

    Tea() {
    }

    public double totalprice() {

        this.totalprice = 0;
        if (size.equalsIgnoreCase("S")) {
            totalprice = totalprice + 0.25;
        } else if (size.equalsIgnoreCase("M")) {
            totalprice = totalprice + 0.50;
        } else if (size.equalsIgnoreCase("L")) {
            totalprice = totalprice + 0.75;
        }
        if (teatype.equalsIgnoreCase("Green")) {
            totalprice = totalprice + 2.75;
        } else if (teatype.equalsIgnoreCase("Black")) {
            totalprice = totalprice + 2.50;
        } else if (teatype.equalsIgnoreCase("Fruit")) {
            totalprice = totalprice + 3.00;
        }
        return totalprice;
    }

    public String teasout() {
        if (size.equalsIgnoreCase("S")) {
            return("\nSize of drink: " + size + "\nAmount of sugar: " + sugartbs + " tablespoons\nPrice of this cup size: 0.25" + "\nTea type: " + teatype + "\nPrice for drink: " + totalprice() + "\n-----------------------");
        } else if (size.equalsIgnoreCase("M")) {
            return("\nSize of drink: " + size + "\nAmount of sugar: " + sugartbs + " tablespoons\nPrice of this cup size: 0.50" + "\nTea type: " + teatype + "\nPrice for drink: " + totalprice() + "\n-----------------------");
        } else {
            return("\nSize of drink: " + size + "\nAmount of sugar: " + sugartbs + " tablespoons\nPrice of this cup size: 0.75" + "\nTea type: " + teatype + "\nPrice for drink: " + totalprice() + "\n-----------------------");
        }
    }
}
