


import javafx.scene.control.Button;
//an implementation of the XO board and the game logic
//imports necessary for this class
import javafx.scene.layout.VBox;
//an implementation of the XO board and the game logic
//imports necessary for this class
import javafx.scene.layout.Pane;

//class definition for drawing a game board
class AbaloneBoard extends Pane {
	// constructor for the class
	public AbaloneBoard(int player) {
		this.player = player;

		// initialise the boards
		board = new int[9][9];
		renders = new Piece[9][9];

		// Calling the intilization method
		initialization();

		// resetgame button
		Button resetgame = new Button("RESET GAME");
		getChildren().addAll(resetgame);

		resetgame.setOnAction(e -> {
			initialization();
		});

		// Display CURRENT GAME SCORE button
		Button gamescore = new Button("GAME SCORE");

		gamescore.setOnAction(e -> {
			displayCurrentPoints();
		});

		// adding them to BOARD
		VBox vbox = new VBox(8); // spacing = 8
		vbox.getChildren().addAll(resetgame, gamescore);
		getChildren().add(vbox);
	}

	// Intilization method this method placed the empty board and dynamicly set
	// up the board based on the amount of players
	public void initialization() {
                
                //Calling the reset game so that all renders are removed
		resetGame();

		for (int i = 2; i < 7; i++) { // 2.0 to 6.0
			board[i][0] = EMPTY;
			renders[i][0] = new Piece(EMPTY);
			getChildren().add(renders[i][0]);

		}
		for (int i = 1; i < 7; i++) { // 1.1 to 6.1
			board[i][1] = EMPTY;
			renders[i][1] = new Piece(EMPTY);

			getChildren().add(renders[i][1]);

		}
		for (int i = 1; i < 8; i++) { // 1.2 to 7.2
			board[i][2] = EMPTY;
			renders[i][2] = new Piece(EMPTY);
			getChildren().add(renders[i][2]);

		}
		for (int i = 0; i < 8; i++) { // 0.3 to 7.3
			board[i][3] = EMPTY;
			renders[i][3] = new Piece(EMPTY);

			getChildren().add(renders[i][3]);

		}
		for (int i = 0; i < 9; i++) { // 0.4 to 8.4
			board[i][4] = EMPTY;
			renders[i][4] = new Piece(EMPTY);

			getChildren().add(renders[i][4]);

		}
		for (int i = 0; i < 8; i++) { // 0.5 to 7.5
			board[i][5] = EMPTY;
			renders[i][5] = new Piece(EMPTY);

			getChildren().add(renders[i][5]);

		}

		for (int i = 1; i < 8; i++) { // 1.6 to 7.6
			board[i][6] = EMPTY;
			renders[i][6] = new Piece(EMPTY);

			getChildren().add(renders[i][6]);

		}
		for (int i = 1; i < 7; i++) { // 1.7 to 6.7
			board[i][7] = EMPTY;
			renders[i][7] = new Piece(EMPTY);

			getChildren().add(renders[i][7]);

		}
		for (int i = 2; i < 7; i++) { // 2.8 to 6.8
			board[i][8] = EMPTY;
			renders[i][8] = new Piece(EMPTY);

			getChildren().add(renders[i][8]);

		}

		if (player == 2) { // if two players are selected then:
			// first row for player 1
			for (int i = 2; i < 7; i++) {
				board[i][0] = PLAYER1;
				renders[i][0] = new Piece(PLAYER1);
				getChildren().add(renders[i][0]);
			} // second row player 1
			for (int i = 1; i < 7; i++) {
				board[i][1] = PLAYER1;
				renders[i][1] = new Piece(PLAYER1);
				getChildren().add(renders[i][1]);
			} // third row player 1
			for (int i = 3; i < 6; i++) {
				board[i][2] = PLAYER1;
				renders[i][2] = new Piece(PLAYER1);
				getChildren().add(renders[i][2]);
			}

			// first row for player 2
			for (int i = 2; i < 7; i++) {
				board[i][8] = PLAYER2;
				renders[i][8] = new Piece(PLAYER2);
				getChildren().add(renders[i][8]);
			} // second row player 2
			for (int i = 1; i < 7; i++) {
				board[i][7] = PLAYER2;
				renders[i][7] = new Piece(PLAYER2);
				getChildren().add(renders[i][7]);
			} // third row player 2
			for (int i = 3; i < 6; i++) {
				board[i][6] = PLAYER2;
				renders[i][6] = new Piece(PLAYER2);
				getChildren().add(renders[i][6]);
			}
		}
		// *******************THREE PLAYER SELECTION
		// ***************************************************
		else if (player == 3) {
			// first row for player 1
			for (int i = 2; i < 7; i++) {
				board[i][0] = PLAYER1;
				renders[i][0] = new Piece(PLAYER1);
				getChildren().add(renders[i][0]);
			} // second row player 1
			for (int i = 1; i < 7; i++) {
				board[i][1] = PLAYER1;
				renders[i][1] = new Piece(PLAYER1);
				getChildren().add(renders[i][1]);

			}
			// player 2 3 players selected
			for (int i = 3; i < 6; i++) {
				board[0][i] = PLAYER2;
				renders[0][i] = new Piece(PLAYER2);
				getChildren().add(renders[0][i]);
			}
			// player 2 3 players selected
			for (int i = 4; i < 8; i++) {
				board[1][i] = PLAYER2;
				renders[1][i] = new Piece(PLAYER2);
				getChildren().add(renders[1][i]);
			}

			// player 2 3 players selected
			for (int i = 6; i < 9; i++) {
				board[2][i] = PLAYER2;
				renders[2][i] = new Piece(PLAYER2);
				getChildren().add(renders[2][i]);
			}
			board[3][8] = PLAYER2;
			renders[3][8] = new Piece(PLAYER2);
			getChildren().add(renders[3][8]);

			// player 3 3 players
			for (int i = 5; i < 9; i++) {
				board[6][i] = PLAYER3;
				renders[6][i] = new Piece(PLAYER3);
				getChildren().add(renders[6][i]);
			}
			for (int i = 7; i < 9; i++) {
				board[5][i] = PLAYER3;
				renders[5][i] = new Piece(PLAYER3);
				getChildren().add(renders[5][i]);
			}
			for (int i = 3; i < 7; i++) {
				board[7][i] = PLAYER3;
				renders[7][i] = new Piece(PLAYER3);
				getChildren().add(renders[7][i]);
			}

			board[8][4] = PLAYER3;
			renders[8][4] = new Piece(PLAYER3);
			getChildren().add(renders[8][4]);
		}
		// *******************FOUR PLAYER SELECTION
		// ***************************************************
		else { // ELSE 4 player were selected
				// first row for player 1
			for (int i = 2; i < 6; i++) {
				board[i][0] = PLAYER1;
				renders[i][0] = new Piece(PLAYER1);
				getChildren().add(renders[i][0]);
			}
			// secoud row for player 1
			for (int i = 1; i < 5; i++) {
				board[i][1] = PLAYER1;
				renders[i][1] = new Piece(PLAYER1);
				getChildren().add(renders[i][1]);
			}
			// first row for player 2
			for (int i = 1; i < 4; i++) {
				board[6][i] = PLAYER2;
				renders[6][i] = new Piece(PLAYER2);
				getChildren().add(renders[6][i]);
			}
			for (int i = 2; i < 6; i++) {
				board[7][i] = PLAYER2;
				renders[7][i] = new Piece(PLAYER2);
				getChildren().add(renders[7][i]);
			}
			board[8][4] = PLAYER2;
			renders[8][4] = new Piece(PLAYER2);
			getChildren().add(renders[8][4]);

			for (int i = 3; i < 7; i++) {
				board[i][8] = PLAYER3;
				renders[i][8] = new Piece(PLAYER3);
				getChildren().add(renders[i][8]);
			}
			for (int i = 3; i < 7; i++) {
				board[i][7] = PLAYER3;
				renders[i][7] = new Piece(PLAYER3);
				getChildren().add(renders[i][7]);
			}

			// first row for player 4
			for (int i = 3; i < 6; i++) {
				board[0][i] = PLAYER4;
				renders[0][i] = new Piece(PLAYER4);
				getChildren().add(renders[0][i]);
			}
			for (int i = 4; i < 8; i++) {
				board[1][i] = PLAYER4;
				renders[1][i] = new Piece(PLAYER4);
				getChildren().add(renders[1][i]);
			}
			board[2][6] = PLAYER4;
			renders[2][6] = new Piece(PLAYER4);
			getChildren().add(renders[2][6]);
		}

		// Intializing Players Points
		PLAYER1Points = 0;
		PLAYER2Points = 0;
		PLAYER3Points = 0;
		PLAYER4Points = 0;
                //Setting the current player Player 1
		current_player = PLAYER1;
                //Setting the selection to false
		selection = false;
                
                //Setting the total completed moves to 0
		totalcompletedmoves = 0;
		System.out.println("Player selection: " + player); // debugger
		System.out.println("PLAYER1Points: " + PLAYER1Points); // debugger
		System.out.println("PLAYER2Points: " + PLAYER2Points); // debugger
		System.out.println("PLAYER3Points: " + PLAYER3Points); // debugger
		System.out.println("PLAYER4Points: " + PLAYER4Points); // debugger
		System.out.println("---------------------------"); // debugger

	}

	// we have to override resizing behaviour to make our view appear properly
	@Override
	public void resize(double width, double height) {
		// call the superclass method first
		super.resize(width, height);

		// figure out the width and height of a cell
		cell_width = width / 9.0;
		cell_height = height / 9.0;
		// we need to reset the sizes and positions of all Pieces that were
		// placed
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != 0) {
					renders[i][j].relocate(i * cell_width, j * cell_height);
					renders[i][j].resize(cell_width, cell_height);

				}
			}
		}

		// moving the rows to 40px x-axis
		for (int i = 1; i < 7; i++) { // 1.1 to 6.1
			renders[i][1].setLayoutX(40);
		}

		for (int i = 0; i < 8; i++) { // 0.3 to 7.3
			renders[i][3].setLayoutX(40);
		}

		for (int i = 0; i < 8; i++) { // 0.5 to 7.5
			renders[i][5].setLayoutX(40);

		}

		for (int i = 1; i < 7; i++) { // 1.7 to 6.7
			renders[i][7].setLayoutX(40);
		}

	}

	// public method for resetting the game
	public void resetGame() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				board[i][j] = 0;
				getChildren().remove(renders[i][j]);
				renders[i][j] = null;
			}
		}

	}

	// public method that tries to place a piece
	public void placePiece(final double x, final double y) {
		// translate the x, y coordinates into cell indexes
		int indexx = (int) (x / cell_width);
		int indexy = (int) (y / cell_height);

		// System.out.println("PlacePiece method current_player: " +
		// current_player); //DEBUGGER
                
                //if the win contion is false the we can go into the movement
		if (WIN == false) {
			if (board[indexx][indexy] == PLAYER1 && current_player == PLAYER1) {  //if x and y are equal to  the board 
                            //and the current player is player one then he selected his own piece.
                                //displaying the selection
				System.out.println("PLAYER1(RED) have selected Piece! at board[" + indexx + "][" + indexy + "]");
                                //storing the x and y indexs to a int varible
				recentcoordinatex = indexx;
				recentcoordinatey = indexy;
                                
                                //set selection to true
				selection = true;
				return;
			}
			if (board[indexx][indexy] == PLAYER2 && current_player == PLAYER2) {//if x and y are equal to  the board 
                            //and the current player is player one then he selected his own piece.
                                //displaying the selection
				System.out.println("PLAYER2(BLUE) selected Piece! at board[" + indexx + "][" + indexy + "]");
				//storing the x and y indexs to a int varible
                                recentcoordinatex = indexx;
				recentcoordinatey = indexy;
				
                                //Set Selection to true
                                selection = true;
				return;
			}
			if (board[indexx][indexy] == PLAYER3 && current_player == PLAYER3) {//if x and y are equal to  the board 
                            //and the current player is player one then he selected his own piece.
                                //displaying the selection
				System.out.println("PLAYER3(MAGETA) selected Piece! at board[" + indexx + "][" + indexy + "]");
				//storing the values
                                recentcoordinatex = indexx;
				recentcoordinatey = indexy;
                                //Setting the selection to true
				selection = true;
				return;
			}
			if (board[indexx][indexy] == PLAYER4 && current_player == PLAYER4) {//if x and y are equal to  the board 
                            //and the current player is player one then he selected his own piece.
                                //displaying the selection
				System.out.println("PLAYER4(CYAN) selected Piece! at board[" + indexx + "][" + indexy + "]");
                                //storing the values
				recentcoordinatex = indexx;
				recentcoordinatey = indexy;
				//setting the selection to true
                                selection = true;
				return;
			} else {
				if (selection == true) { //if selection true then do the second click
					for (int i = 2; i < 6; i++) { // looping for Players 1-4
													// current_player
						if (board[indexx][indexy] == EMPTY && current_player == i && recentcoordinatey % 2 == 0) { // ONE
							// PLAYER
							// MOVEMENT even mapping for one pieces
							if (indexx == recentcoordinatex - 1 && indexy == recentcoordinatey - 1
									|| indexx == recentcoordinatex && indexy == recentcoordinatey - 1
									|| indexx == recentcoordinatex - 1 && indexy == recentcoordinatey
									|| indexx == recentcoordinatex + 1 && indexy == recentcoordinatey
									|| indexx == recentcoordinatex - 1 && indexy == recentcoordinatey + 1
									|| indexx == recentcoordinatex && indexy == recentcoordinatey + 1) {
								board[recentcoordinatex][recentcoordinatey] = EMPTY; //setting the old value to empty
								getChildren().remove(renders[recentcoordinatex][recentcoordinatey]); //removing the renders
								renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY); //putting new empty piece
								getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
								board[indexx][indexy] = i; //setting the board to the current player
								renders[indexx][indexy] = new Piece(i); // the piece of the current player
								getChildren().add(renders[indexx][indexy]); //adding renders
								PlayerSelectionMethod(i); //calling playerselection method by passing in the current player
								return;
							}
						}

						// One piece movement with ood mapping
						if (board[indexx][indexy] == EMPTY && current_player == i && recentcoordinatey % 2 != 0) {
							if (indexx == recentcoordinatex && indexy == recentcoordinatey - 1
									|| indexx == recentcoordinatex + 1 && indexy == recentcoordinatey - 1
									|| indexx == recentcoordinatex + 1 && indexy == recentcoordinatey
									|| indexx == recentcoordinatex + 1 && indexy == recentcoordinatey + 1
									|| indexx == recentcoordinatex && indexy == recentcoordinatey + 1
									|| indexx == recentcoordinatex - 1 && indexy == recentcoordinatey) {
								board[recentcoordinatex][recentcoordinatey] = EMPTY; //setting the old value to empty
								getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
								renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY); //adding and empty piece on old value
								getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
								board[indexx][indexy] = i; //setting the board to the current player
								renders[indexx][indexy] = new Piece(i); //adding the new piece because the current player
								getChildren().add(renders[indexx][indexy]); //adding renders 
								PlayerSelectionMethod(i); //calling player selection method
								return;
							}
						}
						for (int a = 0; a < 5; a++) { // NORTHEAST CAPTURE
														// MOVEMENT FOR ALL
														// PLAYERS 2.0 to 6.0
														// 2pieces
							if (indexx == 2 + a && indexy == 0 && board[1 + a][2] == i && board[1 + a][1] == i
								&& board[2 + a][0] != i && board[2 + a][0] != EMPTY) {//checking if there are two with same values
                                                            //if is not equal to current player and it if's not empty
                                                     
								board[1 + a][1] = i; //chaging the spot of the previous
								board[1 + a][2] = EMPTY; //setting the old value to empty
								board[2 + a][0] = i;
								AddPoints(1); //calling the addpoints method and passing in the number
								getChildren().remove(renders[2 + a][0]);
								renders[2 + a][0] = new Piece(i);
								getChildren().add(renders[2 + a][0]);
								getChildren().remove(renders[1 + a][2]);
								renders[1 + a][2] = new Piece(EMPTY);
								getChildren().add(renders[1 + a][2]);
								PlayerSelectionMethod(i); //calling the player selection method
								return;

							}
						}
						if (indexx == 6 && indexy == 1 && board[5][3] == i && board[6][2] == i && board[6][1] != i
								&& board[6][1] != EMPTY) { /// NORTHEAST CAPTURE
															/// 2pieces
															/// MOVEMENT 6.1
							board[6][1] = i; //setting the player  to current player
							board[5][3] = EMPTY; //setting the old value to empty
							board[6][2] = i;
							AddPoints(1); //calling the add points method
							getChildren().remove(renders[6][1]);
							renders[6][1] = new Piece(i);
							getChildren().add(renders[6][1]);
							getChildren().remove(renders[5][3]);
							renders[5][3] = new Piece(EMPTY);
							getChildren().add(renders[5][3]);
							PlayerSelectionMethod(i); //calling the player selection method
							return;

						}
						if (indexx == 7 && indexy == 2 && board[6][4] == i && board[6][3] == i && board[7][2] != i
								&& board[7][2] != EMPTY) { /// NORTHEAST CAPTURE
															/// 2pieces
															/// MOVEMENT 7.2
							board[7][2] = i; //changing the value
							board[6][4] = EMPTY; //setting the old to empty
							board[6][3] = i;
							AddPoints(1); //calling the add points method
							getChildren().remove(renders[7][2]);
							renders[7][2] = new Piece(i);
							getChildren().add(renders[7][2]);
							getChildren().remove(renders[6][4]);
							renders[6][4] = new Piece(EMPTY);
							getChildren().add(renders[6][4]);
							PlayerSelectionMethod(i); //calling the playerselection method
							return;
						}
						if (indexx == 7 && indexy == 3 && board[6][5] == i && board[7][4] == i && board[7][3] != i
								&& board[7][3] != EMPTY) { /// NORTHEAST CAPTURE
															/// 2pieces
															/// MOVEMENT 7.3
							board[7][3] = i;
							board[6][5] = EMPTY;
							board[7][4] = i;
							AddPoints(1);
							getChildren().remove(renders[7][3]);
							renders[7][3] = new Piece(i);
							getChildren().add(renders[7][3]);
							getChildren().remove(renders[6][5]);
							renders[6][5] = new Piece(EMPTY);
							getChildren().add(renders[6][5]);
							PlayerSelectionMethod(i);
							return;
						}
						if (indexx == 8 && indexy == 4 && board[7][6] == i && board[7][5] == i && board[8][4] != i
								&& board[8][4] != EMPTY) { /// NORTHEAST CAPTURE
															/// 2pieces
															/// MOVEMENT 8.4
							board[8][4] = i;
							board[7][6] = EMPTY;
							board[7][5] = i;
							AddPoints(1);
							getChildren().remove(renders[8][4]);
							renders[8][4] = new Piece(i);
							getChildren().add(renders[8][4]);
							getChildren().remove(renders[7][6]);
							renders[7][6] = new Piece(EMPTY);
							getChildren().add(renders[7][6]);
							PlayerSelectionMethod(i);
							return;
						}

						for (int a = 0; a < 5; a++) { // NORTHWeST CAPTURE
							// MOVEMENT FOR ALL
							// PLAYERS 2.0 to 6.0 2pieces
							if (indexx == 2 + a && indexy == 0 && board[3 + a][2] == i && board[2 + a][1] == i
									&& board[2 + a][0] != i && board[2 + a][0] != EMPTY) {
								board[2 + a][0] = i;
								board[3 + a][2] = EMPTY;
								board[2 + a][1] = i;
								AddPoints(1);
								getChildren().remove(renders[2 + a][0]);
								renders[2 + a][0] = new Piece(i);
								getChildren().add(renders[2 + a][0]);
								getChildren().remove(renders[3 + a][2]);
								renders[3 + a][2] = new Piece(EMPTY);
								getChildren().add(renders[3 + a][2]);
								PlayerSelectionMethod(i);
								return;

							}
						}
						if (indexx == 0 && indexy == 4 && board[1][6] == i && board[0][5] == i && board[0][4] != i
								&& board[0][4] != EMPTY) { /// NORTHWEST CAPTURE
															/// 2pieces
															/// MOVEMENT 0.4
							board[0][4] = i;
							board[1][6] = EMPTY;
							board[0][5] = i;
							AddPoints(1);
							getChildren().remove(renders[0][4]);
							renders[0][4] = new Piece(i);
							getChildren().add(renders[0][4]);
							getChildren().remove(renders[1][6]);
							renders[1][6] = new Piece(EMPTY);
							getChildren().add(renders[1][6]);
							PlayerSelectionMethod(i);
							return;
						}
						if (indexx == 0 && indexy == 3 && board[1][5] == i && board[1][4] == i && board[0][3] != i
								&& board[0][3] != EMPTY) { /// NORTHWEST CAPTURE
															/// 2pieces
															/// MOVEMENT 0.3
							board[0][3] = i;
							board[1][5] = EMPTY;
							board[1][4] = i;
							AddPoints(1);
							getChildren().remove(renders[0][3]);
							renders[0][3] = new Piece(i);
							getChildren().add(renders[0][3]);
							getChildren().remove(renders[1][5]);
							renders[1][5] = new Piece(EMPTY);
							getChildren().add(renders[1][5]);
							PlayerSelectionMethod(i);
							return;
						}
						if (indexx == 1 && indexy == 2 && board[2][4] == i && board[1][3] == i && board[1][2] != i
								&& board[1][2] != EMPTY) { /// NORTHWEST CAPTURE
															/// 2pieces
															/// MOVEMENT 1.2
							board[1][2] = i;
							board[2][4] = EMPTY;
							board[1][3] = i;
							AddPoints(1);
							getChildren().remove(renders[1][2]);
							renders[1][2] = new Piece(i);
							getChildren().add(renders[1][2]);
							getChildren().remove(renders[2][4]);
							renders[2][4] = new Piece(EMPTY);
							getChildren().add(renders[2][4]);
							PlayerSelectionMethod(i);
							return;
						}
						// NORTHWEST CAPTURE 2 PIECES MOVEMENT 1.1
						if (indexx == 1 && indexy == 1 && board[2][3] == i && board[2][2] == i && board[1][1] != i
								&& board[1][1] != EMPTY) {
							board[1][1] = i;
							board[2][3] = EMPTY;
							board[2][2] = i;
							AddPoints(1);
							getChildren().remove(renders[1][1]);
							renders[1][1] = new Piece(i);
							getChildren().add(renders[1][1]);
							getChildren().remove(renders[2][3]);
							renders[2][3] = new Piece(EMPTY);
							getChildren().add(renders[2][3]);
							PlayerSelectionMethod(i);
							return;
						}
						// SOUTHWEST CAPTURE 2 PiECEs 2.8 to 4.8
						for (int a = 0; a < 5; a++) {
							if (indexx == 6 - a && indexy == 8 && board[7 - a][6] == i && board[6 - a][7] == i
									&& board[6 - a][8] != i && board[6 - a][8] != EMPTY) {
								board[6 - a][8] = i;
								board[7 - a][6] = EMPTY;
								board[6 - a][7] = i;
								AddPoints(1);
								getChildren().remove(renders[6 - a][8]);
								renders[6 - a][8] = new Piece(i);
								getChildren().add(renders[6 - a][8]);
								getChildren().remove(renders[7 - a][6]);
								renders[7 - a][6] = new Piece(EMPTY);
								getChildren().add(renders[7 - a][6]);
								PlayerSelectionMethod(i);
								return;
							}
						}
						// SOUTHWEST CAPTURE MOVEMENT 2 PIECES 1.7
						if (indexx == 1 && indexy == 7 && board[2][5] == i && board[2][6] == i && board[1][7] != i
								&& board[1][7] != EMPTY) {
							board[1][7] = i;
							board[2][5] = EMPTY;
							board[2][6] = i;
							AddPoints(1);
							getChildren().remove(renders[1][7]);
							renders[1][7] = new Piece(i);
							getChildren().add(renders[1][7]);
							getChildren().remove(renders[2][5]);
							renders[2][5] = new Piece(EMPTY);
							getChildren().add(renders[2][5]);
							PlayerSelectionMethod(i);
							return;
						}

						// SOUTHWEST CAPTURE MOVEMENT 2 PIECES 1.6
						if (indexx == 1 && indexy == 6 && board[2][4] == i && board[1][5] == i && board[1][6] != i
								&& board[1][6] != EMPTY) {
							board[1][6] = i;
							board[2][4] = EMPTY;
							board[1][5] = i;
							AddPoints(1);
							getChildren().remove(renders[1][6]);
							renders[1][6] = new Piece(i);
							getChildren().add(renders[1][6]);
							getChildren().remove(renders[2][4]);
							renders[2][4] = new Piece(EMPTY);
							getChildren().add(renders[2][4]);
							PlayerSelectionMethod(i);
							return;
						}

						// SOUTHWEST CAPTURE MOVEMENT 2 PIECES 0.5
						if (indexx == 0 && indexy == 5 && board[1][3] == i && board[1][4] == i && board[0][5] != i
								&& board[0][5] != EMPTY) {
							board[0][5] = i;
							board[1][3] = EMPTY;
							board[1][4] = i;
							AddPoints(1);
							getChildren().remove(renders[0][5]);
							renders[0][5] = new Piece(i);
							getChildren().add(renders[0][5]);
							getChildren().remove(renders[1][3]);
							renders[1][3] = new Piece(EMPTY);
							getChildren().add(renders[1][3]);
							PlayerSelectionMethod(i);
							return;
						}

						// SOUTHWEST CAPTURE MOVEMENT 2 PIECES 0.5
						if (indexx == 0 && indexy == 5 && board[1][3] == i && board[1][4] == i && board[0][5] != i
								&& board[0][5] != EMPTY) {
							board[0][5] = i;
							board[1][3] = EMPTY;
							board[1][4] = i;
							AddPoints(1);
							getChildren().remove(renders[0][5]);
							renders[0][5] = new Piece(i);
							getChildren().add(renders[0][5]);
							getChildren().remove(renders[1][3]);
							renders[1][3] = new Piece(EMPTY);
							getChildren().add(renders[1][3]);
							PlayerSelectionMethod(i);
							return;
						}

						// SOUTHWEST CAPTURE MOVEMENT 2 PIECES 0.4
						if (indexx == 0 && indexy == 4 && board[1][2] == i && board[0][3] == i && board[0][4] != i
								&& board[0][4] != EMPTY) {
							board[0][4] = i;
							board[1][2] = EMPTY;
							board[0][3] = i;
							AddPoints(1);
							getChildren().remove(renders[0][4]);
							renders[0][4] = new Piece(i);
							getChildren().add(renders[0][4]);
							getChildren().remove(renders[1][2]);
							renders[1][2] = new Piece(EMPTY);
							getChildren().add(renders[1][2]);
							PlayerSelectionMethod(i);
							return;
						}

						// SOUTHEAST CAPTURE MOVEMENT 2 PIECES 2.8 to 6.8
						for (int a = 0; a < 5; a++)
							if (indexx == 2 + a && indexy == 8 && board[1 + a][6] == i && board[1 + a][7] == i
									&& board[2 + a][8] != i && board[2 + a][8] != EMPTY) {
								board[2 + a][8] = i;
								board[1 + a][6] = EMPTY;
								board[1 + a][7] = i;
								AddPoints(1);
								getChildren().remove(renders[2 + a][8]);
								renders[2 + a][8] = new Piece(i);
								getChildren().add(renders[2 + a][8]);
								getChildren().remove(renders[1 + a][6]);
								renders[1 + a][6] = new Piece(EMPTY);
								getChildren().add(renders[1 + a][6]);
								PlayerSelectionMethod(i);
								return;
							}

						// SOUTHEAST CAPTURE MOVEMENT 2 PIECES 5.5
						if (indexx == 6 && indexy == 7 && board[5][5] == i && board[6][6] == i && board[6][7] != i
								&& board[6][7] != EMPTY) {
							board[6][7] = i;
							board[5][5] = EMPTY;
							board[6][6] = i;
							AddPoints(1);
							getChildren().remove(renders[6][7]);
							renders[6][7] = new Piece(i);
							getChildren().add(renders[6][7]);
							getChildren().remove(renders[5][5]);
							renders[5][5] = new Piece(EMPTY);
							getChildren().add(renders[5][5]);
							PlayerSelectionMethod(i);
							return;
						}

						// SOUTHEAST CAPTURE MOVEMENT 2 PIECES 7.6
						if (indexx == 7 && indexy == 6 && board[6][4] == i && board[6][5] == i && board[7][6] != i
								&& board[7][6] != EMPTY) {
							board[7][6] = i;
							board[6][4] = EMPTY;
							board[6][5] = i;
							AddPoints(1);
							getChildren().remove(renders[7][6]);
							renders[7][6] = new Piece(i);
							getChildren().add(renders[7][6]);
							getChildren().remove(renders[6][4]);
							renders[6][4] = new Piece(EMPTY);
							getChildren().add(renders[6][4]);
							PlayerSelectionMethod(i);
							return;
						}

						// SOUTHEAST CAPTURE MOVEMENT 2 PIECES 7.5
						if (indexx == 7 && indexy == 5 && board[6][3] == i && board[7][4] == i && board[7][5] != i
								&& board[7][5] != EMPTY) {
							board[7][5] = i;
							board[6][3] = EMPTY;
							board[7][4] = i;
							AddPoints(1);
							getChildren().remove(renders[7][5]);
							renders[7][5] = new Piece(i);
							getChildren().add(renders[7][5]);
							getChildren().remove(renders[6][3]);
							renders[6][3] = new Piece(EMPTY);
							getChildren().add(renders[6][3]);
							PlayerSelectionMethod(i);
							return;
						}

						// SOUTHEAST CAPTURE MOVEMENT 2 PIECES 8.4
						if (indexx == 8 && indexy == 4 && board[7][2] == i && board[7][3] == i && board[8][4] != i
								&& board[8][4] != EMPTY) {
							board[8][4] = i;
							board[7][2] = EMPTY;
							board[7][3] = i;
							AddPoints(1);
							getChildren().remove(renders[8][4]);
							renders[8][4] = new Piece(i);
							getChildren().add(renders[8][4]);
							getChildren().remove(renders[7][2]);
							renders[7][2] = new Piece(EMPTY);
							getChildren().add(renders[7][2]);
							PlayerSelectionMethod(i);
							return;
						}

						// WEST CAPTURE MOVEMENT 2 PIECES 2.0
						if (indexx == 2 && indexy == 0 && board[4][0] == i && board[3][0] == i && board[2][0] != i
								&& board[2][0] != EMPTY) {
							board[2][0] = i;
							board[4][0] = EMPTY;
							board[3][0] = i;
							AddPoints(1);
							getChildren().remove(renders[2][0]);
							renders[2][0] = new Piece(i);
							getChildren().add(renders[2][0]);
							getChildren().remove(renders[4][0]);
							renders[4][0] = new Piece(EMPTY);
							getChildren().add(renders[4][0]);
							PlayerSelectionMethod(i);
							return;
						}

						// WEST CAPTURE MOVEMENT 2 PIECES 1.1 to 1.2
						for (int a = 0; a < 2; a++)
							if (indexx == 1 && indexy == 1 + a && board[3][1 + a] == i && board[2][1 + a] == i
									&& board[1][1 + a] != i && board[1][1 + a] != EMPTY) {
								board[1][1 + a] = i;
								board[3][1 + a] = EMPTY;
								board[2][1 + a] = i;
								AddPoints(1);
								getChildren().remove(renders[1][1 + a]);
								renders[1][1 + a] = new Piece(i);
								getChildren().add(renders[1][1 + a]);
								getChildren().remove(renders[3][1 + a]);
								renders[3][1 + a] = new Piece(EMPTY);
								getChildren().add(renders[3][1 + a]);
								PlayerSelectionMethod(i);
								return;
							}

						// WEST CAPTURE MOVEMENT 2 PIECES 0.3 to 0.5
						for (int a = 0; a < 3; a++)
							if (indexx == 0 && indexy == 3 + a && board[2][3 + a] == i && board[1][3 + a] == i
									&& board[0][3 + a] != i && board[0][3 + a] != EMPTY) {
								board[0][3 + a] = i;
								board[2][3 + a] = EMPTY;
								board[1][3 + a] = i;
								AddPoints(1);
								getChildren().remove(renders[0][3 + a]);
								renders[0][3 + a] = new Piece(i);
								getChildren().add(renders[0][3 + a]);
								getChildren().remove(renders[2][3 + a]);
								renders[2][3 + a] = new Piece(EMPTY);
								getChildren().add(renders[2][3 + a]);
								PlayerSelectionMethod(i);
								return;
							}

						// WEST CAPTURE MOVEMENT 2 PIECES 1.6 to 1.7
						for (int a = 0; a < 2; a++)
							if (indexx == 1 && indexy == 6 + a && board[3][6 + a] == i && board[2][6 + a] == i
									&& board[1][6 + a] != i && board[1][6 + a] != EMPTY) {
								board[1][6 + a] = i;
								board[3][6 + a] = EMPTY;
								board[2][6 + a] = i;
								AddPoints(1);
								getChildren().remove(renders[1][6 + a]);
								renders[1][6 + a] = new Piece(i);
								getChildren().add(renders[1][6 + a]);
								getChildren().remove(renders[3][6 + a]);
								renders[3][6 + a] = new Piece(EMPTY);
								getChildren().add(renders[3][6 + a]);
								PlayerSelectionMethod(i);
								return;
							}

						// WEST CAPTURE MOVEMENT 2 PIECES 2.8
						if (indexx == 2 && indexy == 8 && board[4][8] == i && board[3][8] == i && board[2][8] != i
								&& board[2][8] != EMPTY) {
							board[2][8] = i;
							board[4][8] = EMPTY;
							board[3][8] = i;
							AddPoints(1);
							getChildren().remove(renders[2][8]);
							renders[2][8] = new Piece(i);
							getChildren().add(renders[2][8]);
							getChildren().remove(renders[4][8]);
							renders[4][8] = new Piece(EMPTY);
							getChildren().add(renders[4][8]);
							PlayerSelectionMethod(i);
							return;
						}

						// EAST CAPTURE MOVEMENT 2 PIECES 6.0 to 6.1
						for (int a = 0; a < 2; a++)
							if (indexx == 6 && indexy == 0 + a && board[4][0 + a] == i && board[5][0 + a] == i
									&& board[6][0 + a] != i && board[5][0 + a] != EMPTY) {
								board[6][0 + a] = i;
								board[4][0 + a] = EMPTY;
								board[5][0 + a] = i;
								AddPoints(1);
								getChildren().remove(renders[6][0 + a]);
								renders[6][0 + a] = new Piece(i);
								getChildren().add(renders[6][0 + a]);
								getChildren().remove(renders[4][0 + a]);
								renders[4][0 + a] = new Piece(EMPTY);
								getChildren().add(renders[4][0 + a]);
								PlayerSelectionMethod(i);
								return;
							}

						// EAST CAPTURE MOVEMENT 2 PIECES 7.2 to 7.3
						for (int a = 0; a < 2; a++)
							if (indexx == 7 && indexy == 2 + a && board[5][2 + a] == i && board[6][2 + a] == i
									&& board[7][2 + a] != i && board[7][2 + a] != EMPTY) {
								board[7][2 + a] = i;
								board[5][2 + a] = EMPTY;
								board[6][3 + a] = i;
								AddPoints(1);
								getChildren().remove(renders[7][2 + a]);
								renders[7][2 + a] = new Piece(i);
								getChildren().add(renders[7][2 + a]);
								getChildren().remove(renders[5][2 + a]);
								renders[5][2 + a] = new Piece(EMPTY);
								getChildren().add(renders[5][2 + a]);
								PlayerSelectionMethod(i);
								return;
							}
						// EAST CAPTURE MOVEMENT 2 PIECES 8.4
						if (indexx == 8 && indexy == 4 && board[6][4] == i && board[7][4] == i && board[8][4] != i
								&& board[8][4] != EMPTY) {
							board[8][4] = i;
							board[6][4] = EMPTY;
							board[7][4] = i;
							AddPoints(1);
							getChildren().remove(renders[8][4]);
							renders[8][4] = new Piece(i);
							getChildren().add(renders[8][4]);
							getChildren().remove(renders[6][4]);
							renders[6][4] = new Piece(EMPTY);
							getChildren().add(renders[6][4]);
							PlayerSelectionMethod(i);
							return;
						}

						// EAST CAPTURE MOVEMENT 2 PIECES 7.5 to 7.6
						for (int a = 0; a < 2; a++)
							if (indexx == 7 && indexy == 5 + a && board[5][5 + a] == i && board[6][5 + a] == i
									&& board[7][5 + a] != i && board[7][5 + a] != EMPTY) {
								board[7][5 + a] = i;
								board[5][5 + a] = EMPTY;
								board[6][5 + a] = i;
								AddPoints(1);
								getChildren().remove(renders[7][5 + a]);
								renders[7][5 + a] = new Piece(i);
								getChildren().add(renders[7][5 + a]);
								getChildren().remove(renders[5][5 + a]);
								renders[5][5 + a] = new Piece(EMPTY);
								getChildren().add(renders[5][5 + a]);
								PlayerSelectionMethod(i);
								return;
							}

						// EAST CAPTURE MOVEMENT 2 PIECES 6.7 to 6.8
						for (int a = 0; a < 2; a++)
							if (indexx == 6 && indexy == 7 + a && board[4][7 + a] == i && board[5][7 + a] == i
									&& board[6][7 + a] != i && board[6][7 + a] != EMPTY) {
								board[6][7 + a] = i;
								board[4][7 + a] = EMPTY;
								board[5][7 + a] = i;
								AddPoints(1);
								getChildren().remove(renders[6][7 + a]);
								renders[6][7 + a] = new Piece(i);
								getChildren().add(renders[6][7 + a]);
								getChildren().remove(renders[4][7 + a]);
								renders[4][7 + a] = new Piece(EMPTY);
								getChildren().add(renders[4][7 + a]);
								PlayerSelectionMethod(i);
								return;
							}

						// 2 player pushing mapping with even southeast
						if (indexx == recentcoordinatex + 1 && indexy == recentcoordinatey + 2
								&& board[indexx - 1][indexy - 2] == i && board[indexx - 1][indexy - 1] == i
								&& board[indexx][indexy] != i && board[indexx][indexy] != EMPTY
								&& board[indexx][indexy + 1] == EMPTY && recentcoordinatey % 2 == 0) {

							board[indexx][indexy + 1] = board[indexx][indexy];
							renders[indexx][indexy + 1] = new Piece(board[indexx][indexy + 1]);
							getChildren().add(renders[indexx][indexy + 1]);

							board[indexx][indexy] = i;
							board[recentcoordinatex][recentcoordinatey] = EMPTY;
							getChildren().remove(renders[indexx][indexy]);
							renders[indexx][indexy] = new Piece(i);
							getChildren().add(renders[indexx][indexy]);

							getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
							renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY);
							getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
							PlayerSelectionMethod(i);
							return;
						}

						// 2 player pushing mapping with even southwest
						if (indexx == recentcoordinatex - 1 && indexy == recentcoordinatey + 2
								&& board[indexx + 1][indexy - 2] == i && board[indexx][indexy - 1] == i
								&& board[indexx][indexy] != i && board[indexx][indexy] != EMPTY
								&& board[indexx - 1][indexy + 1] == EMPTY && recentcoordinatey % 2 == 0) {

							board[indexx - 1][indexy + 1] = board[indexx][indexy];
							renders[indexx - 1][indexy + 1] = new Piece(board[indexx - 1][indexy + 1]);
							getChildren().add(renders[indexx - 1][indexy + 1]);

							board[indexx][indexy] = i;
							board[recentcoordinatex][recentcoordinatey] = EMPTY;
							getChildren().remove(renders[indexx][indexy]);
							renders[indexx][indexy] = new Piece(i);
							getChildren().add(renders[indexx][indexy]);

							getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
							renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY);
							getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
							PlayerSelectionMethod(i);
							return;
						}

						// 2 player pushing mapping with even east
						if (indexx == recentcoordinatex + 2 && indexy == recentcoordinatey
								&& board[indexx - 2][indexy] == i && board[indexx - 2][indexy] == i
								&& board[indexx][indexy] != i && board[indexx][indexy] != EMPTY
								&& board[indexx + 1][indexy] == EMPTY && recentcoordinatey % 2 == 0) {

							board[indexx + 1][indexy] = board[indexx][indexy];
							renders[indexx + 1][indexy] = new Piece(board[indexx + 1][indexy]);
							getChildren().add(renders[indexx + 1][indexy]);

							board[indexx][indexy] = i;
							board[recentcoordinatex][recentcoordinatey] = EMPTY;
							getChildren().remove(renders[indexx][indexy]);
							renders[indexx][indexy] = new Piece(i);
							getChildren().add(renders[indexx][indexy]);

							getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
							renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY);
							getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
							PlayerSelectionMethod(i);
							return;
						}

						// 2 player pushing mapping with even west
						if (indexx == recentcoordinatex - 2 && indexy == recentcoordinatey
								&& board[indexx + 2][indexy] == i && board[indexx + 1][indexy] == i
								&& board[indexx][indexy] != i && board[indexx][indexy] != EMPTY
								&& board[indexx - 1][indexy] == EMPTY && recentcoordinatey % 2 == 0) {

							board[indexx - 1][indexy] = board[indexx][indexy];
							renders[indexx - 1][indexy] = new Piece(board[indexx - 1][indexy]);
							getChildren().add(renders[indexx - 1][indexy]);

							board[indexx][indexy] = i;
							board[recentcoordinatex][recentcoordinatey] = EMPTY;
							getChildren().remove(renders[indexx][indexy]);
							renders[indexx][indexy] = new Piece(i);
							getChildren().add(renders[indexx][indexy]);

							getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
							renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY);
							getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
							PlayerSelectionMethod(i);
							return;
						}

						// 2 player pushing mapping with even northeast
						if (indexx == recentcoordinatex + 1 && indexy == recentcoordinatey - 2
								&& board[indexx - 1][indexy + 2] == i && board[indexx - 1][indexy + 1] == i
								&& board[indexx][indexy] != i && board[indexx][indexy] != EMPTY
								&& board[indexx][indexy - 1] == EMPTY && recentcoordinatey % 2 == 0) {
                                                         //copies the value for the old one to the new one
							board[indexx][indexy - 1] = board[indexx][indexy];
							renders[indexx][indexy - 1] = new Piece(board[indexx][indexy - 1]);
							getChildren().add(renders[indexx][indexy - 1]);
                                                        
                                                        //the replaces the pushed value
							board[indexx][indexy] = i;
							board[recentcoordinatex][recentcoordinatey] = EMPTY;
							getChildren().remove(renders[indexx][indexy]);
							renders[indexx][indexy] = new Piece(i);
							getChildren().add(renders[indexx][indexy]);
                                                        
                                                        //replaces the old value
							getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
							renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY);
							getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
							PlayerSelectionMethod(i);
							return;
						}

						// 2 player pushing mapping with even northwest
						if (indexx == recentcoordinatex - 1 && indexy == recentcoordinatey - 2
								&& board[indexx + 1][indexy + 2] == i && board[indexx][indexy + 1] == i
								&& board[indexx][indexy] != i && board[indexx][indexy] != EMPTY
								&& board[indexx - 1][indexy - 1] == EMPTY && recentcoordinatey % 2 == 0) {
                                                        //copies the value into a new one that's being pushed
							board[indexx - 1][indexy - 1] = board[indexx][indexy];
							renders[indexx - 1][indexy - 1] = new Piece(board[indexx - 1][indexy - 1]);
							getChildren().add(renders[indexx - 1][indexy - 1]);
                                                        
                                                        //replaces the pushed value and the current one
							board[indexx][indexy] = i;
							board[recentcoordinatex][recentcoordinatey] = EMPTY;
							getChildren().remove(renders[indexx][indexy]);
							renders[indexx][indexy] = new Piece(i);
							getChildren().add(renders[indexx][indexy]);
                                                        
                                                        //removes the old value
							getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
							renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY);
							getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
							PlayerSelectionMethod(i); //calls the player selection method with the old values
							return;
						}

						// 2 player pushing mapping with ODD southeast
						if (indexx == recentcoordinatex + 1 && indexy == recentcoordinatey + 2
								&& board[indexx - 1][indexy - 2] == i && board[indexx][indexy - 1] == i
								&& board[indexx][indexy] != i && board[indexx][indexy] != EMPTY
								&& board[indexx - 1][indexy - 1] == EMPTY && recentcoordinatey % 2 != 0) {
                                                         //copies the values old value that's being pushed in a new one
							board[indexx + 1][indexy + 1] = board[indexx][indexy];
							renders[indexx + 1][indexy + 1] = new Piece(board[indexx + 1][indexy + 1]);
							getChildren().add(renders[indexx + 1][indexy + 1]);
                                                        //changes the old value with the new one current one
							board[indexx][indexy] = i;
							board[recentcoordinatex][recentcoordinatey] = EMPTY;
							getChildren().remove(renders[indexx][indexy]);
							renders[indexx][indexy] = new Piece(i);
							getChildren().add(renders[indexx][indexy]);
                                                        //removes the old value with empty
							getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
							renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY);
							getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
							PlayerSelectionMethod(i);
							return;
						}

						// 2 player pushing mapping with ODD southwest
						if (indexx == recentcoordinatex - 1 && indexy == recentcoordinatey + 2
								&& board[indexx + 1][indexy - 2] == i && board[indexx + 1][indexy - 1] == i
								&& board[indexx][indexy] != i && board[indexx][indexy] != EMPTY
								&& board[indexx][indexy + 1] == EMPTY && recentcoordinatey % 2 != 0) {

							board[indexx][indexy + 1] = board[indexx][indexy];
							renders[indexx][indexy + 1] = new Piece(board[indexx][indexy + 1]);
							getChildren().add(renders[indexx][indexy + 1]);

							board[indexx][indexy] = i;
							board[recentcoordinatex][recentcoordinatey] = EMPTY;
							getChildren().remove(renders[indexx][indexy]);
							renders[indexx][indexy] = new Piece(i);
							getChildren().add(renders[indexx][indexy]);

							getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
							renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY);
							getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
							PlayerSelectionMethod(i);
							return;
						}

						// 2 player pushing mapping with ODD east
						if (indexx == recentcoordinatex + 2 && indexy == recentcoordinatey
								&& board[indexx - 2][indexy] == i && board[indexx - 1][indexy] == i
								&& board[indexx][indexy] != i && board[indexx][indexy] != EMPTY
								&& board[indexx + 1][indexy] == EMPTY && recentcoordinatey % 2 != 0) {

							board[indexx + 1][indexy] = board[indexx][indexy];
							renders[indexx + 1][indexy] = new Piece(board[indexx + 1][indexy]);
							getChildren().add(renders[indexx + 1][indexy]);

							board[indexx][indexy] = i;
							board[recentcoordinatex][recentcoordinatey] = EMPTY;
							getChildren().remove(renders[indexx][indexy]);
							renders[indexx][indexy] = new Piece(i);
							getChildren().add(renders[indexx][indexy]);

							getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
							renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY);
							getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
							PlayerSelectionMethod(i);
							return;
						}

						// 2 player pushing mapping with ODD west
						if (indexx == recentcoordinatex - 2 && indexy == recentcoordinatey
								&& board[indexx + 2][indexy] == i && board[indexx + 1][indexy] == i
								&& board[indexx][indexy] != i && board[indexx][indexy] != EMPTY
								&& board[indexx - 1][indexy] == EMPTY && recentcoordinatey % 2 != 0) {

							board[indexx - 1][indexy] = board[indexx][indexy];
							renders[indexx - 1][indexy] = new Piece(board[indexx - 1][indexy]);
							getChildren().add(renders[indexx - 1][indexy]);

							board[indexx][indexy] = i;
							board[recentcoordinatex][recentcoordinatey] = EMPTY;
							getChildren().remove(renders[indexx][indexy]);
							renders[indexx][indexy] = new Piece(i);
							getChildren().add(renders[indexx][indexy]);

							getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
							renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY);
							getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
							PlayerSelectionMethod(i);
							return;
						}

						// 2 player pushing mapping with ODD northeast
						if (indexx == recentcoordinatex + 1 && indexy == recentcoordinatey - 2
								&& board[indexx - 1][indexy + 2] == i && board[indexx][indexy + 1] == i
								&& board[indexx][indexy] != i && board[indexx][indexy] != EMPTY
								&& board[indexx + 1][indexy - 1] == EMPTY && recentcoordinatey % 2 != 0) {

							board[indexx + 1][indexy - 1] = board[indexx][indexy];
							renders[indexx + 1][indexy - 1] = new Piece(board[indexx + 1][indexy - 1]);
							getChildren().add(renders[indexx + 1][indexy - 1]);

							board[indexx][indexy] = i;
							board[recentcoordinatex][recentcoordinatey] = EMPTY;
							getChildren().remove(renders[indexx][indexy]);
							renders[indexx][indexy] = new Piece(i);
							getChildren().add(renders[indexx][indexy]);

							getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
							renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY);
							getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
							PlayerSelectionMethod(i);
							return;
						}

						// 2 player pushing mapping with ODD northeast
						if (indexx == recentcoordinatex - 1 && indexy == recentcoordinatey - 2
								&& board[indexx + 1][indexy + 2] == i && board[indexx + 1][indexy + 1] == i
								&& board[indexx][indexy] != i && board[indexx][indexy] != EMPTY
								&& board[indexx][indexy - 1] == EMPTY && recentcoordinatey % 2 != 0) {

							board[indexx][indexy - 1] = board[indexx][indexy];
							renders[indexx][indexy - 1] = new Piece(board[indexx][indexy - 1]);
							getChildren().add(renders[indexx][indexy - 1]);

							board[indexx][indexy] = i;
							board[recentcoordinatex][recentcoordinatey] = EMPTY;
							getChildren().remove(renders[indexx][indexy]);
							renders[indexx][indexy] = new Piece(i);
							getChildren().add(renders[indexx][indexy]);

							getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
							renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY);
							getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
							PlayerSelectionMethod(i);
							return;
						}

						// 2 player pushing mapping with ODD northeast
						if (indexx == recentcoordinatex - 1 && indexy == recentcoordinatey - 2
								&& board[indexx + 1][indexy + 2] == i && board[indexx + 1][indexy + 1] == i
								&& board[indexx][indexy] != i && board[indexx][indexy] != EMPTY
								&& board[indexx][indexy - 1] == EMPTY && recentcoordinatey % 2 != 0) {

							board[indexx][indexy - 1] = board[indexx][indexy];
							renders[indexx][indexy - 1] = new Piece(board[indexx][indexy - 1]);
							getChildren().add(renders[indexx][indexy - 1]);

							board[indexx][indexy] = i;
							board[recentcoordinatex][recentcoordinatey] = EMPTY;
							getChildren().remove(renders[indexx][indexy]);
							renders[indexx][indexy] = new Piece(i);
							getChildren().add(renders[indexx][indexy]);

							getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
							renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY);
							getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
							PlayerSelectionMethod(i);
							return;
						}

						// 2 player freeflowing mapping with Even northeast
						if (indexx == recentcoordinatex - 1 && indexy == recentcoordinatey - 2
								&& board[recentcoordinatex][recentcoordinatey] == i
								&& board[recentcoordinatex - 1][recentcoordinatey - 1] == i
								&& board[indexx][indexy] == EMPTY && recentcoordinatey % 2 == 0) {

							board[indexx][indexy] = i;
							board[recentcoordinatex][recentcoordinatey] = EMPTY;
							getChildren().remove(renders[indexx][indexy]);
							renders[indexx][indexy] = new Piece(i);
							getChildren().add(renders[indexx][indexy]);

							getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
							renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY);
							getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
							PlayerSelectionMethod(i);
							return;
						}

						// 2 player freeflowing mapping with Even northeast
						if (indexx == recentcoordinatex - 1 && indexy == recentcoordinatey - 2
								&& board[recentcoordinatex][recentcoordinatey] == i
								&& board[recentcoordinatex - 1][recentcoordinatey - 1] == i
								&& board[indexx][indexy] == EMPTY && recentcoordinatey % 2 == 0) {

							board[indexx][indexy] = i;
							board[recentcoordinatex][recentcoordinatey] = EMPTY;
							getChildren().remove(renders[indexx][indexy]);
							renders[indexx][indexy] = new Piece(i);
							getChildren().add(renders[indexx][indexy]);

							getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
							renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY);
							getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
							PlayerSelectionMethod(i);
							return;
						}

						// 2 player freeflowing mapping with Even northwest
						if (indexx == recentcoordinatex + 1 && indexy == recentcoordinatey - 2
								&& board[recentcoordinatex][recentcoordinatey] == i
								&& board[recentcoordinatex][recentcoordinatey - 1] == i
								&& board[indexx][indexy] == EMPTY && recentcoordinatey % 2 == 0) {

							board[indexx][indexy] = i;
							board[recentcoordinatex][recentcoordinatey] = EMPTY;
							getChildren().remove(renders[indexx][indexy]);
							renders[indexx][indexy] = new Piece(i);
							getChildren().add(renders[indexx][indexy]);

							getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
							renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY);
							getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
							PlayerSelectionMethod(i);
							return;
						}

						// 2 player freeflowing mapping with Even west
						if (indexx == recentcoordinatex - 2 && indexy == recentcoordinatey
								&& board[recentcoordinatex][recentcoordinatey] == i
								&& board[recentcoordinatex - 1][recentcoordinatey] == i
								&& board[indexx][indexy] == EMPTY && recentcoordinatey % 2 == 0) {

							board[indexx][indexy] = i;
							board[recentcoordinatex][recentcoordinatey] = EMPTY;
							getChildren().remove(renders[indexx][indexy]);
							renders[indexx][indexy] = new Piece(i);
							getChildren().add(renders[indexx][indexy]);

							getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
							renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY);
							getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
							PlayerSelectionMethod(i);
							return;
						}

						// 2 player freeflowing mapping with Even west
						if (indexx == recentcoordinatex + 2 && indexy == recentcoordinatey
								&& board[recentcoordinatex][recentcoordinatey] == i
								&& board[recentcoordinatex + 1][recentcoordinatey] == i
								&& board[indexx][indexy] == EMPTY && recentcoordinatey % 2 == 0) {

							board[indexx][indexy] = i;
							board[recentcoordinatex][recentcoordinatey] = EMPTY;
							getChildren().remove(renders[indexx][indexy]);
							renders[indexx][indexy] = new Piece(i);
							getChildren().add(renders[indexx][indexy]);

							getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
							renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY);
							getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
							PlayerSelectionMethod(i);
							return;
						}

						// 2 player freeflowing mapping with Even east
						if (indexx == recentcoordinatex + 2 && indexy == recentcoordinatey
								&& board[recentcoordinatex][recentcoordinatey] == i
								&& board[recentcoordinatex + 1][recentcoordinatey] == i
								&& board[indexx][indexy] == EMPTY && recentcoordinatey % 2 == 0) {

							board[indexx][indexy] = i;
							board[recentcoordinatex][recentcoordinatey] = EMPTY;
							getChildren().remove(renders[indexx][indexy]);
							renders[indexx][indexy] = new Piece(i);
							getChildren().add(renders[indexx][indexy]);

							getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
							renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY);
							getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
							PlayerSelectionMethod(i);
							return;
						}

						// 2 player freeflowing mapping with Even northeast
						if (indexx == recentcoordinatex - 1 && indexy == recentcoordinatey + 2
								&& board[recentcoordinatex][recentcoordinatey] == i
								&& board[recentcoordinatex - 1][recentcoordinatey + 1] == i
								&& board[indexx][indexy] == EMPTY && recentcoordinatey % 2 == 0) {

							board[indexx][indexy] = i;
							board[recentcoordinatex][recentcoordinatey] = EMPTY;
							getChildren().remove(renders[indexx][indexy]);
							renders[indexx][indexy] = new Piece(i);
							getChildren().add(renders[indexx][indexy]);

							getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
							renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY);
							getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
							PlayerSelectionMethod(i);
							return;
						}

						// 2 player freeflowing mapping with Even northwest
						if (indexx == recentcoordinatex - 1 && indexy == recentcoordinatey - 2
								&& board[recentcoordinatex][recentcoordinatey] == i
								&& board[recentcoordinatex][recentcoordinatey + 1] == i
								&& board[indexx][indexy] == EMPTY && recentcoordinatey % 2 == 0) {

							board[indexx][indexy] = i;
							board[recentcoordinatex][recentcoordinatey] = EMPTY;
							getChildren().remove(renders[indexx][indexy]);
							renders[indexx][indexy] = new Piece(i);
							getChildren().add(renders[indexx][indexy]);

							getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
							renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY);
							getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
							PlayerSelectionMethod(i);
							return;
						}

						// 2 player freeflowing mapping with ODD northwest
						if (indexx == recentcoordinatex - 1 && indexy == recentcoordinatey - 2
								&& board[recentcoordinatex][recentcoordinatey] == i
								&& board[recentcoordinatex][recentcoordinatey - 1] == i
								&& board[indexx][indexy] == EMPTY && recentcoordinatey % 2 != 0) {

							board[indexx][indexy] = i;
							board[recentcoordinatex][recentcoordinatey] = EMPTY;
							getChildren().remove(renders[indexx][indexy]);
							renders[indexx][indexy] = new Piece(i);
							getChildren().add(renders[indexx][indexy]);

							getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
							renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY);
							getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
							PlayerSelectionMethod(i);
							return;
						}

						// 2 player freeflowing mapping with ODD northeast
						if (indexx == recentcoordinatex + 1 && indexy == recentcoordinatey - 2
								&& board[recentcoordinatex][recentcoordinatey] == i
								&& board[recentcoordinatex + 1][recentcoordinatey - 1] == i
								&& board[indexx][indexy] == EMPTY && recentcoordinatey % 2 != 0) {
							board[indexx][indexy] = i;
							board[recentcoordinatex][recentcoordinatey] = EMPTY;
							getChildren().remove(renders[indexx][indexy]);
							renders[indexx][indexy] = new Piece(i);
							getChildren().add(renders[indexx][indexy]);

							getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
							renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY);
							getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
							PlayerSelectionMethod(i);
							return;
						}

						// 2 player freeflowing mapping with ODD east
						if (indexx == recentcoordinatex + 2 && indexy == recentcoordinatey
								&& board[recentcoordinatex][recentcoordinatey] == i
								&& board[recentcoordinatex + 1][recentcoordinatey] == i
								&& board[indexx][indexy] == EMPTY && recentcoordinatey % 2 != 0) {
							board[indexx][indexy] = i;
							board[recentcoordinatex][recentcoordinatey] = EMPTY;
							getChildren().remove(renders[indexx][indexy]);
							renders[indexx][indexy] = new Piece(i);
							getChildren().add(renders[indexx][indexy]);

							getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
							renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY);
							getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
							PlayerSelectionMethod(i);
							return;
						}

						// 2 player freeflowing mapping with ODD west
						if (indexx == recentcoordinatex - 2 && indexy == recentcoordinatey
								&& board[recentcoordinatex][recentcoordinatey] == i
								&& board[recentcoordinatex - 1][recentcoordinatey] == i
								&& board[indexx][indexy] == EMPTY && recentcoordinatey % 2 != 0) {
							board[indexx][indexy] = i;
							board[recentcoordinatex][recentcoordinatey] = EMPTY;
							getChildren().remove(renders[indexx][indexy]);
							renders[indexx][indexy] = new Piece(i);
							getChildren().add(renders[indexx][indexy]);

							getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
							renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY);
							getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
							PlayerSelectionMethod(i);
							return;
						}

						// 2 player freeflowing mapping with ODD Southwest
						if (indexx == recentcoordinatex - 1 && indexy == recentcoordinatey + 2
								&& board[recentcoordinatex][recentcoordinatey] == i
								&& board[recentcoordinatex][recentcoordinatey + 1] == i
								&& board[indexx][indexy] == EMPTY && recentcoordinatey % 2 != 0) {
							board[indexx][indexy] = i;
							board[recentcoordinatex][recentcoordinatey] = EMPTY;
							getChildren().remove(renders[indexx][indexy]);
							renders[indexx][indexy] = new Piece(i);
							getChildren().add(renders[indexx][indexy]);

							getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
							renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY);
							getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
							PlayerSelectionMethod(i);
							return;
						}

						// 2 player freeflowing mapping with ODD Southwest
						if (indexx == recentcoordinatex + 1 && indexy == recentcoordinatey + 2
								&& board[recentcoordinatex][recentcoordinatey] == i
								&& board[recentcoordinatex + 1][recentcoordinatey + 1] == i
								&& board[indexx][indexy] == EMPTY && recentcoordinatey % 2 != 0) {
							board[indexx][indexy] = i;
							board[recentcoordinatex][recentcoordinatey] = EMPTY;
							getChildren().remove(renders[indexx][indexy]);
							renders[indexx][indexy] = new Piece(i);
							getChildren().add(renders[indexx][indexy]);

							getChildren().remove(renders[recentcoordinatex][recentcoordinatey]);
							renders[recentcoordinatex][recentcoordinatey] = new Piece(EMPTY);
							getChildren().add(renders[recentcoordinatex][recentcoordinatey]);
							PlayerSelectionMethod(i);
							return;
						}
					}
					System.out.println("ERROR ILEGAL MOVE"); //prints out if wasn't a validated
				} else {
                                        //this is the system we used in order to display the current player
					if (current_player == PLAYER1) {
						System.out.println("Select a piece PLAYER1 You are RED!");
					} else if (current_player == PLAYER2) {
						System.out.println("Select a piece PLAYER2 You are BLUE!");
					} else if (current_player == PLAYER3) {
						System.out.println("Select a piece PLAYER3 You are MAGETA!");
					} else if (current_player == PLAYER4) {
						System.out.println("Select a piece PLAYER4 You are CYAN!");
					}
				}
			}

		}

		else { // Part of the win method
			System.out.println("GAME IS OVER!");
		}
	}
        
        //this method takes points add them to the current player
	public void AddPoints(int n) {
		if (current_player == PLAYER1) {
			PLAYER1Points = PLAYER1Points + n;
			System.out.println("PLAYER1Points: " + PLAYER1Points);
		} else if (current_player == PLAYER2) {
			PLAYER2Points = PLAYER2Points + n;
			System.out.println("PLAYER2Points: " + PLAYER2Points);
		} else if (current_player == PLAYER3) {
			PLAYER3Points = PLAYER3Points + n;
			System.out.println("PLAYER3Points: " + PLAYER3Points);
		} else if (current_player == PLAYER4) {
			PLAYER4Points = PLAYER4Points + n;
			System.out.println("PLAYER3Points: " + PLAYER4Points);
		}
	}

	// Dynamic player selection method && Win Condition method call
	public void PlayerSelectionMethod(int currentPlayer) {
                
                //Increase the counter for total completed moves
		totalcompletedmoves = totalcompletedmoves+1;
		
		// System.out.println("PlayerSelectionMethod method current_player: " +
		// current_player); Debugger
		if (currentPlayer == PLAYER1) { // PLAYER1 CASE
			if (player == 2 || player == 3 || player == 4) { // PLAYER1 CASE
				if (PLAYER1Points == 6) { // This is Player 1 case with 2 player
											// selection
					wincondition(PLAYER1);//calls wincontion method
				}
				current_player = PLAYER2; //set the current player to 2
				selection = false; //change the state of the selection to false
				return;

			}
		}

		if (currentPlayer == PLAYER2) { // Player2 Case
			if (player == 2) { // PLAYER2 CASE for two players
				if (PLAYER2Points == 6) { // This is Player 1 case with 2 player
											// selection
					wincondition(PLAYER2);//calling wincondion
				}
				current_player = PLAYER1;//set player current player to one
				selection = false;// PLAYER2 CASE for two players
				return;
			}

			if (player == 3 || player == 4) { // PLAYER2 CASE for three players
												// or four players
				if (PLAYER2Points == 6) { // This is Player 1 case with 3 player
											// selection
					wincondition(PLAYER2);
				}
				current_player = PLAYER3;
				selection = false;// PLAYER2 CASE for three players
				return;
			}
		}
		if (currentPlayer == PLAYER3) { // Player3 Case
			if (player == 3) { // PLAYER2 CASE for three players
				if (PLAYER3Points == 6) { // This is Player 1 case with 2 player
											// selection
					wincondition(PLAYER3);
				}
				current_player = PLAYER1;
				selection = false;// PLAYER2 CASE for two players
				return;
			} else if (player == 4) {
				if (PLAYER3Points == 6) { // This is Player 3 case with 4 player
					// selection
					wincondition(PLAYER3);
				}
				current_player = PLAYER4;
				selection = false;// PLAYER4 CASE for two players
				return;
			}
		}
		if (currentPlayer == PLAYER4) { // Player4 Case
			if (PLAYER4Points == 6) { // player4 case
				wincondition(PLAYER4);
			}
			current_player = PLAYER1;
			selection = false;// PLAYER2 CASE for two players
			return;

		}

	}
        
        //Displays the Player's points and the completed moves 
	public void displayCurrentPoints() {
		System.out.println("THE SCORE OF THIS CURRENT GAME");
		System.out.println("PLAYER1: " + PLAYER1Points);
		System.out.println("PLAYER2: " + PLAYER2Points);
		System.out.println("PLAYER3: " + PLAYER3Points);
		System.out.println("PLAYER4: " + PLAYER4Points);
		System.out.println("TOTAL COMPLETED MOVES in this current game: " + totalcompletedmoves);
		return;
	}
        
        //the win concontion method
	public void wincondition(int Winner) {
                //makes it easier to see
                System.out.println("************************************************");
		if (Winner == PLAYER1) {
			WIN = true; //sets the boolean to true
			System.out.println("Player 1 is the winner");
			displayCurrentPoints(); //displays the status of the game

		} else if (Winner == PLAYER2) {
			WIN = true;//sets the boolean to true
			System.out.println("Player 2 is the winner");
			displayCurrentPoints();//displays the status of the game
		} else if (Winner == PLAYER3) {
			WIN = true;//sets the boolean to true
			System.out.println("Player 3 is the winner");
			displayCurrentPoints();//displays the status of the game
		} else {
			WIN = true;//sets the boolean to true
			System.out.print("Player 4 is the winner");
			displayCurrentPoints();//displays the status of the game
		}
		;
	}

	// private fields of the class
	private int[][] board; // array that holds all pieces
	private Piece[][] renders; // array that holds all the render pieces
	private double cell_width, cell_height; // width and height of a cell
	public int current_player; // who is the current player

	// constants for the class RENDERS
	private final int EMPTY = 1;
	private final int PLAYER1 = 2;
	private final int PLAYER2 = 3;
	private final int PLAYER3 = 4;
	private final int PLAYER4 = 5;
	
        //variable that is picked when the program 
        //runs how many current players the are
        private int player;

	// Players points
	static int PLAYER1Points;
	static int PLAYER2Points;
	static int PLAYER3Points;
	static int PLAYER4Points;
	
        //Win condition boolean
        static boolean WIN;
        
        //variable to store the selected pieces
	int recentcoordinatex;
	int recentcoordinatey;
        
        //counter for the total moves
	int totalcompletedmoves;
        
        //Boolean that hold if the piece has been selected
	boolean selection;
}
