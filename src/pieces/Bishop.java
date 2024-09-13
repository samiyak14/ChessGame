package pieces;

public class Bishop extends Piece {
    public Bishop(String color){
        super(color);
    }

    public String toString() {
        return getColor().charAt(0) + "B "; // Example: "wQ" for White Queen
    }

    public boolean isValidMove(int startX, int startY, int endX, int endY){
        int xDiff=Math.abs(startX - endX);
        int yDiff= Math.abs(startY - endY);
        return (xDiff==yDiff); //to move diagonally, the piece moves in equal x and y coordinates

    }
}
