import java.util.Random;

public class Spell {
    private String name;
    private double accuracy;
    private int baseDamage;

    Spell(String name, double accuracy, int baseDamage) {
        this.name = name;
        this.accuracy = accuracy;
        this.baseDamage = baseDamage;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public String getName() {
        return name;
    }

    public boolean checkSuccess(){
        double r = Math.random();
        if(r<=accuracy){
            return true;
        }
        return false;
    }


    public String toString() {
        return "Name: " + name + " Accuracy: " + accuracy + " BaseDamage: " + baseDamage;
    }

}
