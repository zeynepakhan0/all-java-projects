public class Customer {
    private String name;
    private int age;
    private double points;
    private boolean hasValidLicense;

    public Customer(String name, int age, double points, boolean hasValidLicense) {
        this.name = name;
        this.age = age;
        this.points = points;
        this.hasValidLicense = hasValidLicense;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getPoints() {
        return points;
    }
    public boolean hasValidLicense() {
        return hasValidLicense;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPoints(double points) {
        this.points = points;
    }
    public void setHasValidLicense(boolean hasValidLicense) {
        this.hasValidLicense = hasValidLicense;
    }

}
