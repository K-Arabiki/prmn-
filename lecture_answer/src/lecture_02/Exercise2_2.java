package lecture_02;

public class Exercise2_2 {
    public static void main(String[] args) {

        Car car1 = new Car();
        //Car car2 = new Car();
        GasStation gasStation = new GasStation();

        car1.run();
        //car2.run();
        gasStation.refuel(car1);
        car1.run();
        //car2.run();

    }
}
