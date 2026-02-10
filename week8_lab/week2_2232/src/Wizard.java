import java.util.ArrayList;
import java.util.Random;

public class Wizard {
    private Wand wand;
    ArrayList<Spell> spellBook;
    ArrayList<Potion> pocket;
    private int maxHealth;

    public int getHealth() {
        return health;
    }

    private int health;
    private House house;
    private String name;

    Wizard(String name, House house, Wand wand,int maxHealth) {
        this.wand = wand;
        this.health =maxHealth;
        this.maxHealth = maxHealth;
        this.house = house;
        this.name = name;
        spellBook = new ArrayList<>();
        pocket = new ArrayList<>();
    }

    public void learnSpell(Spell spell) {
        spellBook.add(spell);
    }
    public void findPotion(Potion potion) {
        pocket.add(potion);
    }
    public boolean isAlive() {
        return this.health > 0;
    }

    public void takeDamage(double damage){
        if(health-damage <= 0){
            health = 0;
        }
        else{
            health -= damage;
        }
    }
    public void usePotion(){
        Potion potion = null;
        if(pocket.get(0)!=null){
            potion= pocket.get(0);
        }
        int heal = potion.getHealAmount();
        if(health+heal>maxHealth){
            health=maxHealth;
        }
        if(health+heal<maxHealth){
            health+=heal;
        }
        pocket.remove(potion);
    }
    public Spell castSpell(Wizard target){
        double damage;
        double rand=Math.random();
        Spell spell = spellBook.get((int)rand* spellBook.size());
            if(spell.checkSuccess()){
                damage=spell.getBaseDamage()*wand.getPowerModifier();
                target.takeDamage(damage);
            }

            return spell;
    }






}
