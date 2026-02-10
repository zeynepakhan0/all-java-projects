public class Position {
    /*
    Create a Position Class. The class has the following private attributes:
        row (integer)
        col (integer)
    The constructor take the row and col attributes as parameters.

    Write the following functions:
        Getter functions for row and col attributes.
        up(): moves the row or col up by one.
        down(): moves the row or col down by one.
        left(): moves the row or col left by one.
        right(): moves the row or col right by one.
        toString(): Returns all attributes of Position as a string
     */

    private int row;
    private int col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }

    public int up(){
        return row--;
    }
    public int down(){
        return row++
                ;
    }
    public int left(){
        return col--;
    }
    public int right(){
        return col++;
    }

    public String toString(){
        return "(Position:" + row + ";;," + col + ")";
    }


}
