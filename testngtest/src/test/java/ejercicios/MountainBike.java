package ejercicios;

public class MountainBike extends Bike{

    @Override
    public void speedUp(int speed) {
        super.speedUp(speed + 1);
    }
}
