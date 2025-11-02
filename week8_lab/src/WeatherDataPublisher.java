public interface WeatherDataPublisher {
    void addDisplay(DisplayUnit du);
    void removeDisplay(DisplayUnit du);
    void update();
    void setMeasurement(double temperature, double humidity);

}
