package pieces;

public class Rook extends Piece {
    public Rook(String color){
        super(color);
    }

    public String toString() {
        return getColor().charAt(0) + "R "; // Example: "wQ" for White Queen
    }

    public boolean isValidMove(int startX, int startY, int endX, int endY){
        int xDiff=Math.abs(startX - endX);
        int yDiff= Math.abs(startY - endY);
        return (xDiff==0 || yDiff==0); //rook only moves horizontal or vertical so either of x or y has to be the same
    }


}
