package main;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {   
        Car car = new Car();

        Scanner sc = new Scanner(System.in);

        System.out.print("Anna auton merkki: ");
        car.setBrand(sc.nextLine());
        System.out.print("Anna auton malli: ");
        car.setModel(sc.nextLine());
        car.setSpeed(0);


        boolean exit = false;
        while(!exit) {
            System.out.println("1) Näytä auton tila");
            System.out.println("2) Muokkaa auton merkkiä ja mallia");
            System.out.println("3) Kiihdytä autoa");
            System.out.println("4) Hidasta autoa");
            System.out.println("0) Lopeta ohjelma");
            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);
                switch(i) {
                    case 1: 
                        car.status();
                        break;
                    case 2:
                        System.out.print("Anna uusi auton merkki: ");
                        car.setBrand(sc.nextLine());

                        System.out.print("Anna uusi auton malli: ");
                        car.setModel(sc.nextLine());
                        break;
                    case 3:
                        System.out.print("Kuinka monta km/h haluat kiihdyttää? ");
                        int changeSpeed = Integer.parseInt(sc.nextLine());
                        car.accelerate(changeSpeed);
                        break;
                    case 4:
                        System.out.print("Kuinka monta km/h haluat hidastaa? ");
                        int decelerateSpeed = Integer.parseInt(sc.nextLine());
                        car.decelerate(decelerateSpeed);
                        break;
                    case 0:
                        exit = true;
                        break;
                    default:
                        System.out.print("Syöte oli väärä.");
                }
            }
        }
        System.out.print("Kiitos ohjelman käytöstä.");
        sc.close();
    }
}
