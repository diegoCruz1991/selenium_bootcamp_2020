package ejercicios;

public class RoadBike extends Bike {

    @Override
    public void speedUp(int speed) {
        super.speedUp(speed + 2);
    }
}
