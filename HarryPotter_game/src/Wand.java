public class Wand {
    private String core;
    private double length;

    Wand(String core, double length) {
        this.core = core;
        this.length = length;
    }

    public String getCore() {
        return core;
    }
    public double getLength() {
        return length;
    }

    public double getPowerModifier(){
        if(core=="Dragon Heartstring")
            return 1.5;
        else if(core=="Phoenix Feather")
            return 1.3;
        else if(core=="Unicorn Hair")
            return 1.1;
        return 1.0;
    }

    public String toString() {
        return "Core: \n" + core+ " Length: \n" + length + " Power: \n" + getPowerModifier();
    }
}
