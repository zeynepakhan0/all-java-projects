import java.util.ArrayList;

public class MissingWordDemo {

    public static void main(String[] args) {

        int size = 10;
        char[][] grid = new char[size][size];

        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("apple");
        wordList.add("banana");
        wordList.add("grape");
        wordList.add("melon");

        placeWordsManually(grid, wordList);

        MissingWord puzzle = new MissingWord(grid, wordList);

        System.out.println("Puzzle before highlighting the words:");
        System.out.println(puzzle);

        puzzle.highlightWords();

        System.out.println("\nPuzzle after highlighting the words:");
        System.out.println(puzzle);

        String missingWord = puzzle.missingWord();
        System.out.println("\nThe missing word is: " + missingWord);
    }

    public static void placeWordsManually(char[][] grid, ArrayList<String> wordList) {

        grid[0][0] = 'a';
        grid[0][1] = 'p';
        grid[0][2] = 'p';
        grid[0][3] = 'l';
        grid[0][4] = 'e';


        grid[2][2] = 'b';
        grid[3][2] = 'a';
        grid[4][2] = 'n';
        grid[5][2] = 'a';
        grid[6][2] = 'n';
        grid[7][2] = 'a';

        grid[5][5] = 'g';
        grid[6][6] = 'r';
        grid[7][7] = 'a';
        grid[8][8] = 'p';
        grid[9][9] = 'e';
    }
}
