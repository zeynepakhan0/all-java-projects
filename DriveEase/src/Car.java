public class Car {
    private String plate;
    private int kmAge;

    public Car(String plate, int kmAge) {
        this.plate = plate;
        this.kmAge = kmAge;
    }
    public String getPlate() {
        return plate;
    }
    public void setPlate(String plate) {
        this.plate = plate;
    }
    public int getKmAge() {
        return kmAge;
    }
    public void setKmAge(int kmAge) {
        this.kmAge = kmAge;
    }
}
