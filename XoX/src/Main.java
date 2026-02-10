public class Main {
    public static void main(String[] args) {

        XoX game = new XoX("Tolga", "Bugra");
        System.out.println("Game Started");
        game.printBoard();
        game.mark(0, 0);
        game.mark(0, 1);
        game.mark(2, 0);
        game.printBoard();
        game.mark(1, 1);
        game.printBoard();
        game.mark(1, 0);
        game.printBoard();

    }
}
