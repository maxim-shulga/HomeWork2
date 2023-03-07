package task4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2021);
        Car car3 = new Car(2020, 150);
        Car car4 = new Car(2018, 130, 1200);
        Car car5 = new Car(2017, 120, 900, "black");

        car1.showMe();
        car2.showMe();
        car3.showMe();
        car4.showMe();
        car5.showMe();
    }
}
