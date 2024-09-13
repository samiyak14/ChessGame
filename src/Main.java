

import board.Board;
import pieces.Queen;
import pieces.Pawn;
import pieces.Rook;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();

        // Print initial board
        System.out.println("Initial Board Setup:");
        board.printBoard();

        // Move white queen from (7, 3) to (4, 3)
        System.out.println("Moving White Queen from (7, 3) to (4, 3)");
        board.movePiece(7, 3, 2, 3);
        board.printBoard();
        //Move black pawn at (4, 3) to test capturing queen
        System.out.println("Board with Black Pawn at (4, 3):");
        board.movePiece(1,2,2,3);
        board.printBoard();
    }
}


//next step is to check validity of the moves as in if a piece can move through a certain path if a piece is in its path.