package activities;

public class StrengthTraining extends Activity {
	private String name = "StrengthTraining";

	@Override
	public void caloriesBurnt() {
		int currentCaloriesBurnt = getMinutes()*5;
		setCaloriesBurnt(currentCaloriesBurnt);
	}

	@Override
	public void heartRateIncrease() {
		int currentMinutes = getMinutes();
		if(currentMinutes > 0) {
double initialHeartRate = getHeartRate();
double newHeartRate = initialHeartRate + (initialHeartRate * getMinutes() * 0.006);
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
