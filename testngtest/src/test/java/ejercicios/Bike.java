package ejercicios;

public class Bike {

    private int speed = 1;

    public static void main(String[] args) {
        Bike bike = new RoadBike();
        bike.speedUp(5);

        bike = new MountainBike();
        bike.speedUp(5);
    }

    public void speedUp(int speed){
        this.speed += speed;
        System.out.println(this.speed);
    }

}
