import java.util.Comparator;
import java.util.Objects;

public class Car implements Comparator<Car>, Comparable<Car> {
    private String model;
    private int year;
    private String number;
    private String color;
    private Motor motor;
    private Wheel wheel;

    public Car() {
    }

    public Car(String model, int year, String number, String color, Motor motor, Wheel wheel) {
        this.model = model;
        this.year = year;
        this.number = number;
        this.color = color;
        this.motor = motor;
        this.wheel = wheel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }


    @Override
    public int compare(Car o1, Car o2) {
        return o1.getMotor().getHorsepower() - o2.getMotor().getHorsepower();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                Objects.equals(model, car.model) &&
                Objects.equals(number, car.number) &&
                Objects.equals(color, car.color) &&
                Objects.equals(motor, car.motor) &&
                Objects.equals(wheel, car.wheel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, number, color, motor, wheel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", number='" + number + '\'' +
                ", color='" + color + '\'' +
                ", motor=" + motor +
                ", wheel=" + wheel +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return 0;
    }

//    @Override
//    public int compareTo(Car o) {
//        return this.year - o.year;
//    }
}
