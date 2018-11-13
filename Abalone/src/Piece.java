import javafx.geometry.Insets;
//implementation of an XO Piece
//imports required for this class
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.transform.Translate;

// class definition for an X or O piece
class Piece extends Group {
	// constructor for the class
	public Piece(int type) {
		// create a new translate object and take a copy of the type
		pos = new Translate();
		this.type = type;

		// choose which piece type we have 
		if (type == 1) {     //TYPE 1 is EMPTY
			// we have an Empty piece generate a Ellipse fills and renders
			e = new Ellipse();
			getChildren().addAll(e);
			e.getTransforms().add(pos);
			e.setFill(Color.WHITE);
		} 
		
		else if (type == 2) {
			// we have an player1 piece generate a Ellipse fills and renders
			e = new Ellipse();
			getChildren().addAll(e);
			e.getTransforms().add(pos);
			e.setFill(Color.RED);
		} else if (type == 3) {
			// we have an player2 piece generate a Ellipse fills and renders
			e = new Ellipse();
			getChildren().addAll(e);
			e.getTransforms().add(pos);
			e.setFill(Color.BLUE);
		} else if (type == 4) {
			// we have an player3 piece generate a Ellipse fills and renders
			e = new Ellipse();
			getChildren().addAll(e);
			e.getTransforms().add(pos);
			e.setFill(Color.MAGENTA);
		} else if (type == 5) {
			// we have an player4 piece generate a Ellipse fills and renders
			e = new Ellipse();
			getChildren().addAll(e);
			e.getTransforms().add(pos);
			e.setFill(Color.CYAN);
		} 

	}

	// overridden version of the resize method
	@Override
	public void resize(double width, double height) {
		// call the super class method
		super.resize(width, height);

		// update depending on the type
		if (type == 1) {
			// resize the lines
			e.setCenterX(width / 2);
			e.setCenterY(height / 2);
			e.setRadiusX(width / 2);
			e.setRadiusY(height / 2);
		} else {
			// recenter the ellipse// and update the radi
			e.setCenterX(width / 2);
			e.setCenterY(height / 2);
			e.setRadiusX(width / 2);
			e.setRadiusY(height / 2);
		}

	}

	// overridden version of the relocate method
	@Override
	public void relocate(double x, double y) {
		// call the superclass method and update the position
		super.relocate(x, y);
		pos.setX(x);
		pos.setY(y);
	}

	// private fields of the class
	private Ellipse e; // ellipse for rendering the all piece
	private int type; // maintain a copy of the piece type we have
	private Translate pos; // translate that set the position of this piece

}
