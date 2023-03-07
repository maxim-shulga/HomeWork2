package task4;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car(){
        this(2022, 180, 1800, "white");
    }
    public Car(int year){
        this(year, 180, 1800, "white");
    }
    public Car(int year, double speed){
        this(year, speed, 1800, "white");
    }
    public Car(int year, double speed, int weight){
        this(year, speed, weight, "white");

    }

    public Car(int year, double speed, int weight, String color){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public void showMe(){
        System.out.println(year + " " + speed + " " + weight + " " + color);
    }
}
