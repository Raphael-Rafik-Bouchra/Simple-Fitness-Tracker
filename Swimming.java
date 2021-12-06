package activities;

public class Swimming extends Activity {
	private String name = "Swimming";

	@Override
	public void caloriesBurnt() {
		int currentCaloriesBurnt = getMinutes()*4;
		setCaloriesBurnt(currentCaloriesBurnt);
	}

	@Override
	public void heartRateIncrease() {
		int currentMinutes = getMinutes();
		if(currentMinutes > 0) {
double initialHeartRate = getHeartRate();
double newHeartRate = initialHeartRate + (initialHeartRate * getMinutes() * 0.002);
setHeartRate(newHeartRate);
setHeartRateIncrease(newHeartRate - initialHeartRate);
}
		else
			setHeartRate(0);
}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}

}
