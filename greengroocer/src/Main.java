import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pear = 2.14,apple = 3.67,tomato = 1.11,banana = 0.95 ,eggplant = 5.00;
        double pearKg, appleKg, tomatoKg, bananaKg, eggplantKg;
        double pearPrice, applePrice, tomatoPrice, bananaPrice,eggplantPrice, total;
        Scanner input = new Scanner(System.in);
        System.out.println("How many pear ? ");
        pearKg = input.nextDouble();
        System.out.println(pearKg);

        System.out.println("How many apple ?  ");
        appleKg = input.nextDouble();
        System.out.println(appleKg);
        System.out.println("How many tomato ? ");
        tomatoKg = input.nextDouble();
        System.out.println(tomatoKg);
        System.out.println("How mant banana ? ");
        bananaKg = input.nextDouble();
        System.out.println(bananaKg);
        System.out.println("How many eggplant ? ");
        eggplantKg = input.nextDouble();
        System.out.println(eggplantKg);

        pearPrice = pear * pearKg;
        applePrice = apple * appleKg;
        tomatoPrice = tomato * tomatoKg;
        bananaPrice = banana * bananaKg;
        eggplantPrice = eggplant * eggplantKg;

        total = pearPrice + applePrice + tomatoPrice + bananaPrice + eggplantPrice;


        System.out.println("Pear : " + pearKg + " kg. Ücret : " + pearPrice );
        System.out.println("Apple : " + appleKg + " kg. Ücret : " + applePrice );
        System.out.println("Tomato : " + tomatoKg + " kg. Ücret : " + tomatoPrice );
        System.out.println("Banana : " + bananaKg + " kg. Ücret : " + bananaPrice );
        System.out.println("Eggplant : " + eggplantKg + " kg. Ücret : " + eggplantPrice );
        System.out.println("Total Price : " + total + " TL");


    }
}