import java.util.Random;
import java.util.Scanner;

public class DuelArena {

    public static void main(String[] args) {
        Wand HarryWand= new Wand("Phoenix Feather", 11.0);
        Wand VoldemortWand=new Wand("Dragon Heartstring", 13.5);


        Wizard harry=new Wizard("Harry Potter", House.GRYFFINDOR, HarryWand,100);
        Wizard voldemort=new Wizard("Voldemort", House.SLYTHERIN, VoldemortWand,120);

        Spell exp=new Spell("Expelliarmus",0.9,15);
        Spell stupefy=new Spell("Stupfy",0.7,20);
        Spell avadaKedavra=new Spell("Avada Kedavra",0.5,50);

        Potion wiggenweld=new Potion("Wiggenweld Potion",50);
        Potion pepperUp=new Potion("PepperUp Potion", 15);

        harry.learnSpell(exp);
        harry.learnSpell(stupefy);
        harry.findPotion(wiggenweld);
        harry.findPotion(pepperUp);

        voldemort.learnSpell(avadaKedavra);
        voldemort.learnSpell(stupefy);
        voldemort.findPotion(wiggenweld);


        System.out.println("\nWelcome to the Dueling Club!\n Harry Potter VS Voldemort\n ");
        System.out.println("----------------------------\n\n ");
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();


        while(voldemort.isAlive()&&harry.isAlive()) {

            System.out.println("Your Turn! Choose an action: \n 1.Cast Spell\n 2.Drink Potion"+ "(" +harry.pocket.size()+" left)\n");
            System.out.println("Enter your choice: ");
            int option=scanner.nextInt();
            if(option == 2 && !harry.hasPotion()) {
                option = 1;
            }
            if(option==1) {
                int before = voldemort.getHealth();
                Spell spell= harry.castSpell(voldemort);
                int damage = before - voldemort.getHealth();

                System.out.println("Harry Potter yells:"+ spell.getName());
                if(damage == 0){
                    System.out.println("But the spell missed!");
                }else{
                System.out.println("Voldemort takes "+ damage +" damage");
                System.out.println("Voldemort HP:"+ voldemort.getHealth()+"/120");}
            }
            if(option==2) {
                Potion potion= harry.usePotion();
                System.out.println("Harry Potter drinked the potion:"+potion.getName() );
                System.out.println("Harry's health:"+harry.getHealth()+"/100");
            }
            System.out.println("\n\n---Enemy Turn---\n");
            int enemy_choice= rand.nextInt(1,3);
            if(enemy_choice == 2 && !voldemort.hasPotion()) {
                enemy_choice = 1;
            }
            if(enemy_choice==1){
                int before = harry.getHealth();
                Spell spell= voldemort.castSpell(harry);
                int damage = before - harry.getHealth();

                System.out.println("Voldemort yells:"+spell.getName());
                if(damage == 0){
                    System.out.println("But the spell missed!");
                }else{
                System.out.println("Harry takes "+ damage +" damage");
                System.out.println("Harry HP:"+ harry.getHealth()+"/100");
            }
            }
            if(enemy_choice==2){
                Potion potion= voldemort.usePotion();
                if(potion!=null){
                System.out.println("Voldemort drinked the potion:"+ potion.getName());
                System.out.println("Voldemort's health:"+voldemort.getHealth()+"/120\n\n");}
            }

        }




    }



}
