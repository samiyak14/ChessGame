package pieces;

import board.Board;

public class Pawn extends Piece {
    private Board board; // Reference to the board
    private boolean isFirstMove; // Field to track if it's the first move of the pawn

    public Pawn(String color, Board board) {
        super(color);
        this.board = board;
        this.isFirstMove = true; // Initialize as true since a pawn starts with its first move
    }

    public String toString() {
        return getColor().charAt(0) + "P "; // Example: "wQ" for White Queen
    }

    // Method to set the board reference
    public void setBoard(Board board) {
        this.board = board;
    }


    public boolean isValidMove(int startX, int startY, int endX, int endY) {
        if (board == null) {
            throw new IllegalStateException("Board has not been set.");
        }

        int direction = getColor().equals("white") ? -1 : 1; // Direction based on color
        int xDiff = endX - startX; // Difference in row indices
        int yDiff = endY - startY; // Difference in column indices

        // Moving forward (no capture)
        if (startY == endY) { // Moving in the same column
            if (xDiff == direction && board.getPieceAt(endX, endY) == null) {
                return true; // Move one square forward if the target square is empty
            }
            if (isFirstMove && xDiff == 2 * direction && board.getPieceAt(endX, endY) == null) {
                return true; // Move two squares forward from the starting position if the target square is empty
            }
        }
        // Capturing diagonally
        else if (Math.abs(startY - endY) == 1 && xDiff == direction) {
            if (board.getPieceAt(endX, endY) != null && !board.getPieceAt(endX, endY).getColor().equals(this.getColor())) {
                return true; // Capture diagonally if there is an opponent's piece
            }
        }
        return false; // Invalid move
    }

    // Method to set the first move status
    public void setFirstMove(boolean firstMove) {
        this.isFirstMove = firstMove;
    }

    // Method to check if it's the first move
    public boolean isFirstMove() {
        return isFirstMove;
    }
}
