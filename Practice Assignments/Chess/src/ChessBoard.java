
public class ChessBoard {
	
	public void draw(int gridSize) {
		String black = "B";
		String white = "W";

		for (int row = 0; row < gridSize; row++) {

			for (int column = 0; column < gridSize; column++) {
				if ((column + row) % 2 == 0) {
					System.out.print(white + " ");
				} else if ((column + row) % 2 == 1) {
					System.out.print(black + " ");
				}
			}
			System.out.println("");
		}
	}
}
