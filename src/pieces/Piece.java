package pieces;

public abstract class Piece {
    private String color;

    public Piece(String color){
        this.color=color;
    }

    public String getColor(){
        return color;
    }

    public abstract boolean isValidMove(int startX, int startY, int endX, int endY);

    public String toString() {
        return color.charAt(0) + getClass().getSimpleName().charAt(0) + " "; // Example: "wQ" for White Queen
    }
}
