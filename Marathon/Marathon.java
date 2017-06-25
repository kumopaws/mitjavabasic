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
		for (int i = 0; i < names.length; i++) {
			if (bestValue > times[i]) {
				bestValue = times[i];
				bestValueID = i;
			}
		}

		for (int i = 0; i < names.length; i++) {
			if (i == bestValueID) {
				continue;
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
