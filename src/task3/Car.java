package task3;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car(){
        this.year = 2022;
        this.speed = 180;
        this.weight = 1800;
        this.color = "white";
    }
    public Car(int year){
        this.year = year;
        this.speed = 180;
        this.weight = 1800;
        this.color = "white";
    }
    public Car(int year, double speed){
        this.year = year;
        this.speed = speed;
        this.weight = 1800;
        this.color = "white";
    }
    public Car(int year, double speed, int weight){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = "white";
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
