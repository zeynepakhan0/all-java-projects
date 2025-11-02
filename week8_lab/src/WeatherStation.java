import java.util.ArrayList;

public class WeatherStation implements WeatherDataPublisher{

    ArrayList<DisplayUnit> displays;
    double temperature;
    double humidity;

    public WeatherStation() {
        displays=new ArrayList<>();
    }

    public double getTemperature() {
        return temperature;
    }
    public double getHumidity() {
        return humidity;
    }
    public ArrayList<DisplayUnit> getDisplays() {
        return new ArrayList<>(displays);
    }

    @Override
    public void addDisplay(DisplayUnit du) {
        displays.add(du);
    }

    @Override
    public void removeDisplay(DisplayUnit du) {
        displays.remove(du);
    }

    @Override
    public void update() {

        for(DisplayUnit du:displays){
            du.refresh(temperature,humidity);
        }
    }

    @Override
    public void setMeasurement(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        update();
    }
}
