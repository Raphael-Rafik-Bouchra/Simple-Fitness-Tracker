package gui;

import activities.Activity;
import activities.Sorting;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Results {
	private double currentHeartRate=80;
	private int totalCaloriesBurnt=0;
	private Home home;
	private Activity [] list;
	private Activity [] sortedList;
	TableView<PrintedActivities> table;
	Scene resultsScene;
	Stage stage;
	
	public Results(Stage stage) {
		this.stage = stage;
	}
	
	private void makeCalculations() {
		int counter = home.activitiesCounterGetter();
		list = new Activity[20];
		setList(home.listGetter());
		int i;
		for(i=0 ; i < counter ; i++) {
			list[i].setHeartRate(currentHeartRateGetter());
			list[i].caloriesBurnt();
			list[i].heartRateIncrease();
			totalCaloriesBurnt += list[i].getCaloriesBurnt();
			currentHeartRateSetter(list[i].getHeartRate());
			
		}
		
		sortedList = new Activity[20];
		Sorting sort = new Sorting();
		setSortedList(sort.sortActivities(getList() , counter));
	}
	

	public void prepareResultsScene() {
		makeCalculations();
		Sorting rounding = new Sorting();
		Label totalCaloriesBurntLabel = new Label("Total Calories Burnt =" + totalCaloriesBurnt + "(Calories)");
		Label totalHeartRateLabel = new Label("Total Heart Rate =" + rounding.round(currentHeartRate, 3) + "(Beats/Minute)");
	
		
		TableColumn< PrintedActivities , String > nameColumn = new TableColumn<>("Activity");
		nameColumn.setMinWidth(100);
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("printedActivityName"));
		
		TableColumn<  PrintedActivities , Integer > caloriesColumn = new TableColumn<>("Calories Burnt (Calories)");
		caloriesColumn.setMinWidth(200);
		caloriesColumn.setCellValueFactory(new PropertyValueFactory<>("printedCaloriesBurnt"));
		
		TableColumn<  PrintedActivities , Double> heartColumn = new TableColumn<>("Heart Rate Increase (Beats/Minute)");
		heartColumn.setMinWidth(300);
		heartColumn.setCellValueFactory(new PropertyValueFactory<>("printedHeartRateIncrease"));
		
		
		table = new TableView<PrintedActivities>();
		table.setItems(getActivities());
		table.getColumns().add(nameColumn);
		table.getColumns().add(caloriesColumn);
		table.getColumns().add(heartColumn);
		//table.getColumns().addAll(nameColumn , caloriesColumn , heartColumn );
		
		GridPane grid = new GridPane();
		grid.add(totalCaloriesBurntLabel, 0, 0);
		grid.add(totalHeartRateLabel, 0, 1);
		grid.add(table, 0, 2);
		

		resultsScene = new Scene(grid , 600 , 400);
	}
	
	public ObservableList<PrintedActivities> getActivities(){
		ObservableList<PrintedActivities> activities = FXCollections.observableArrayList();
		int i;
		int counter = home.activitiesCounterGetter();
		Sorting rounding = new Sorting();
		for(i=0 ; i < counter ; i++) {
		activities.add(new PrintedActivities(sortedList[i].getName(), sortedList[i].getCaloriesBurnt(), rounding.round(sortedList[i].getHeartRateIncrease(), 3)));
		}
		return activities;
		
	}
	
	public void currentHeartRateSetter(double currentHeartRate) {
		this.currentHeartRate = currentHeartRate;
	}
	public double currentHeartRateGetter() {
		return this.currentHeartRate;
	}
	public void totalCaloriesBurntSetter(int totalCaloriesBurnt) {
		this.totalCaloriesBurnt = totalCaloriesBurnt;
	}
	public int totalCaloriesBurntGetter() {
		return this.totalCaloriesBurnt;
	}


	public Home getHome() {
		return home;
	}


	public void setHome(Home home) {
		this.home = home;
	}


	public Activity [] getSortedList() {
		return sortedList;
	}


	public void setSortedList(Activity [] sortedList) {
		this.sortedList = sortedList;
	}
	
	public Scene getResultScene() {
		return this.resultsScene;
	}

	public Activity[] getList() {
		return list;
	}

	public void setList(Activity[] list) {
		this.list = list;
	}

}
