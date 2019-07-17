import java.util.Objects;

public class Wheel {
    private String manufacturer;
    private double diametr;

    public Wheel(String manufacturer, double diametr) {
        this.manufacturer = manufacturer;
        this.diametr = diametr;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return Double.compare(wheel.diametr, diametr) == 0 &&
                Objects.equals(manufacturer, wheel.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, diametr);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "manufacturer='" + manufacturer + '\'' +
                ", diametr=" + diametr +
                '}';
    }
}
