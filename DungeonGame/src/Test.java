public class Test {

    public static void main(String[] args) {
        int[][] grid =  {{0,5,-10,3},
                        {-6,4,-8,-6},
                        {-3,3,-7, 3},
                        {-5,5,-7, 0}};
        Position exit = new Position(3,3);
        Dungeon dungeon = new Dungeon(grid,exit);
        Hero hero = new Hero(3,10);
        Game game = new Game(dungeon,hero);
        game.move(2);
        game.move(2);
        game.move(4);
        game.move(4);
        game.move(2);
        game.move(4);
    }
}
