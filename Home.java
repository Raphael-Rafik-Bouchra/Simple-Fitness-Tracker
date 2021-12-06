package gui;

import activities.Activity;
import activities.KickBoxing;
import activities.Running;
import activities.StrengthTraining;
import activities.Swimming;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;

public class Home {
	private int activitiesCounter=0;
	private Activity [] list = new Activity[20];
	Scene homeScene;
	Results results;
	Stage stage;
	
	public Home(Stage stage) {
		this.stage = stage;
	}
	
	public void prepareHomeScene() {
		
		String activities[] = { "Running" , "Swimming" , "Kick Boxing" , "Stength Training"};
		 ComboBox<String> activitiesCombobox = new ComboBox<String>(FXCollections.observableArrayList(activities));
		 Label activitiesLabel = new Label("Activity");
		 Label minutesLabel = new Label("Time (Minutes)");
		 Label confirmation = new Label();
		 Button addButton = new Button("Add Activity");
		 Button showResultsButton = new Button("Show Results");
		 
		 final Spinner<Integer> minutesSpinner = new Spinner<Integer>();
	        final int initialValue = 0;
	        SpinnerValueFactory<Integer> valueFactory = //
	                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 1000, initialValue);
	        minutesSpinner.setValueFactory(valueFactory);
		 
		 GridPane grid = new GridPane();
		 grid.add(activitiesLabel, 0, 0);
		 grid.add(minutesLabel, 1, 0);
		 grid.add(activitiesCombobox, 0, 1);
		 grid.add(minutesSpinner, 1, 1);
		 grid.add(addButton, 0, 2);
		 grid.add(showResultsButton, 1, 2);
		 grid.add(confirmation, 0, 3);
		 
		 
		 
		 EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if(activitiesCounter < 20) {

				String activity = activitiesCombobox.getValue();
				int minutes = minutesSpinner.getValue();
				
				if(activity == "Running") {
					Activity act = new Running();
					act.setMinutes(minutes);
					list[activitiesCounter] = act;
					activitiesCounter++;
					confirmation.setText("Activity has been \nadded successfully");
				}
				else if(activity == "Swimming") {
					Activity act = new Swimming();
					act.setMinutes(minutes);
					list[activitiesCounter] = act;
					activitiesCounter++;
					confirmation.setText("Activity has been \nadded successfully");
				}
				else if(activity == "Kick Boxing") {
					Activity act = new KickBoxing();
					act.setMinutes(minutes);
					list[activitiesCounter] = act;
					activitiesCounter++;
					confirmation.setText("Activity has been \nadded successfully");
				}
				else if(activity == "Stength Training") {
					Activity act = new StrengthTraining();
					act.setMinutes(minutes);
					list[activitiesCounter] = act;
					activitiesCounter++;
					confirmation.setText("Activity has been \nadded successfully");
				}
				else {
					confirmation.setText("Error Undefined Activity");
				}
			}
				else {
					confirmation.setText("Error max number \nof activities is 20");
				}
			}	 
		};
		
		addButton.setOnAction(event);
		
		EventHandler<ActionEvent> event2 = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if(activitiesCounterGetter() != 0) {
					results.prepareResultsScene();
					stage.setScene(results.getResultScene());
				}
				else {
					confirmation.setText("Error Empty Activity List");
				}
			}
		};
		
		showResultsButton.setOnAction(event2);
		
		
	homeScene = new Scene(grid , 600 , 400);
	}
	
	
	public Scene getHomeScene() {
		return this.homeScene;
	}
	
	public int activitiesCounterGetter() {
		return this.activitiesCounter;
	}
	public Activity[] listGetter() {
		return this.list;
	}




	public void setResults(Results results) {
		this.results = results;
	}

	public Results getResults() {
		return results;
	}
	


}
