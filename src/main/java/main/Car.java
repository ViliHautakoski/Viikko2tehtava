package main;

public class Car {
    String brand;
    String model;
    int speed;
      
    public Car() {
        brand = null;
        model = null;
        speed = 0;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getSpeed(){
        return speed;
    }

    public void status(){
        System.out.print("Auto: "+brand+" ");
        System.out.print(model);
        System.out.print(", Nopeus: "+speed+" km/h"+"\n");

    }

    public void accelerate(int accelerateSpeed){
        if(accelerateSpeed<0){
            System.out.print("Nopeuden täytyy olla positiivinen luku."+"\n");
            return;
        }
        setSpeed(speed + accelerateSpeed);
    }

    public void decelerate(int decelerateSpeed){
        if(decelerateSpeed < 0){
            System.out.print("Nopeuden täytyy olla positiivinen luku."+"\n");
            return;
        }
        else if(decelerateSpeed < speed){
            setSpeed(speed - decelerateSpeed);
        }
        else{
            setSpeed(0);
        }

    }

}
 