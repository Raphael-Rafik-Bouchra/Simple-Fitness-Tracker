package activities;


public class Sorting {
	
	public Activity[] sortActivities(Activity list[] , int size) {
		int i;
		int j;
				for(i=0 ; i < size ; i++) {
					for(j=i+1 ; j < size ; j++) {
						if(list[i].getCaloriesBurnt() < list[j].getCaloriesBurnt() ) {
							swapActivities(list[i], list[j]);
						}
							
						else if(list[i].getCaloriesBurnt() == list[j].getCaloriesBurnt()) {
							if(list[i].getHeartRateIncrease() < list[j].getHeartRateIncrease()) {
								swapActivities(list[i], list[j]);
							}
						}
						
					}
		}
				return list;
	}
	
	private void swapActivities (Activity current , Activity next) {
		String nameTemp;
		int minutesTemp;
		int caloriesBurntTemp;
		double heartRateTemp;
		double heartRateIncreaseTemp;
		
		nameTemp = current.getName();
		minutesTemp = current.getMinutes();
		caloriesBurntTemp = current.getCaloriesBurnt();
		heartRateTemp = current.getHeartRate();
		heartRateIncreaseTemp = current.getHeartRateIncrease();
		
		current.setName(next.getName());
		current.setMinutes(next.getMinutes());
		current.setCaloriesBurnt(next.getCaloriesBurnt());
		current.setHeartRate(next.getHeartRate());
		current.setHeartRateIncrease(next.getHeartRateIncrease());
		
		next.setName(nameTemp);
		next.setMinutes(minutesTemp);
		next.setCaloriesBurnt(caloriesBurntTemp);
		next.setHeartRate(heartRateTemp);
		next.setHeartRateIncrease(heartRateIncreaseTemp);
		
	}
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}

}
