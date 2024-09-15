package boardgame;

public class Board {

	private int rows;
	private int columns;
	
	//Vector of piece type
	private Piece[][] pieces;
	
	public Board() {
		
	}

	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rorws) {
		this.rows = rorws;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	//method to return pieces
	public Piece piece(int row, int column)
	{
		
		return pieces[row][column];
		
	}
	
	//method to return pieces position
	public Piece piece(Position position)
	{
		return pieces[position.getRow()][position.getColumn()];
	}
	
	//Defined piece position
	public void placePiece(Piece piece, Position position)
	{
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
}
