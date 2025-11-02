import java.util.ArrayList;

public class TemperatureStatDisplay implements DisplayUnit {

    double min;
    double max;
    double total;
    int count;

    public TemperatureStatDisplay() {
        max=Double.NEGATIVE_INFINITY;
        min=Double.POSITIVE_INFINITY;
        total=0;
        count=0;
    }

    public void refresh(double temperature, double humidity) {
        total+=temperature;
        count++;

        if(max<temperature) {
            max=temperature;
        }
        if(min>temperature) {
            min=temperature;
        }

        System.out.println("Max Temperature: " + max+ "Min temperature: " + min+ "Avg temperature: " + total/count);
    }

}
