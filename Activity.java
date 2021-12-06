package activities;

public abstract class  Activity implements Icalculations  {
	private String name = "Activity";
	private int minutes=0;
	private int caloriesBurnt=0;
	private double heartRate=80;
	private double heartRateIncrease=0;
	

	
public void setMinutes(int Minutes) {
	this.minutes = Minutes;

}

public int getMinutes() {
	return minutes;
}
public void setHeartRate(double heartRate) {
	this.heartRate=heartRate;
}
public double getHeartRate() {
	return heartRate;
}

public int getCaloriesBurnt() {
	return caloriesBurnt;
}

public void setCaloriesBurnt(int caloriesBurnt) {
	this.caloriesBurnt = caloriesBurnt;
}

public double getHeartRateIncrease() {
	return heartRateIncrease;
}

public void setHeartRateIncrease(double heartRateIncrease) {
	this.heartRateIncrease = heartRateIncrease;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}







}
