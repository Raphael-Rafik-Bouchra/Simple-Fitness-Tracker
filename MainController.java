package controller;


import gui.Home;
import gui.Results;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainController extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Simple Fitness Tracker");
		
		Home home = new Home(primaryStage);
		home.prepareHomeScene();
		
		
		Results result = new Results(primaryStage);
		result.setHome(home);
		
		home.setResults(result);


		
		primaryStage.setScene(home.getHomeScene());
	
		primaryStage.show();
		
		
		
	}

}
