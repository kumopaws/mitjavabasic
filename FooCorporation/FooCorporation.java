public class FooCorporation {
	public static void payment(double basePay, int hours) {
		double salary = 0;
		int overtimeHours = 0;

		if (basePay > 8.0) {
			if (hours <= 40) {
				salary = basePay * hours;
				System.out.println("You will get $" + salary + "\n");
			} else if ((hours > 40) && (hours < 60)) {
				overtimeHours = hours - 40;
				hours = 40;
				salary = basePay * hours;
				salary += overtimeHours * basePay * 1.5;
				System.out.println("You will get $" + salary + "\n");
			} else {
				System.out.println("Error, your time (" + hours + ") is over 60 hours" + "\n");
			}
		} else {
			System.out.println("Error, you wage (" + basePay + ") is less than minimum of $8 per hour ,\n");
		}
	}

	public static void main(String[] args) {
		payment(7.50, 35);
		payment(8.20, 47);
		payment(10.00, 73);
	}
}
