package activities;

public class Running extends Activity {
	private String name = "Running";
	
	
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
		double newHeartRate = initialHeartRate + (initialHeartRate * getMinutes() * 0.003);
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
