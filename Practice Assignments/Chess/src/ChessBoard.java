
public class ChessBoard {
	/*
	 * creates chess board w/ user input grid
	 * prints if space is "Black" or "White"
	 * gridsize:4
	 *     BWBW
	 *     WBWB
	 *     BWBW
	 *     WBWB 
	 */
	public void draw(int gridSize) {
		String black = "B";
		String white = "W";

		// draws rows
		for (int row = 0; row < gridSize; row++) {

			// draws columns
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
