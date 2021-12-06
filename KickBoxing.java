package activities;

public class KickBoxing extends Activity {
	private String name = "KickBoxing";

	@Override
	public void caloriesBurnt() {
		int currentCaloriesBurnt = getMinutes()*3;
		setCaloriesBurnt(currentCaloriesBurnt);
	}

	@Override
	public void heartRateIncrease() {
		int currentMinutes = getMinutes();
		if(currentMinutes > 0) {
double initialHeartRate = getHeartRate();
double newHeartRate = initialHeartRate + (initialHeartRate * getMinutes() * 0.005);
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
