public class Dungeon {
    /*
    Create a Dungeon Class. The class has the following private attributes:
        grid (2D integer array)
        exit (Position)
    The constructor take the grid and exit attributes as a parameters.

    Write the following functions:
        getGridValue(Position pos): Returns the value of the grid in the given position.
        isExit(Position pos): Returns true if the given position is exit, false otherwise.
     */
    private int[][] grid;
    private Position exit;

    Dungeon(int[][] grid, Position exit) {
        this.grid = grid;
        this.exit = exit;
    }

    public int getGridValue(Position pos) {

     return grid[pos.getRow()][pos.getCol()];
    }

    public boolean isExit(Position pos) {
        if(pos.getRow() == exit.getRow() && pos.getCol() == exit.getCol())
            return true;
        return false;
    }

}
