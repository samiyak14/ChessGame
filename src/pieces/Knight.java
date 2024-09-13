package pieces;

public class Knight extends Piece {
    public Knight(String color){
        super(color);
    }

    public String toString() {
        return getColor().charAt(0) + "H "; // Example: "wQ" for White Queen
    }

    public boolean isValidMove(int startX, int startY, int endX, int endY){
        int xDiff=Math.abs(startX - endX);
        int yDiff= Math.abs(startY - endY);
        return (xDiff==2||yDiff==1)||(xDiff==1||yDiff==2);
    }
}
