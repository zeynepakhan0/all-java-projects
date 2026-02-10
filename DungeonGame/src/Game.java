public class Game {
    /*
    Create a Game Class. The class has the following private attributes:
        dungeon (Dungeon)
        hero (Hero)
        currentPosition (Position)
    The constructor take dungeon and hero attributes as parameter.
    Current position always start in the top left corner.

    Write the following function:

    move(int direction):Moves the current position according to the given direction.
                        1 = move up, 2 = move down, 3 = move left, and 4 = move right.
                        After moving to a new position apply the following rules:
                            1.Check if the new position is exit, if it is escape from the dungeon.
                            2.Check the grid value of the new position.
                            3.If the grid value is positive heal the hero by the grid value amount.
                            4.If the grid value is negative damage the hero by the grid value amount.
                            5.Check if hero died, if hero died write it to the screen.
                        Write the hero and current position to the screen.
     */
    private Dungeon dungeon;
    private Hero hero;
    private Position currentPosition;

    Game(Dungeon dungeon, Hero hero) {
        this.dungeon = dungeon;
        this.hero = hero;
        this.currentPosition= new Position(0,0);
    }

    public void move(int direction){

       if(direction == 1){
           currentPosition.up();
       }
       if(direction == 2){
            currentPosition.down();
       }
       if(direction == 3){
           currentPosition.left();
       }
       if(direction == 4){
           currentPosition.right();
       }

        if(dungeon.isExit(currentPosition)){
            System.out.println("You escaped");
        }
        if(dungeon.getGridValue(currentPosition)>0){
            hero.heal(dungeon.getGridValue(currentPosition));
        }
        if(dungeon.getGridValue(currentPosition)<0){
            hero.damage(dungeon.getGridValue(currentPosition));
        }
       if(!hero.isAlive()){
           System.out.println("You died");
       }

       System.out.println("Hero is:"+hero+ " Current position is: "+currentPosition);

        }






    }


