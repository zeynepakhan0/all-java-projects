public class Main {
    public static void main(String[] args) {

    WeatherStation station = new WeatherStation();
   DisplayUnit currentDataDisplay= new CurrentDataDisplay();
   DisplayUnit temperaturesStatDisplay= new TemperatureStatDisplay();

   station.addDisplay(currentDataDisplay);
   station.addDisplay(temperaturesStatDisplay);

        station.setMeasurement(24.0, 50.0);

        station.removeDisplay(currentDataDisplay);

        station.setMeasurement(22.0, 40.0);
        station.setMeasurement(16.3,25);
        
        System.out.println("Latest temperature: " + station.getTemperature());




    }
}
