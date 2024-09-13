package pieces;

public class King extends Piece {
    public King(String color){
        super(color);
    }
    
    public String toString() {
        return getColor().charAt(0) + "K "; // Example: "wQ" for White Queen
    }

    public boolean isValidMove(int startX, int startY, int endX, int endY){
        int xDiff=Math.abs(startX - endX);
        int yDiff= Math.abs(startY - endY);
        return (xDiff <=1 && yDiff<=1);
    }
}
