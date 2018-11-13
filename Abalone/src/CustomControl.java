
//implementation of a custom control for javafx
//imports for the class
import javafx.event.EventHandler;
import javafx.scene.control.Control;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

//class definition for a custom control
class CustomControl extends Control {
	// constructor for the class
	public CustomControl(int player) {
		
		this.player = player;
		// set a default skin and generate a game board
		setSkin(new CustomControlSkin(this));
		AbaloneBoard = new AbaloneBoard(player);
		getChildren().add(AbaloneBoard);

		// add a mouse clicked listener that will try to place a piece
		setOnMouseClicked(new EventHandler<MouseEvent>() {
			// overridden handle method
			@Override
			public void handle(MouseEvent event) {
				AbaloneBoard.placePiece(event.getX(), event.getY());
			}
		});

		setOnKeyPressed(new EventHandler<KeyEvent>() {
			// overridden handle method
			@Override
			public void handle(KeyEvent event) {
				if (event.getCode() == KeyCode.SPACE)
					AbaloneBoard.initialization();
			}
		});

	}

	// override the resize method
	@Override
	public void resize(double width, double height) {
		// update the size of the rectangle
		super.resize(width, height);
		AbaloneBoard.resize(width, height);
	}

	// private fields of the class
	private AbaloneBoard AbaloneBoard;
	private int player;
}
