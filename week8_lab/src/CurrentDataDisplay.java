public class CurrentDataDisplay implements DisplayUnit{

    public void refresh(double temperature, double humidity){
        System.out.println("Temperature: " + temperature+ "Humidity: " + humidity);
    }
}
