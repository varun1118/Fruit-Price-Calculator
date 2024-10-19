import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int xp=1;
        do {
            FruitsPrice fp = new FruitsPrice();
            fp.showFruitsAndPrice();
            System.out.println("Please Press 1 to find price");
            System.out.println("Please Press 2 to exit");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            if (x == 1) {
                fp.priceCalculator();
            } else if (x==2) {
                System.exit(0);
            } else {
                System.out.println("Please enter 1");
            }

        }while (true);
    }
}