import java.util.Objects;

public class Motor {
    private String model;
    private double volumes;
    private int horsepower;

    public Motor(String model, double volumes, int horsepower) {
        this.model = model;
        this.volumes = volumes;
        this.horsepower = horsepower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getVolumes() {
        return volumes;
    }

    public void setVolumes(double volumes) {
        this.volumes = volumes;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motor motor = (Motor) o;
        return Double.compare(motor.volumes, volumes) == 0 &&
                horsepower == motor.horsepower &&
                Objects.equals(model, motor.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, volumes, horsepower);
    }

    @Override
    public String toString() {
        return "Motor{" +
                "model='" + model + '\'' +
                ", volumes=" + volumes +
                ", horsepower=" + horsepower +
                '}';
    }
}
