package activities;

public class Test {
	/*public static void main(String[] args) {
		Activity [] list = new Activity[4];
		double currentHeartRate=80;
		int totalCaloriesBurnt=0;
		int i;
		
		Activity act1 = new Running();
		act1.setMinutes(5);
		act1.caloriesBurnt();
		act1.heartRateIncrease();
		totalCaloriesBurnt += act1.getCaloriesBurnt();
		currentHeartRate = act1.getHeartRate();
		list[0] = act1;
		
		Activity act2 = new Swimming();
		act2.setMinutes(4);
		act2.setHeartRate(currentHeartRate);
		act2.caloriesBurnt();
		act2.heartRateIncrease();
		totalCaloriesBurnt += act2.getCaloriesBurnt();
		currentHeartRate = act2.getHeartRate();
		list[1] = act2;
		
		Activity act3 = new KickBoxing();
		act3.setMinutes(6);
		act3.setHeartRate(currentHeartRate);
		act3.caloriesBurnt();
		act3.heartRateIncrease();
		totalCaloriesBurnt += act3.getCaloriesBurnt();
		currentHeartRate = act3.getHeartRate();
		list[2] = act3;
		
		Activity act4 = new StrengthTraining();
		act4.setMinutes(5);
		act4.setHeartRate(currentHeartRate);
		act4.caloriesBurnt();
		act4.heartRateIncrease();
		totalCaloriesBurnt += act4.getCaloriesBurnt();
		currentHeartRate = act4.getHeartRate();
		list[3] = act4;
		
		Sorting rounding = new Sorting();
		System.out.println("Total Calories Burnt =" + totalCaloriesBurnt);
		System.out.println("Total Heart Rate =" + rounding.round(currentHeartRate, 3));
		System.out.println("UnSorted:");
		
		for(i=0 ; i<list.length ; i++) {
			System.out.println(list[i].getName() + ":");
			System.out.println("Calories Burnt =" + list[i].getCaloriesBurnt());
			System.out.println("Heart Rate Increase =" + rounding.round(list[i].getHeartRateIncrease(), 3));
		}
		
		System.out.println("Sorted:");
		Activity [] sortedlist = new Activity[4];
		Sorting sort = new Sorting();
		sortedlist = sort.sortActivities(list);
		for(i=0 ; i<sortedlist.length ; i++) {
			System.out.println(sortedlist[i].getName() + ":");
			System.out.println("Calories Burnt =" + sortedlist[i].getCaloriesBurnt());
			System.out.println("Heart Rate Increase =" + rounding.round(sortedlist[i].getHeartRateIncrease(), 3));
		}
		
		
		
		
		
	


	}
	*/

}
