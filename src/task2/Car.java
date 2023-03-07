package task2;

public class Car {
    private int year;
    private String color;
    public Car(){
        this(2022, "grey");
    }
    public Car(int year){
        this(year, "grey");
    }
    public Car(int year, String color){
        this.year = year;
        this.color = color;
    }
    public void showMe(){
        System.out.println(this.year + " " + this.color);
    }
}
