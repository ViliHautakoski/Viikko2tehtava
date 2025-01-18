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
            System.out.println("1) Näytä auton tila, 2) Muokkaa auton merkkiä ja mallia, 3) Kiihdytä autoa, 4) Hidasta autoa, 0) Lopeta ohjelma");
            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);
                switch(i) {
                    case 1: 
                        car.printSpecs();
                        break;
                    case 2:
                        System.out.println("Anna uusi auton merkki: ");
                        car.setBrand(sc.nextLine());

                        System.out.println("Anna uusi auton malli: ");
                        car.setModel(sc.nextLine());
                        break;
                    case 3:
                        System.out.println("Kuinka monta km/h haluat kiihdyttää?");
                        int changeSpeed = Integer.parseInt(sc.nextLine());
                        car.accelerate(changeSpeed);
                        break;
                    case 4:
                        if(car.getSpeed()==0){
                            System.out.println("Nopeus on 0 km/h, Autoa ei voi hidastaa.");
                        }
                        else{
                        System.out.println("Kuinka monta km/h haluat hidastaa?");
                        int decelerateSpeed = Integer.parseInt(sc.nextLine());
                        car.decelerate(decelerateSpeed);
                        }
                        break;
                    case 0:
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä.");
                }
            }
        }
        sc.close();
    }
}
