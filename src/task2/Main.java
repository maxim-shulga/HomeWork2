package task2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2021);
        Car car3 = new Car(2022, "Red");

        car1.showMe();
        car2.showMe();
        car3.showMe();
    }
}
