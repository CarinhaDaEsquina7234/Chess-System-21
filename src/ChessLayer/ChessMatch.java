package ChessLayer;

import ChessLayer.pieces.King;
import ChessLayer.pieces.Rook;
import boardgame.Board;
import boardgame.Position;

public class ChessMatch {
	private Board board;
	
	public ChessMatch()
	{
		board = new Board(8, 8);
		initialSetup();
	}
	
	//method to get Pieces
	public ChessPiece[][] getPieces()
	{
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i = 0; i<board.getRows(); i++)
		{
			for(int j = 0; j<board.getColumns(); j++)
			{
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece)
	{
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup()
	{
		placeNewPiece('a', 1, new Rook(board, Color.BLACK));
		placeNewPiece('d', 1, new King(board, Color.BLACK));
		placeNewPiece('h', 1, new Rook(board, Color.BLACK));
		
		placeNewPiece('a', 8, new Rook(board, Color.BLACK));
		placeNewPiece('d', 8, new King(board, Color.BLACK));
		placeNewPiece('h', 8, new Rook(board, Color.BLACK));
	}
	
}
