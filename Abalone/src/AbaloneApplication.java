// JavaFX example that showcases how to build an entirely custom control
// that fits into the JavaFX model.
// imports
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// class definition
public class AbaloneApplication extends Application {

	// overridden init method
	@Override
	public void init() {
		// initialise the stack pane
		sp_mainlayout = new StackPane();


	}

	// overridden start method
	public void start(Stage primaryStage) {
		

		// set a size, title and a scene on the main window. show it when
		// ready
		primaryStage.setTitle("Abalone Game");
		
		mainStage = new Scene(sp_mainlayout, 800, 600);
		// sp_mainlayout.getStylesheets().add("Style.css");
		
		VBox layout = new VBox(20);
		layout.setPadding(new Insets(100));
		Welcomescene = new Scene(layout, 500, 600);
		Label label1 = new Label("Welcome to Abalone!");
		Label label2 = new Label("PLEASE SELECT THE NUMBER OF PLAYERS");

		// Create buttons
		Button Play2 = new Button("2 PLAYERS");
		Button Play3 = new Button("3 PLAYERS");
		Button Play4 = new Button("4 PLAYERS");
	
		layout.getChildren().addAll(label1, label2, Play2, Play3, Play4);
		primaryStage.setScene(Welcomescene);
		primaryStage.show();
		

		// Clicking will set the players
		Play2.setOnAction(e -> { // lamba expression this button will pass 2 to
									// the custom control and intitlize it
			cc_custom = new CustomControl(2);
			sp_mainlayout.getChildren().add(cc_custom);
			primaryStage.setScene(mainStage); // change sceen
		});
		Play3.setOnAction(e -> {
			cc_custom = new CustomControl(3);
			sp_mainlayout.getChildren().add(cc_custom);
			primaryStage.setScene(mainStage);
		});
		Play4.setOnAction(e -> {
			cc_custom = new CustomControl(4);
			sp_mainlayout.getChildren().add(cc_custom);
			primaryStage.setScene(mainStage);

		});

	}

	// overridden stop method
	public void stop() {
	}

	// entry point into our program to launch our JavaFX application
	public static void main(String[] args) {
		launch(args);
	}

	// private fields for this class
	private StackPane sp_mainlayout;
	private CustomControl cc_custom;

	// two screens variables
	Scene mainStage, Welcomescene;
}
