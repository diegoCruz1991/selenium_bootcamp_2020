package ejercicios;

public class Bike {

    private int speed = 1;

    public static void main(String[] args) {
        Bike bike = new RoadBike();

        bike.speedUp(5);

        System.out.println(bike.getSpeed());

        Bike roadBike = bike;

        bike = new MountainBike();

        bike.speedUp(5);

        System.out.println(bike.getSpeed());

        System.out.println(roadBike.getSpeed());
    }

    public int getSpeed() {
        return this.speed;
    }

    public void speedUp(int speed) {
        this.speed += speed;
    }
}
