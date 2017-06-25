package assignment;

public class Marathon {
	public static void main(String[] args) {

		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Max", "Alex", "Emma", "Jonh", "James",
				"Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };

		int bestValue = times[0];
		int bestValueID = 0;

		int secondBest = times[0];
		int secondBestID = 0;
		
		//getting the best result 
		for (int i = 0; i < names.length; i++) {
			if (bestValue > times[i]) {
				//if bestValue is better then value, then save it 
				//as the new BestValue
				bestValue = times[i]; 
				//get and save the id of the best value
				//to parse it latter
				bestValueID = i;
			}
		}

		//getting the second best result 
		//same as above
		for (int i = 0; i < names.length; i++) {
			//if i is equals the bestResult than skip it 
			//so we wont get it values to second best result
			if (i == bestValueID) {
				continue;
			//same as best result
			} else if (secondBest > times[i]) {
				secondBest = times[i];
				secondBestID = i;
			}
		}

		System.out.println(
				"The winner is " + names[bestValueID] + " with the time of " + times[bestValueID] + " minutes");
		System.out.println(
				"The second best is " + names[secondBestID] + " with the time of " + times[secondBestID] + " minutes");

	}
}
