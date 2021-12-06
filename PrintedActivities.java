package gui;

public class PrintedActivities {
	private String printedActivityName;
	private int printedCaloriesBurnt;
	private double printedHeartRateIncrease;

	public PrintedActivities(String name , int caloriesBurnt , double heartRateIncrease) {
		this.printedActivityName = name;
		this.printedCaloriesBurnt = caloriesBurnt;
		this.printedHeartRateIncrease = heartRateIncrease;
	}

	public String getPrintedActivityName() {
		return printedActivityName;
	}

	public void setPrintedActivityName(String printedActivityName) {
		this.printedActivityName = printedActivityName;
	}

	public int getPrintedCaloriesBurnt() {
		return printedCaloriesBurnt;
	}

	public void setPrintedCaloriesBurnt(int printedCaloriesBurnt) {
		this.printedCaloriesBurnt = printedCaloriesBurnt;
	}

	public double getPrintedHeartRateIncrease() {
		return printedHeartRateIncrease;
	}

	public void setPrintedHeartRateIncrease(double printedHeartRateIncrease) {
		this.printedHeartRateIncrease = printedHeartRateIncrease;
	}
	
	
}
