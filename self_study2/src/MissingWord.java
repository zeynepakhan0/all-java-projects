import java.util.ArrayList;

public class MissingWord {

    private char[][] grid;
    private int size;
    private ArrayList<String> wordList;
    private final int[][]directions={
            {0, 1},
            {0,-1},
            {-1,0},
            {1,0},
            {1,1},
            {-1,-1},
            {1,-1},
            {-1,1}
    };
    private final String[] directionNames= {
            "LR", "RL", "BT", "TB", "TLBR", "BRTL", "TRBL","BLTR"
    };
    public MissingWord(char[][] grid,ArrayList<String> wordList) {
        this.grid = grid;
        this.size = grid.length;
        this.wordList = new ArrayList<String>();

    }
    public MissingWord(MissingWord other) {
        this.size = other.size;
        this.grid = other.grid;
        this.wordList = other.wordList;
    }
    public String toString() {
        String result = "";

        result += "Puzzle Grid (NxN):\n";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result += grid[i][j] + " ";
            }
            result += "\n";
        }

        result += "\nKelime Listesi:\n";
        for (String word : wordList) {
            result += word + "\n";
        }

        return result;
    }

    public boolean isWordInGrid(String word, int row, int col, int deltaRow, int deltaCol) {
        int wordLength = word.length();
        int endRow = row + deltaRow * (wordLength - 1);
        int endCol = col + deltaCol * (wordLength - 1);

        if (endRow < 0 || endRow >= size || endCol < 0 || endCol >= size) {
            return false;
        }

        for (int i = 0; i < wordLength; i++) {
            int newRow = row + i * deltaRow;
            int newCol = col + i * deltaCol;

            if (grid[newRow][newCol] != word.charAt(i)) {
                return false;
            }
        }

        return true;
    }
    public boolean findWord(String word) {

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {

                for (int i = 0; i < directions.length; i++) {
                    int deltaRow = directions[i][0];
                    int deltaCol = directions[i][1];

                    if (isWordInGrid(word, row, col, deltaRow, deltaCol)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public String missingWord() {

        for (int i = 0; i < wordList.size(); i++) {
            String word = wordList.get(i);

            if (!findWord(word)) {
                return word;
            }
        }
        return null;
    }
    public void highlightWords() {
        int row,col;
        for (String word : wordList) {
            for (row = 0; row < size; row++) {
                for (col = 0; col < size; col++) {
                }
                    for (int i = 0; i < directions.length; i++) {
                        int deltaRow = directions[i][0];
                        int deltaCol = directions[i][1];

                        if (isWordInGrid(word, row, col, deltaRow, deltaCol)) {
                            for (int j = 0; j < word.length(); j++) {
                                int newRow = row + j * deltaRow;
                                int newCol = col + j * deltaCol;
                                grid[newRow][newCol] = Character.toUpperCase(grid[newRow][newCol]);
                            }
                        }
                    }
                }
            }
        }







}
