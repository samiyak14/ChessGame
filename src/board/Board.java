package board;
import pieces.Piece;
import pieces.Pawn;
import pieces.Rook;
import pieces.Bishop;
import pieces.Knight;
import pieces.King;
import pieces.Queen;


public class Board
{
    private Piece[][] board;

    public Board()
    {
        board= new Piece[8][8];
        setupBoard();
    }
     public void setupBoard()
    {
        board[0][4]= new King("black");
        board[7][4]= new King("white");

        board[0][3]=new Queen("black");
        board[7][3]=new Queen("white");

        board[0][0]= new Rook("black");
        board[0][7]= new Rook("black");

        board[0][1]= new Knight("black");
        board[0][6]= new Knight("black");

        board[0][2]= new Bishop("black");
        board[0][5]= new Bishop("black");

        for(int i=0;i<8;i++)
        {
            board[1][i]= new Pawn("black",this);
        }

        board[7][0]= new Rook("white");
        board[7][7]= new Rook("white");

        board[7][1]= new Knight("white");
        board[7][6]= new Knight("white");

        board[7][2]= new Bishop("white");
        board[7][5]= new Bishop("white");

        for(int i=0;i<8;i++)
        {
            board[6][i]= new Pawn("white",this);
        }
    }

    public Piece getPieceAt(int x, int y) 
    {
        return board[x][y];
    }
        
    public void placePiece(int x, int y, Piece piece)
    {
        if (x < 0 || x >= 8 || y < 0 || y >= 8) 
        {
            throw new IllegalArgumentException("Position out of bounds");
        }
        board[x][y]=piece;
    }
        
    public void movePiece(int startX, int startY, int endX, int endY)
    {
        if (startX < 0 || startX >= 8 || startY < 0 || startY >= 8 ||
        endX < 0 || endX >= 8 || endY < 0 || endY >= 8) 
        {
            throw new IllegalArgumentException("Position out of bounds");
        }
        Piece piece= board[startX][startY];
        Piece targetPiece= board[endX][endY];

        if (piece == null) {
            throw new IllegalStateException("No piece at the starting position");
        }

        board[endX][endY]=piece;
        board[startX][startY]=null;
        if (piece instanceof Pawn) 
        {
            ((Pawn) piece).setFirstMove(false); // Update first move status
        }

        if (targetPiece != null) {
            System.out.println("Captured: " + targetPiece);
        }


    }

    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    System.out.print(".   ");
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
            System.out.println();
        }
    }
    
    

}
