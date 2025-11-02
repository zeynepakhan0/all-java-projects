public class Hero {
    /*
    Create a Hero Class. The class has the following private attributes:
        armor (integer)
        maxHP (integer)
        currentHP (integer)
        alive (boolean)

    The constructor take armor and maxHP attributes as parameter.
    Hero is alive and have max hp at the start.

    Write the following functions:
        heal(int amount): Heals the hero's current hp for the given amount.
                          Hero's hp cannot exceed max hp limit.
        damage(int amount): Damages the hero's current hp for the given amount after reduced by armor.
                            Check if hero's hp reaches zero after damage calculation.
        isAlive(): Returns true if hero is alive, false otherwise.
        toString(): Return all attributes of Hero as a string.
     */

    private int armor;
    private int maxHP;
    private int currentHP;
    private boolean alive;

    Hero(int armor, int maxHP) {
        this.armor = armor;
        this.maxHP = maxHP;
        this.currentHP = maxHP;
        this.alive = true;
    }

    public void heal(int amount){
        if(alive){
            currentHP += amount;
            if(currentHP > maxHP){
                currentHP = maxHP;
            }
        }
    }
    public void damage(int amount){
        int newDamage;
        if(alive){
            newDamage = armor+ amount;
            if(newDamage > 0){
                newDamage=0;
            }
            if(newDamage < 0){
                currentHP+= newDamage;
            }
            if(currentHP<=0){
                alive = false;
            }
        }
    }

    public boolean isAlive(){
        if(alive){
            return true;
        }
        return false;
    }
    public String toString(){
        return "Hero's armor: " +armor+ " Hero's maxHP: " +maxHP+
                " Hero's currentHP: " +currentHP+ " Hero's alive: " +alive;
    }
}
