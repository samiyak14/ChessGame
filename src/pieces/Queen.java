package pieces;

public class Queen extends Piece {
    public Queen(String color){
        super(color);
    }
    public String toString() {
        return getColor().charAt(0) + "Q "; // Example: "wQ" for White Queen
    }

    public boolean isValidMove(int startX, int startY, int endX, int endY){
        int xDiff=Math.abs(startX - endX);
        int yDiff= Math.abs(startY - endY);
        return (xDiff==0)||(yDiff==0 )||(xDiff==yDiff);
    }
}
