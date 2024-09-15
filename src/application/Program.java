package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import ChessLayer.ChessException;
import ChessLayer.ChessMatch;
import ChessLayer.ChessPiece;
import ChessLayer.ChessPosition;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while (true) {
			try {
				UI.clearScreen();
				
				UI.printBoard(chessMatch.getPieces());
				
				System.out.println();
				
				System.out.print("Source: ");
				
				ChessPosition source = UI.readChessPosition(sc);
				
				System.out.print("Target: ");
				
				ChessPosition target = UI.readChessPosition(sc);
				
				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			}
			
			catch (ChessException custom)
			{
				System.out.println(custom.getMessage());
				sc.nextLine();
			}
			
			catch (InputMismatchException invalidCharacter)
			{
				System.out.println(invalidCharacter.getMessage());
				sc.nextLine();
			}
			
		}
				
	}

}
