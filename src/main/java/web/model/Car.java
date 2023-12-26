package web.model;


public class Car {
     String model;
     int series;
     String color;
     String transmission;

    public Car(String model, int series, String color, String transmission) {
        this.model = model;
        this.series = series;
        this.color = color;
        this.transmission = transmission;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public String getColor() {
        return color;
    }

    public String getTransmission() {
        return transmission;
    }

}
