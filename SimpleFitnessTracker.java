package activities;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class SimpleFitnessTracker extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Simple Fitness Tracker");
		
		Image backgroundImage = new Image("file:Background.jpg");
		ImageView mv = new ImageView(backgroundImage);
		Group root = new Group();
		root.getChildren().addAll(mv);
		
		
		Scene primaryScene = new Scene(root , 1418 , 948);
		primaryStage.setScene(primaryScene);
		primaryStage.setResizable(false);
		
		
		
		
		
		primaryStage.show();
		
	}

}
